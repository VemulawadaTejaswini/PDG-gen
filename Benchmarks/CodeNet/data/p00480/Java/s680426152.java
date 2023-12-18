import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			long dp[][]=new long[n][21];
			dp[0][a[0]]=1;
			for(int i=1;i<=n-2;i++)
			{
				for(int j=0;j<=20;j++)
				{
					int up=j+a[i];
					int down=j-a[i];
					if(up<=20)
					dp[i][up]+=dp[i-1][j];
					if(down>=0)
					dp[i][down]+=dp[i-1][j];
				}
			}
			System.out.println(dp[n-2][a[n-1]]);
		}
	}

	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}