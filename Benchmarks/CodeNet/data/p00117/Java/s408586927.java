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
			int m=in.nextInt();
			int M=1000000;
			int road[][]=new int[n+1][n+1];
			for(int i=0;i<=n;i++)
				Arrays.fill(road[i], M);
			for(int i=0;i<=n;i++)
				road[i][i]=0;
			for(int i=0;i<m;i++)
			{
				String s[]=in.next().split(",");
				road[Integer.valueOf(s[0])][Integer.valueOf(s[1])]=Integer.valueOf(s[2]);
				road[Integer.valueOf(s[1])][Integer.valueOf(s[0])]=Integer.valueOf(s[3]);
			}
			String va[]=in.next().split(",");
			int s=Integer.valueOf(va[0]);
			int t=Integer.valueOf(va[1]);
			int give=Integer.valueOf(va[2]);
			int cost=Integer.valueOf(va[3]);
			int ans=give-cost;
			int start=0;
			int goal=0;
			for(int I=0;I<2;I++)
			{
				int p=0;
				int leng[]=new int[n+1];// minimum distance
				int v[] = new int[n+1];// decision flag
				if(I==0)
				{
					start =s;
					goal=t;
				}
				else
				{
					start=t;
					goal=s;
				}
				for(int k=0;k<=n;k++)
				{
					leng[k]=M;
					v[k]=0;
				}
				leng[start]=0;
				for(int i=0;i<=n;i++)
				{
					int min=M;//最小の節点を探す
					for(int k=0;k<=n;k++)
					{
						if(v[k]==0&&leng[k]<min)
						{
							p=k;
							min=leng[k];
						}
					}
					v[p]=1;//確定フラグ
					for(int k=0;k<=n;k++) //pを経由してkに至長さがそれまでの最短経路より小さければ更新
					{
						if((leng[p]+road[p][k])<leng[k])
							leng[k]=leng[p]+road[p][k];
					}
				}
				ans-=leng[goal];
			}
			System.out.println(ans);
		}
	}
}