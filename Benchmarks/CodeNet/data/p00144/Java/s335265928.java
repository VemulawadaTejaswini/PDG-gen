import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			int root[][]=new int[n+1][n+1];
			for(int i=0;i<=n;i++)
				Arrays.fill(root[i], 10000);
			for(int i=0;i<n;i++)
			{
				int r=in.nextInt();
				int k=in.nextInt();
				for(int j=0;j<k;j++)
					root[r][in.nextInt()]=1;
			}
			for(int i=0;i<=n;i++)
				root[i][i]=0;
			for (int i=1;i<=n;i++)//ワーシャルフロイド
				for(int j=1;j<=n;j++)
					for(int k=1;k<=n;k++)
					{
						//j->kへ行くのにiを経由した方が良いかどうか
						int c=root[j][i]+root[i][k];
						root[j][k]=Math.min(root[j][k],c);
					}
			int p=in.nextInt();
			for(int i=0;i<p;i++)
			{
				int s=in.nextInt(),t=in.nextInt();
				int TTL=in.nextInt();
				int min=root[s][t]+1;
				System.out.println(min<=TTL ? min:"NA");
			}
		}
	}
}