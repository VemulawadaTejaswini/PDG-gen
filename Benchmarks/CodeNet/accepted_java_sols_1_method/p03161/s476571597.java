/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] dp = new int[n];
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		dp[0] = 0;
		int j;
		for(int i = 1; i<n; i++){
			j = i;
			dp[i] = Integer.MAX_VALUE;
			while(j>0 && j>i-k){
				dp[i] = Math.min(Math.abs(arr[i]-arr[j-1]) + dp[j-1], dp[i]);
				j--;
			}
		}
		
		// System.out.println(Arrays.toString(dp));
		
		System.out.println(dp[n-1]);
	}
}