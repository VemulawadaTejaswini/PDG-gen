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
			while(true){
				int v=-1;
				for(int u=0;u<V;u++){//まだ使われていない頂点のうち最小のものを探す
					if(!used[u]&&(v==-1||d[u]<d[v]))v=u;
				}
				if(v==-1)break;
				used[v]=true;
				
				int a = d[v]/100;
				if(a>0)a--;
				cnt+=a;
				
				for(int k=0;k<V;k++)if(!used[k]&&cost[v][k]!=0){
					d[k] = Math.min(cost[v][k], d[k]);
				}
			}
		}

		public AOJ_GRL_2() {
			while(true){
				V = in.nextInt();
				cost = new int[V][V];
				if(V==0)break;
				int n = in.nextInt();
				for(int i=0;i<n;i++){
					String input[] = in.next().split(",");
					int a = Integer.parseInt(input[0]);
					int b = Integer.parseInt(input[1]);
					int c = Integer.parseInt(input[2]);
					cost[a][b] = c;
					cost[b][a] = c;
				}
				Prim(0);
				System.out.println(cnt);
			}
		}
	}

}