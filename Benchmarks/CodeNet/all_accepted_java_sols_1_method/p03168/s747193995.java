import java.util.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		double [][] dp=new double [n+1][n];
		double [] p=new double [n];
		for(int i=0;i<n;i++)
		{
			p[i]=in.nextDouble();
		}
		dp[0][0]=1.0d-p[0];
		dp[1][0]=p[0];
		for(int i=1;i<n;i++)
		{
			dp[0][i]=dp[0][i-1]*(1.0000000000d-p[i]);
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n;j++)
			{
				dp[i][j]=dp[i-1][j-1]*p[j]+dp[i][j-1]*(1.0000000000d-p[j]);
			}
		}
		Double ans=0.0;
		for(int i=n/2+1;i<=n;i++)
		{
			ans=ans+dp[i][n-1];
		}
		System.out.println(ans);
	}
}
	