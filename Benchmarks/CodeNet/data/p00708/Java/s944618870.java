import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		double M=1000000;
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			double x[]=new double[n];
			double y[]=new double[n];
			double z[]=new double[n];
			double r[]=new double[n];
			double cost[][]=new double[n][n];
			double mincost[]=new double[n];//頂点iへの辺の最小コスト
			boolean use[]=new boolean[n];//頂点iが部分全域木に含まれているか
			double total=0;//answer
			for(int i=0;i<n;i++)
				Arrays.fill(cost[i], M);
			Arrays.fill(mincost, M);
			Arrays.fill(use, false);
			for(int i=0;i<n;i++)
				cost[i][i]=0;
			for(int i=0;i<n;i++)
			{
				x[i]=in.nextDouble();
				y[i]=in.nextDouble();
				z[i]=in.nextDouble();
				r[i]=in.nextDouble();
			}
			for(int i=0;i<n;i++)
				for(int j=i+1;j<n;j++)
				{
					if(i==j)
						continue;
					double dif=Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j])+(z[i]-z[j])*(z[i]-z[j]));
					if(dif<=r[i]+r[j])
						cost[i][j]=cost[j][i]=0;
					else
						cost[i][j]=cost[j][i]=dif-(r[i]+r[j]);
				}
			mincost[0]=0;
			for(;;)
			{
				int v=-1;//追加する頂点				
				for(int j=0;j<n;j++)//追加する頂点を探す
					if(!use[j]&&(v==-1||mincost[v]>mincost[j]))
						v=j;
				if(v==-1) //全ての頂点を選んだ
					break;
				if(mincost[v]!=0)
					total+=mincost[v];
				use[v]=true;
				for(int j=0;j<n;j++)//追加した頂点と繋がっている辺を調べ最小コストを更新
				{
					if(!use[j]&&mincost[j]>cost[v][j])
						mincost[j]=cost[v][j];
				}
			}
			System.out.printf("%.3f\n",total);
		}
	}
}