import java.util.*;

public class Main {

	int[][] graph;
	double[][] dist;
	int n, m, p, a, b;
	int[] tickets;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			n = in.nextInt();
			m = in.nextInt();
			p = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			if(n==0) return ;
			graph = new int[m+1][m+1];
			tickets = new int[n];
			dist = new double[m+1][1<<n];
			for(int i=0; i<n; i++)
				tickets[i] = in.nextInt();
			for(int i=0; i<p; i++){
				int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
				graph[x][y] = graph[y][x] = z;
			}
			double ans = solve();
			if(ans<0) System.out.println("Impossible");
			else System.out.printf("%.7f\n", ans);
		}
	}

	class Pair{
		double x;
		int a, used, visited;
		Pair(double _x, int _a, int _used, int _visited){
			this.x = _x;
			this.a = _a;
			this.used= _used;
			this.visited = _visited;
		}
		Pair(){
			new Pair(0,0,0,0);
		}
	}

	class Comp implements java.util.Comparator<Pair>{
		public int compare(Pair x, Pair y){
			return x.x>y.x?1:x.x<y.x?-1:0;
		}
	}

	double solve(){
		PriorityQueue<Pair> Q = new PriorityQueue<Pair>(11, new Comp());
		Q.add(new Pair(0,a,0,1<<a));
		while(!Q.isEmpty()){
			Pair tp = Q.poll();
			double d = tp.x;
			int cur = tp.a, u = tp.used, v = tp.visited;
			if(dist[cur][u] != 0) continue;
			dist[cur][u] = d;
			for(int i=1; i<=m; i++)if(((v>>i)&1) == 0 && graph[cur][i]!=0){
				for(int j=0; j<n; j++)if(((u>>j)&1) == 0 && dist[i][u|(1<<j)]==0){
					Q.add(new Pair(d+(double)graph[cur][i]/tickets[j], i, u|(1<<j), v|(1<<i)));
				}
			}
		}
		
		double ret = 1e9;
		for(int i=0; i<1<<n; i++)
			if(dist[b][i] > 0 && ret > dist[b][i])
				ret = dist[b][i];
		if(ret == 1e9) return -1;
		return ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}