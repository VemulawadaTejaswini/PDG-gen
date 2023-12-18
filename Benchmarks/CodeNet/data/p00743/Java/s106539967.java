import java.util.*;
import static java.lang.Math.*;

public class Main {

	static final int INF = 1<<29;

	int N, start, goal;
	int[][] graph;
	int[][] limit;
	
	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			int M = in.nextInt();
			if(N==0) return;
			start = in.nextInt()-1; goal = in.nextInt()-1;
			graph = new int[N][N];
			limit = new int[N][N];
			for(int i=0; i<M; i++){
				int x,y,d,c;
				x = in.nextInt()-1; y = in.nextInt()-1; d = in.nextInt(); c = in.nextInt();
				graph[x][y] = graph[y][x] = d;
				limit[x][y] = limit[y][x] = c;
			}
			double ans = solve();
			if(ans < 0) System.out.println("unreachable");
			else System.out.printf("%.7f\n", ans);
		}
	}

	class State{
		double dist;
		int prev, cur, v;
		State(double _d, int _p, int _c, int _v){
			this.dist  = _d;
			this.prev = _p;
			this.cur = _c;
			this.v = _v;
		}
	}

	class Cmp implements Comparator<State>{
		public int compare(State a, State b){
			return a.dist>b.dist?1:a.dist<b.dist?-1:0;
		}
	}

	double solve(){
		double[][] sub = new double[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				sub[i][j] = graph[i][j]>0?(double)graph[i][j] / limit[i][j]:INF;
			}
		}
		sub[goal][goal] = 0.0;
		for(int k=0; k<N; k++)for(int i=0; i<N; i++)for(int j=0; j<N; j++)
			sub[i][j] = min(sub[i][j], sub[i][k] + sub[k][j]);
		if(sub[start][goal] == INF) return -1;
		
		double[][][] dist = new double[N][N][31];
		for(int i=0; i<N; i++)for(int j=0; j<N; j++)for(int k=0; k<31; k++)
			dist[i][j][k] = INF;
		
		PriorityQueue<State> Q = new PriorityQueue<State>(11,new Cmp())	;
		Q.add(new State(sub[start][goal], start, start, 0));
		
		while(!Q.isEmpty()){
			State tp = Q.poll();
			if(tp.cur == goal && tp.v == 1) return tp.dist;
			if(dist[tp.prev][tp.cur][tp.v] != INF) continue;
			double d = tp.dist - sub[tp.cur][goal];
			dist[tp.prev][tp.cur][tp.v] = d;
			for(int i=0; i<N; i++)if(i!=tp.prev && graph[tp.cur][i] > 0){
				for(int dv=-1;dv<=1;dv++){
					int nv = tp.v + dv;
					if(0<nv && nv<=limit[tp.cur][i] && dist[tp.cur][i][nv] == INF){
						double nd = d + (double)graph[tp.cur][i]/nv;
						Q.add(new State(nd + sub[i][goal], tp.cur, i, nv));
					}
				}
			}
		}
		return -1;
	}

	public static void main(String args[]){
		new Main().run();
	}
}