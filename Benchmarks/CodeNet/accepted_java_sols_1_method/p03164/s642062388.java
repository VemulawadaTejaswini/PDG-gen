import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int t,i;	
		int n=sc.nextInt();
		int w=sc.nextInt();
		long dp[][]=new long[n+1][100001];
		int v[][]=new int[n+1][2];
		for(i=1;i<=n;i++)
		{
			v[i][0]=sc.nextInt();
			v[i][1]=sc.nextInt();
		}
		Arrays.fill(dp[0], Integer.MAX_VALUE);
		dp[0][0]=0;
		long ans=0;
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=100000;j++)
			{
				int wc=v[i][1];
				if(j<wc)
					dp[i][j]=dp[i-1][j];
				else
					dp[i][j]=Math.min(dp[i-1][j], v[i][0]+dp[i-1][j-wc]);
				if(dp[i][j]<=w)
					ans=j;
			}
		}
		System.out.println(ans);
	}
}