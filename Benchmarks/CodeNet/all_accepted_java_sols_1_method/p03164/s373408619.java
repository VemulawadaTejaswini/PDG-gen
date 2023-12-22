import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long inf=1000;inf*=inf;inf*=inf;

		int n = sc.nextInt();
		long w_max = sc.nextLong();
		int[] w = new int[n+1];
		int[] v = new int[n+1];
		int sum_vals=0;
		for(int i=1;i<=n;i++)
		{
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			sum_vals+=v[i];
		}
		long[][] dp = new long[n+1][sum_vals+1];
		//dp[i][j] = w ;  w is the min weight with which
		// you can get total value j using the first
		// i items...
		for(int i=0;i<=sum_vals;i++)
		{
			dp[0][i]=inf;
		}
		for(int i=0;i<=n;i++)
		{
			dp[i][0]=0;
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum_vals;j++)
			{
				if(v[i]<=j)
				{
					dp[i][j]=Math.min(w[i]+dp[i-1][j-v[i]]
						, dp[i-1][j]); 
				}
				else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		// for(int i=0;i<=n;i++)
		// {
		// 	for(int j=0;j<=sum_vals;j++)
		// 		System.out.printf(dp[i][j]+" ");
		// 	System.out.printf("\n");
		// }
		long ans=0;
		for(int i=0;i<=sum_vals;i++)
			if(dp[n][i]<=w_max)
				ans=Math.max(ans,i);
		System.out.println(ans);





	}
}