import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		char c[][]=new char[n][m];
		for(int i=0;i<n;i++)
		{
			c[i]=in.next().toCharArray();
		}
		if(c[0][0]=='#')
			System.out.println(0);
		int dp[][]=new int[n][m];
		for(int i=0;i<m;i++)
		{
			if(c[0][i]!='#')
				dp[0][i]=1;
			else
				break;
		}
		for(int i=0;i<n;i++)
		{
			if(c[i][0]!='#')
				dp[i][0]=1;
			else
				break;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				if(c[i][j]=='#')
					continue;
				dp[i][j]=(dp[i-1][j]+dp[i][j-1])%((int)Math.pow(10, 9)+7);
			}
		}
		if(dp[n-1][m-1]!=0)
			System.out.println(dp[n-1][m-1]);
		else
			System.out.println(0);
	}
}
