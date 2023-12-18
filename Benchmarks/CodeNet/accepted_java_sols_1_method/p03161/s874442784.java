import java.util.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(t.nextToken());
		int k = Integer.parseInt(t.nextToken());
		t = new StringTokenizer(br.readLine());
		int[] h = new int[n], dp = new int[n];
		for(int i = 0 ; i < n ; i++) h[i] = Integer.parseInt(t.nextToken());
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[n-1] = 0;
		for(int i = n-2 ; i >= 0 ; i--)
		{
		      for(int j = i+1 ; j <= Math.min(n-1,i+k) ; j++) dp[i] = Math.min(dp[i],Math.abs(h[i]-h[j])+dp[j]);
		}
		System.out.println(dp[0]);
	}
}