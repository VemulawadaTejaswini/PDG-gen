
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	double EPS = 1e-5;
	
	int n, m;
	LinkedList<E>[] edges;
	double[][][] map;

	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			if( (n|m) == 0 ) break;
			
			int s = sc.nextInt()-1;
			int g = sc.nextInt()-1;
			
			edges = new LinkedList[n];
			for(int i=0;i<n;i++) edges[i] = new LinkedList<E>();
			
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int d = sc.nextInt();
				int c = sc.nextInt();
				
				edges[a].add( new E(b, c, d));
				edges[b].add( new E(a, c, d));
			}
			
//			for(LinkedList<E> es: edges) for(E e: es) debug(e.to, e.c, e.d);
			
			double d = dijkstra(s, g);
			
			System.out.println((d<-EPS? "unreachable": d));
		}
		
	}
	
	double dijkstra(int s, int g) {
		PriorityQueue<V> que = new PriorityQueue<V>();
		
		que.add(new V(s, 0, s, 0.0));
		
		map = new double[n][31][n];
		for(double[][] a: map) for(double[] b: a) fill(b, INF);
		
		map[s][0][s] = 0.0;
		
		while(!que.isEmpty()) {
			V now = que.poll();
			
			debug(now.u, now.v, now.p, now.t, map[now.u][now.p]);
			
			if( now.u == g && now.v == 1 ) return now.t;
			if( abs( map[now.u][now.v][now.p] -now.t ) > EPS ) continue;

			for(E edge: edges[now.u]) if( edge.to != now.p ) {
				for(int dv = 1;dv>=-1;dv--) if( 0 < now.v+dv && now.v + dv<=edge.c ) {
				debug("a");
					double t = now.t + 1.0 * edge.d / (now.v+dv);
					if( t - map[edge.to][now.v+dv][now.u] < EPS ) {
						map[edge.to][now.v+dv][now.u] = t;
						que.add(new V(edge.to, now.v+dv, now.u, t));
					}
				}
			}
		}
		
		return -1;
	}
	
	class E {
		int to, c, d;
		E ( int to, int c, int d) {
			this.to = to;
			this.c = c;
			this.d = d;
		}
	}
	
	class V implements Comparable<V>{
		int u, v, p;
		double t;
		V(int u, int v, int p, double t) {
			this.u = u;
			this.v = v;
			this.p = p;
			this.t = t;
		}
		@Override
		public int compareTo(V o) {
			// TODO Auto-generated method stub
			return (t-o.t) > EPS? 1: -1;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}
}