import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int M=10000;
		while(in.hasNext())
		{
			int n=in.nextInt(), m=in.nextInt(),K=in.nextInt();
			int minmax=0;
			int cost[][]=new int[n+1][n+1];
			for(int i=0;i<=n;i++)
				Arrays.fill(cost[i], M);
			for(int i=0;i<=n;i++)
				cost[i][i]=0;
			for(int i=0;i<m;i++)
			{
				int a=in.nextInt(),b=in.nextInt(),l=in.nextInt();
				cost[a][b]=l;
				cost[b][a]=l;
			}
			while(K-->0)
			{
				int mool=in.nextInt();
				int leng[]=new int[11];// minimum distance
				int v[] = new int[11];// decision flag
				for(int I=1;I<=n;I++)
				{
					int p=0;
					int start =I;
					for(int k=1;k<=n;k++)
					{
						leng[k]=M;
						v[k]=0;
					}
					leng[start]=0;
					for(int j=1;j<=n;j++)
					{
						int min=M;//最小の節点を探す
						for(int k=1;k<=n;k++)
						{
							if(v[k]==0&&leng[k]<min)
							{
								p=k;
								min=leng[k];
							}
						}
						v[p]=1;//確定フラグ
						for(int k=1;k<=n;k++) //pを経由してkに至長さがそれまでの最短経路より小さければ更新
							leng[k]=Math.min(leng[p]+cost[p][k], leng[k]);
					}
					for(int i=1;i<=n;i++)
						minmax=Math.max(minmax, leng[mool]);
				}
			}
			System.out.println(minmax);
		}
	}
}