import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int M=10000000;
		for(;;)
		{
			int n=in.nextInt(),m=in.nextInt();
			int s=in.nextInt(),g1=in.nextInt(),g2=in.nextInt();
			if((n|m|s|g1|g2)==0)
				return;
			int cost[][]=new int[n+1][n+1];
			int war[][]=new int[n+1][n+1];
			int ans=M;
			for(int i=0;i<=n;i++)
			{
				Arrays.fill(cost[i], M);
				Arrays.fill(war[i], M);
			}
			for(int i=0;i<=n;i++)
			{
				cost[i][i]=0;
				war[i][i]=0;
			}
			for(int i=0;i<m;i++)
				cost[in.nextInt()][in.nextInt()]=in.nextInt();
			for(int i=0;i<=n;i++)
				for(int j=0;j<=n;j++)
					war[i][j]=cost[i][j];
			for (int i=0;i<=n;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<n;k++)
					{
						//j->kへ行くのにiを経由した方が良いかどうか
						int c=war[j][i]+war[i][k];
						if (c<war[j][k]) 
							war[j][k]=c;
					}
				}
			}
			for(int i=0;i<=n;i++)
			ans=Math.min(ans, war[s][i]+war[i][g1]+war[i][g2]);	
			System.out.println(ans);
		}
	}
}