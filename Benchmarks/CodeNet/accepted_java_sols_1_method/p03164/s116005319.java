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
		int s = 0;
		for(int i = 1 ; i <= n ; i++)
		{
		      t = new StringTokenizer(br.readLine());
		      w[i] = Integer.parseInt(t.nextToken());
		      v[i] = Integer.parseInt(t.nextToken());
		      s += v[i];
		}
		long[] dp = new long[s+1];
		Arrays.fill(dp, (long)1e12);
		dp[0] = 0;
		for(int i = 1 ; i < n+1 ; i++)
		{
		      long min = (long)1e12;
		      int pos = 0;
		      for(int j = s ; j >= 1 ; j--)
		      {
		            if(j < v[i]) continue;
		            dp[j] = Math.min(dp[j] , dp[j-v[i]]+w[i]); 
		      }
		}
		for(int i = s ; i >= 0 ; i--)
		{
		      if(dp[i] <= W)
		      {
		            System.out.println(i);
		            break;
		      }
		}
	}
}