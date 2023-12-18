

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //cities
		int m = sc.nextInt(); //trains
		int q = sc.nextInt(); //queries
		
		int[] ramp = new int[n];
		
		int[][] tr = new int[n][n];
		
		for(int i = 0; i < m; i++)
		{
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			tr[l][r]++;
			ramp[l]++;
			ramp[r]--;
		}
		
		int[][] dp = new int[n][n];
		int[][] sdp = new int[n][n]; //strict dp: strictly starts at l, ends up to r
		
		for(int l = 0; l < n; l++)
		{
			for(int r = l; r<n;r++)
			{
				if(r>0)sdp[l][r] = sdp[l][r-1];
				sdp[l][r]+=tr[l][r];
//				System.out.println("Adding tr " + l + " " + r + ": " + tr[l][r]);
			}
		}
		for(int r = n-1; r >= 0; r--)
		{
			for(int l = r; l >= 0; l--)
			{
				int cur = 0;
				if(l<n-1) cur+= dp[l+1][r];
				cur+=sdp[l][r];			
				dp[l][r] = cur;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < q; i++)
		{
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			sb.append(dp[l][r] + "\n");
		}
		System.out.print(sb);
	}

}
