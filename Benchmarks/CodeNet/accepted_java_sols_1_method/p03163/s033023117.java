import java.util.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(t.nextToken());
		int W = Integer.parseInt(t.nextToken());
		int[] w = new int[n+1], v = new int[n+1];
		for(int i = 1 ; i <= n ; i++)
		{
		      t = new StringTokenizer(br.readLine());
		      w[i] = Integer.parseInt(t.nextToken());
		      v[i] = Integer.parseInt(t.nextToken());
		}
		long[][] dp = new long[n+1][W+1];
		dp[0][0] = 0;
		for(int i = 0 ; i < W+1 ; i++) dp[0][i] = 0;
		for(int i = 1 ; i < n+1 ; i++)
		{
		      for(int j = 1 ; j < W+1 ; j++)
		      {
		            if(j-w[i] < 0) dp[i][j] = dp[i-1][j];
		            else dp[i][j] = Math.max(dp[i-1][j-w[i]]+v[i],dp[i-1][j]);
		      }
		}
		System.out.println(dp[n][W]);
	}
}