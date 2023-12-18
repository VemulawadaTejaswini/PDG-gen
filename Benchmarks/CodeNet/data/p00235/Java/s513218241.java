import java.util.Scanner;
public class Main
{
	static int cost[][];
	static int n;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			n=in.nextInt();
			if(n==0)
				return;
			cost=new int[n+1][n+1];
			int ans=0;
			for(int i=0;i<n-1;i++)
			{
				int a=in.nextInt();
				int b=in.nextInt();
				int c=in.nextInt();
				cost[a][b]=cost[b][a]=c;
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(cost[i][j]>0)
						ans+=cost[i][j];
				}
			}
			for(int i=2;i<=n;i++)
			{
				int reaf=0;
				int ii=0,jj=0;
				for(int j=2;j<=n;j++)
				{

					if(cost[i][j]>0)
					{
						reaf++;
						ii=i;
						jj=j;
					}
				}
				if(reaf==1)
				{
					ans-=cost[ii][jj]*2;
					cost[ii][jj]=cost[jj][ii]=0;
				}
			}
			System.out.println(ans-max(1));
		}
	}
	static int max(int m)
	{
		int cut=0;
		for(int i=2;i<=n;i++)
		{
			if(cost[m][i]>0)
			{
				cost[i][m]=0;
				cut=Math.max(cut, cost[m][i]+max(i));
			}
		}
		return cut;
	}
}