/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package here;

/**
 *
 * @author sokumar
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = sc.nextInt();
        int w1 = sc.nextInt();
        long [][]dp = new long[n+1][w1+1];
        
        
        long []val = new long[n+1];
        int []we = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            we[i] = sc.nextInt();
            val[i] = sc.nextInt();
            
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=w1;j++)
            {
                if(we[i] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-we[i]]+val[i]);
            }
        }
        w.println(dp[n][w1]);
        
        w.close();
    }
    
}
