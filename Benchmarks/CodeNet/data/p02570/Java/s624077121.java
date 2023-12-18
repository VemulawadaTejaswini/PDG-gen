/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package AtCoder;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

/**
 *
 * @author Jagmohan Mandre
 */
class Problem1 {
   public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
         try {
          int D = sc.nextInt();
          int T = sc.nextInt();
          int S = sc.nextInt();
          if(D / S <= T){
              System.out.println("YES");
          } else {
              System.out.println("NO");
          }
        } catch (Exception e) {
            return;
        }
    }
}
