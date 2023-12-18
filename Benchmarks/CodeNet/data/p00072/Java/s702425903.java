import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int M=10000;
		for(;;)
		{
			int n=in.nextInt(),m=in.nextInt();
			if(n==0)
				return;
			int cost[][]=new int[n][n];
			int mincost[]=new int[n];//頂点iへの辺の最小コスト
			boolean use[]=new boolean[n];//頂点iが部分全域木に含まれているか
			int total=0;//answer
			for(int i=0;i<n;i++)
				Arrays.fill(cost[i], M);
			Arrays.fill(mincost, M);
			Arrays.fill(use, false);
			for(int i=0;i<n;i++)
				cost[i][i]=0;
			for(int i=0;i<m;i++)
			{
				String str[]=in.next().split(",");
				int s=Integer.valueOf(str[0]);
				int t=Integer.valueOf(str[1]);
				int c=Integer.valueOf(str[2]);
				cost[s][t]=c;
				cost[t][s]=c;
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
				total+=((mincost[v]/100)-1);
				use[v]=true;

				for(int j=0;j<n;j++)//追加した頂点と繋がっている辺を調べ最小コストを更新
				{
					if(!use[j]&&mincost[j]>cost[v][j])
						mincost[j]=cost[v][j];
				}
			}
			System.out.println(total);
		}
	}
}