import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		int M=1000000;
		boolean prime[]=new boolean[M+1];
		Arrays.fill(prime,true);
		prime[0]=prime[1]=false;
		for(int i=2;i*i<=M;i++)
		{
			if(!prime[i])
				continue;
			for(int j=i*2;j<=M;j+=i)
				prime[j]=false;
		}
		int dp[][]=new int[30][M+1];
		for(;;)
		{
			int n=in.nextInt();//料理の種類
			int x=in.nextInt();//予算額
			int a[]=new int[n];
			//int dp[][]=new int[n][x+1];
			int ans=-1;
			if((n|x)==0)
				return;
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			
			for(int i=a[0];i<=x;i+=a[0])
				dp[0][i]=1;
			for(int i=0;i<n;i++)
				dp[i][0]=1;
			
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<a[i];j++)
					dp[i][j]=dp[i-1][j];
				for(int j=a[i];j<=x;j++)
				{
					dp[i][j]=(dp[i-1][j]|dp[i][j-a[i]]);
				}
			}
			for(int i=x;i>=2;i--)
			{
				if(prime[i]&&dp[n-1][i]==1)
				{
					ans=i;
					break;
				}
			}
			System.out.println(ans==-1 ? "NA" : ans);
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}