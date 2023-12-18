package com.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String is = r.readLine();
        String[] sp = is.split(" ");

        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int c = Integer.parseInt(sp[2]);
        int count=0;
        for(int i=a; i<=b; i++){
        	if(c%i==0)
        		count++;
        }
        System.out.println(count);
    }
}