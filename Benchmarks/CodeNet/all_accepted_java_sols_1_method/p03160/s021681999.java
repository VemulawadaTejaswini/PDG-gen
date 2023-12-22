/*package whatever //do not write package name here */

import java.io.*;
import java.lang.Math; 
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
		
		int[] dp = new int[n];
		dp[1] = Math.abs(arr[0]-arr[1]);
		
		for(int i = 2; i < n; i++ ){
		    dp[i] = Math.min(dp[i-1]+Math.abs(arr[i-1]-arr[i]),dp[i-2]+Math.abs(arr[i-2]-arr[i]));
		}
		System.out.println(dp[n-1]);
		
	}
}