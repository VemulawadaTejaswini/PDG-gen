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
		
		String[] in = br.readLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int k = Integer.parseInt(in[1]);
		
// 		StringBuilder str = new StringBuilder();
		
		in = br.readLine().split(" ");
		int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(in[i]);
        }
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = dp[0]+Math.abs(arr[0]-arr[1]);
        for(int i=2;i<n;i++){
            dp[i] = Integer.MAX_VALUE;
            int curr = i;
            for(int j=1;j<=k && curr>=1;j++,curr--){
                dp[i] = Math.min(dp[i-j]+Math.abs(arr[i-j]-arr[i]),dp[i]);
            }
        }
        System.out.println(dp[n-1]);
	}
}
