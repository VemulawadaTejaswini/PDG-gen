/*package whatever //do not write package name here */

import java.io.*;
import java.lang.Math; 
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] act = new int[3][n];
		
		for(int i = 0; i < n; i++){
		    act[0][i] = scan.nextInt();
		    act[1][i] = scan.nextInt();
		    act[2][i] = scan.nextInt();
		}
		
		int[][] dp = new int[3][n];
		dp[0][0] = act[0][0];
		dp[1][0] = act[1][0];
		dp[2][0] = act[2][0];
		
		for(int i = 1; i < n; i++ ){
		    dp[0][i] = act[0][i] + Math.max(dp[1][i-1],dp[2][i-1]);
		    dp[1][i] = act[1][i] + Math.max(dp[0][i-1],dp[2][i-1]);
		    dp[2][i] = act[2][i] + Math.max(dp[0][i-1],dp[1][i-1]);
		}
		int max = Math.max(dp[0][n-1],Math.max(dp[1][n-1],dp[2][n-1]));
		System.out.println(max);
		
	}
}