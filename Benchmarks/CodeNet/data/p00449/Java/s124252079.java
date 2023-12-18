import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int M=10000000;
		for(;;)
		{
			int n=in.nextInt();
			int k=in.nextInt();
			if((n|k)==0)
				return;
			int cost[][]=new int[n+1][n+1];
			for(int i=0;i<=n;i++)
				Arrays.fill(cost[i], M);
			for(int i=0;i<=n;i++)
				cost[i][i]=0;

			for(int i=0;i<k;i++)
			{
				int ju=in.nextInt();
				if(ju==0)
				{
					int s=in.nextInt();
					int t=in.nextInt();

					int p=0;
					int v[] = new int[n+1];// decision flag
					int leng[]=new int[n+1];// minimum distance
					for(int l=0;l<=n;l++)
					{
						leng[l]=M;
						v[l]=0;
					}
					leng[s]=0;
					for(int j=0;j<=n;j++)
					{
						int min=M;//最小の節点を探す
						for(int l=0;l<=n;l++)
						{
							if(v[l]==0&&leng[l]<min)
							{
								p=l;
								min=leng[l];
							}
						}
						v[p]=1;//確定フラグ
						for(int l=0;l<=n;l++) //pを経由してlに至長さがそれまでの最短経路より小さければ更新
						{
							if((leng[p]+cost[p][l])<leng[l])
							{
								leng[l]=leng[p]+cost[p][l];
							}
						}
					}
					if(leng[t]>=M)
						System.out.println(-1);
					else
						System.out.println(leng[t]);
					}
				else if(ju==1)
				{
					int S=in.nextInt();
					int T=in.nextInt();
					int c=in.nextInt();
					if(cost[S][T]>c)
					{
						cost[S][T]=c;
						cost[T][S]=c;
					}
				}
			}
		}
	}
}