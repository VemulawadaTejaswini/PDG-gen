/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int n = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
			if((n|m|s) == 0) break;
			int[][] dp = new int[n*n+1][s+1];
			dp[0][0] = 1;
			for(int j=1;j<=m;j++) for(int i=n*n;i>=1;i--) for(int k=s;k>=j;k--) {
				dp[i][k] = ( dp[i][k] + dp[i-1][k-j] ) % 100000;
			}
			System.out.println(dp[n*n][s]);
		}
		// your code goes here
	}
}