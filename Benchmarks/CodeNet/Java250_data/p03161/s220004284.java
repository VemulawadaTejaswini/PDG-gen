/*package whatever //do not write package name here */

import java.io.*;
import java.lang.Math; 
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
		
		int[] dp = new int[n];
		dp[1] = Math.abs(arr[0]-arr[1]);
		
		for(int i = 2; i < n; i++ ){
		    dp[i] = Integer.MAX_VALUE;
		    for(int j = 1; j <= k; j++){
		        if(i-j >= 0){
		            dp[i] = Math.min(dp[i],dp[i-j]+Math.abs(arr[i-j]-arr[i]));
		        }
		    }
		}
		System.out.println(dp[n-1]);
		
	}
}