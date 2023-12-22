import java.util.*;
public class Main
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
				String st=sc.next();
          for(int j=0;j<m;j++)
          {
              //System.out.println(ch);
            char ch=st.charAt(j);
				if(ch=='.')
					a[i][j]=1;
				else 
					a[i][j]=-1;
          }
		}
		long dp[][]=new long[n][m];
		dp[0][0]=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==-1)
					dp[i][j]=0;
				else
				{
					if(i-1>=0)
						dp[i][j]+=dp[i-1][j];
					if(j-1>=0)
						dp[i][j]+=dp[i][j-1];
                  dp[i][j]%=1000000007;
				}
			}
		}
		System.out.println(dp[n-1][m-1]);
	}
}

