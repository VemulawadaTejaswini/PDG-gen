import java.util.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer t = new StringTokenizer(br.readLine());
		int[] h = new int[n];
		for(int i = 0 ; i < n ; i++) h[i] = Integer.parseInt(t.nextToken());
		int[] dp = new int[n];
		dp[n-1] = 0;
		dp[n-2] = Math.abs(h[n-1] - h[n-2]);
		for(int i = n-3 ; i >= 0 ; i--)
		      dp[i] = Math.min(Math.abs(h[i]-h[i+1])+dp[i+1],Math.abs(h[i]-h[i+2])+dp[i+2]);
		System.out.println(dp[0]);
	}
}