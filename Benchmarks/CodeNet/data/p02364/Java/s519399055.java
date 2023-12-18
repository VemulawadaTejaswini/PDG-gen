import java.awt.geom.Point2D;
import java.util.*;


public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ_GRL_2();
	}

	class AOJ_GRL_2{
		int cost[][]; //コスト
		int d[];//使用済み頂点群からの最短距離
		boolean used[];//既に使用されたかのフラグ
		int V;//頂点数
		int INF;
		int cnt;//答え
		void Prim(int s){//任意の頂点
			d = new int[V];
			used = new boolean[V];
			INF = Integer.MAX_VALUE;
			Arrays.fill(used, false);
			Arrays.fill(d,INF);
			d[s] = 0;
			cnt = 0;
			ArrayList<Integer> using = new ArrayList<Integer>();
			while(true){
				int v=-1;
				for(int u=0;u<V;u++){//まだ使われていない頂点のうち最小のものを探す
					if(!used[u]&&(v==-1||d[u]<d[v]))v=u;
				}
				if(v==-1)break;
				used[v]=true;
				using.add(v);
//				System.out.println(v);
				cnt+=d[v];
				Arrays.fill(d,INF);
				
				for(int i=0;i<using.size();i++)for(int k=0;k<V;k++)if(!used[k]&&cost[using.get(i)][k]!=0){
					d[k] = Math.min(cost[using.get(i)][k], d[k]);
				}
//				for(int i=0;i<d.length;i++)System.out.print(d[i]+" ");
//				System.out.println();
			}
		}

		public AOJ_GRL_2() {
			V = in.nextInt();
			int n = in.nextInt();
			cost = new int[V][V];
			for(int i=0;i<n;i++){
				int s = in.nextInt();
				int t = in.nextInt();
				int w = in.nextInt();
				cost[s][t] = w;
				cost[t][s] = w;
			}
			Prim(0);
			System.out.println(cnt);
		}
	}

}