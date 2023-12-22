
// package com.company;

import java.util.*;
import java.io.*;

public class Main {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        String ans = "";
        int x = input.nextInt();
        int y = input.nextInt();
        int s = input.nextInt();

        while (x != 0 || y!= 0 || s != 0) {
            int max = 0;
        
            for (int ax = 1; ax <= s/2; ax++) {
                int bx = s - ax;
                // double vat = (double) (100 + x) / 100;
                int a = (int) Math.ceil((double) ax / (100 + x) * 100 );
                int b = (int) Math.ceil((double) bx / (100 + x) * 100);
                
                // int axx = (int) Math.floor(a * vat);
                // int bxx = (int) Math.floor(b * vat);
                int ss =(int) (Math.floor((double) a * (100 + x) / 100) + Math.floor((double) b * (100 + x) / 100));
                // int ss = axx + bxx;

                // System.out.println("ss = " + ss) ;
                if (ss != s) continue;

                int ay = (int) Math.floor(a * (100 + y) / 100);
                int by = (int) Math.floor(b * (100 + y) / 100);
                int sum = ay + by;
                
                // System.out.println("ax = " + ax + " bx = " + bx + " sum = " + (ax + bx)) ;
                // System.out.println("a = " + a + " b = " + b + " sum = " + (a + b)) ;
                // System.out.println("ay = " + ay + " by = " + by + " sum = " + (ay + by)) ;
                max = Math.max(max, sum);
            }
            
            ans += max + "\n";

            x = input.nextInt();
            y = input.nextInt();
            s = input.nextInt();
        }
        
        System.out.println(ans.trim());
    }
}
