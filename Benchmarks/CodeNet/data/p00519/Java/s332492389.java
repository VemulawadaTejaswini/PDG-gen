
import java.lang.reflect.Array;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0596().doIt();
	}
	
	class AOJ0596{
		boolean isGo[][];
		int n,k;
		Taxi taxi[];
		int[][] c;
		int d[];//頂点sからの最短距離
		boolean used[];//素手に使用されたかのフラグ
		int V;//頂点数
		int INF;

		void dijkstra(int s){
			V = n;
			INF = Integer.MAX_VALUE;
			d = new int[V];
			used = new boolean[V];
			Arrays.fill(d,INF);
			Arrays.fill(used, false);
			d[s] = 0;
			while(true){
				int v=-1;
				for(int u=0;u<V;u++){//まだ使われていない頂点のうち最小のものを探す
					if(!used[u]&&(v==-1||d[u]<d[v]))v=u;
				}
				if(v==-1)break;
				used[v]=true;
				for(int u=0;u<V;u++)if(c[v][u]!=-1){
					d[u] = Math.min(d[u],d[v]+c[v][u]);
				}
			}
		}
		
		void doIt(){
			n = in.nextInt();
			k = in.nextInt();
			taxi = new Taxi[n];
			for(int i=0;i<n;i++)taxi[i] = new Taxi(in.nextInt(), in.nextInt());
			isGo = new boolean[n][n];
			
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<n;i++)list.add(new ArrayList<Integer>());
			c = new int[n][n];
			for(int i=0;i<k;i++){
				int a = in.nextInt()-1;
				int b = in.nextInt()-1;
				isGo[a][b] = isGo[b][a] = true;
				list.get(a).add(b);
				list.get(b).add(a);
			}
			for(int i=0;i<n;i++){
				Arrays.fill(c[i], -1);
				LinkedList<Integer> q = new LinkedList<Integer>();
				q.add(i);q.add(0);
				while(q.size()>0){
					int a = q.remove();
					int cost = q.remove();
					if(cost>taxi[i].road)continue;
					if(cost<=taxi[i].road)c[i][a] = cost;
					for(int s=0;s<list.get(a).size();s++){
						if(c[i][list.get(a).get(s)]>=0)continue;
						q.add(list.get(a).get(s));
						q.add(cost+1);
					}
				}
			}
			for(int i=0;i<n;i++)for(int s=0;s<n;s++)if(c[i][s]>0)c[i][s] = taxi[i].kin;
//			for(int i=0;i<n;i++){
//				for(int s=0;s<n;s++)System.out.print(c[i][s]+" ");
//				System.out.println();
//			}
			dijkstra(0);
			System.out.println(d[n-1]);
		}
		class Taxi{
			int kin;
			int road;
			public Taxi(int kin,int road) {
				this.kin = kin;
				this.road = road;
			}
		}
	}

}