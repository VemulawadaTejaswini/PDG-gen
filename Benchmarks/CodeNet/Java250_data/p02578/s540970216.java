//package com.company;
import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Main {

    static class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner()  {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }


    }

    public static void main(String[] args) throws IOException {

        FastScanner input = new FastScanner();
        Scanner in = new Scanner(System.in);

           int n = input.nextInt();
           int a[] = new int[n];
           long ans = 0 ;
           for( int i = 0 ; i < n ; i++ ){
               a[i] = input.nextInt();
               if( i > 0 ){
                   if( a[i] < a[i-1]){
                       ans += Math.abs(a[i]-a[i-1]);
                       a[i] = a[i-1];
                   }
               }
           }
           System.out.println(ans);




    }
}