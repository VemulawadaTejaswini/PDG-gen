package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(new String(in.readLine()));
            for (int i = 0; i < a * 2; i += 2) {
                BigInteger left = new BigInteger(in.readLine()),
                        right = new BigInteger(in.readLine());
                System.out.println(left.add(right));
            }
        } catch (IOException e) {}
    }
}