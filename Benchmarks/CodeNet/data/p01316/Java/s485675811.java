import java.util.Scanner;
public class Main
{
	int N,M;
	int[] C,x;
	int[][] dp;
	public int dfs(int now,int prev)
	{
		if(now >= N)return 0;
		if(dp[now][prev + 255] != Integer.MIN_VALUE)return dp[now][prev + 255];
		int ret = Integer.MAX_VALUE;
		for(int i = 0;i < M;i++)
		{
			int next = prev + C[i];
			if(next < 0)next = 0;
			if(next > 255)next = 255;
			ret = Math.min(ret,dfs(now + 1,next) + (x[now] - next)*(x[now] - next));
		}
		dp[now][prev + 255] = ret;
		return dp[now][prev + 255];
	}
	public void solve()
	{
		Scanner cin = new Scanner(System.in);
		while(true)
		{
			N = cin.nextInt();
			M = cin.nextInt();
			if(N == 0 && M == 0)break;
			C = new int[M];
			x = new int[N];
			dp = new int[N + 1][600];
			for(int i = 0;i < M;i++)C[i] = cin.nextInt();
			for(int i = 0;i < N;i++)x[i] = cin.nextInt();
			for(int i = 0;i <= N;i++)
			{
				for(int j =0;j < 600;j++)
				{
					dp[i][j] = Integer.MIN_VALUE;
				}
			}
			System.out.println(dfs(0,128));
		}
		
		
	}
	public static void main(String[] args)
	{
		new Main().solve();
	}
}