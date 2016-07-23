package com.stulsoft;

import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.NodeJS;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Object;

import java.io.File;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        final NodeJS nodeJS = NodeJS.createNodeJS();
        final V8Object test = nodeJS.require(new File("d:\\My Documents D\\Stulsoft\\pj2v8\\pj2v8n\\index.js"));
        test.executeJSFunction("hello");

        while (nodeJS.isRunning()) {
            nodeJS.handleMessage();
        }
        test.release();
        nodeJS.release();
    }
}
