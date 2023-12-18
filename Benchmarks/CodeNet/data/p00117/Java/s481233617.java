import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){		
		new AOJ0117();
	}
	
	class AOJ0117{
		int cost[][]; //コスト
		int d[];//頂点sからの最短距離
		boolean used[];//素手に使用されたかのフラグ
		int V;//頂点数
		int INF;
		
		void dijkstra(int s){
			//list = new int[V];前の頂点を保存したいとき
			d = new int[V+1];
			used = new boolean[V+1];
			Arrays.fill(d,INF);
			Arrays.fill(used, false);
			d[s] = 0;
			while(true){
				int v=-1;
				for(int u=0;u<=V;u++){//まだ使われていない頂点のうち最小のものを探す
					if(!used[u]&&(v==-1||d[u]<d[v]))v=u;
				}
				if(v==-1)break;
				used[v]=true;
				for(int u=0;u<=V;u++){
					d[u] = Math.min(d[u],d[v]+cost[v][u]);
//					if(d[u]>d[v]+cost[v][u]){   前の頂点を保存したい時は更新された時に
//						d[u]=d[v]+cost[v][u];
//						list[u] = v;
//					}
				}
			}
		}
		
		
		public AOJ0117() {
			INF = Integer.MAX_VALUE/2;
			V = in.nextInt();
			int m = in.nextInt();
			cost = new int[V+1][V+1];//[from][to]
			for(int i=0;i<=V;i++)Arrays.fill(cost[i],Integer.MAX_VALUE/2);
			for(int i=0;i<m;i++){
				String input[] = in.next().split(",");
				cost[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = Integer.parseInt(input[2]);
				cost[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = Integer.parseInt(input[3]);
			}
			String input[] = in.next().split(",");
			int start = Integer.parseInt(input[0]),goal = Integer.parseInt(input[1]);
			int money = Integer.parseInt(input[2]),hasira = Integer.parseInt(input[3]);
			dijkstra(start);
			int result = d[goal];
			dijkstra(goal);
			result += d[start];
			System.out.println(money-(result+hasira));
		}
	}
	

	class AOJ2503{
		int MAX = 0;
		public AOJ2503() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();

			int[][] cost = new int[n][n];

			int[] dp = new int[n];
			for(int i=0;i<n*n;i++){
				cost[i/n][i%n]=MAX;
			}
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b]=in.nextInt();
			}	
			//			TODO 一番大きいパスを0のポイントからn-1のポイントまでの

			for(int s=1;s<n;s++){
				for(int i=0;i<=s;i++){
					if(cost[i][s]==MAX)continue;
					dp[s]=Math.max(dp[s],dp[i]+cost[i][s]);
				}
			}
			for(int s=0;s<n;s++)for(int i=0;i<n;i++){
				if(cost[s][i]==MAX)continue;
				dp[i]=Math.max(dp[s]+cost[s][i],dp[i]);
			}
			for(int i=0;i<n;i++)System.out.print(dp[i]+" ");
			System.out.println();
			System.out.println(dp[n-1]);
		}
	}
}