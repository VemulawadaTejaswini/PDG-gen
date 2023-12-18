/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder str = new StringBuilder();
		String[] in = br.readLine().split(" ");
		int[] arr = new int[n];
// 		while(t--!=0){
		    
// 		}
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(in[i]);
        }
        int curr = n-1;
        int ans = 0;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = dp[0]+Math.abs(arr[0]-arr[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.min(dp[i-2]+Math.abs(arr[i-2]-arr[i]),dp[i-1]+Math.abs(arr[i-1]-arr[i]));
        }
        System.out.println(dp[n-1]);
	}
}
