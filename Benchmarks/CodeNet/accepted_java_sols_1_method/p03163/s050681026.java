/*package whatever //do not write package name here */

import java.io.*;
import java.lang.Math; 
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int w = scan.nextInt();
		int[] val = new int[n];
		int[] wt = new int[n];
		
		for(int i = 0; i < n; i++){
		    wt[i] = scan.nextInt();
		    val[i] = scan.nextInt();
		}
		
		long[][] dp = new long[n+1][w+1];
		
		for(int i = 1; i <= n; i++){
		    for(int j = 0; j <= w; j++){
		        if(j>=wt[i-1]){
		            dp[i][j] = val[i-1]+dp[i-1][j-wt[i-1]];
		        }
		        dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
		        //System.out.println(i+" "+j+" "+dp[i][j]);
		    }
		}
		System.out.println(dp[n][w]);
		
	}
}