import java.util.Scanner;
public class Main
{
	static int h,w;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int dx[]={1,0,-1,0};
		int dy[]={0,1,0,-1};
		int M=1000000;
		for(;;)
		{
			w=in.nextInt();
			h=in.nextInt();
			if((w|h)==0)
				return;
			int field[][]=new int[h][w];
			int cost[]=new int[4];
			for(int i=0;i<h;i++)
				for(int j=0;j<w;j++)
					field[i][j]=in.nextInt();
			for(int i=0;i<4;i++)
				cost[i]=in.nextInt();

			int dp[][][]=new int[h][w][4];//現在置と向いてる方向
			boolean visit[][][]=new boolean[h][w][4];
			visit[0][0][0]=true;

			for(int i=0;i<h;i++)
				for(int j=0;j<w;j++)
					for(int k=0;k<4;k++)
						dp[i][j][k]=M;
			dp[0][0][0]=0;
			for(;;)
			{
				boolean flag=false;
				for(int i=0;i<h;i++)
					for(int j=0;j<w;j++)
						for(int k=0;k<4;k++)
						{
							if(!visit[i][j][k])
								continue;
							for(int l=0;l<4;l++)
							{
								int addcost=cost[l];
								int nextk=k;
								if(field[i][j]==l)
									addcost=0;
								nextk=(k+l)%4;
								int nexth=i+dy[nextk];
								int nextw=j+dx[nextk];
								if(inner(nexth,nextw))
								{
									if(dp[nexth][nextw][nextk]>dp[i][j][k]+addcost)
									{
										dp[nexth][nextw][nextk] = dp[i][j][k] + addcost;
										flag=visit[nexth][nextw][nextk]=true;
									}
								}
							}
						}
				if(!flag)
					break;
			}
			int ans=M; 
			for(int k=0;k<4;k++) 
				ans= Math.min(ans, dp[h-1][w-1][k]);
			System.out.println(ans);
		}
	}

	static boolean inner(int y,int x)
	{
		return x>=0 && y>=0 && x<w && y<h;
	}
}