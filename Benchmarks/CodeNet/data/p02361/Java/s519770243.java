import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {

	static class State { // →bの辺の重さw
		int b, w;
		public State(int b, int w) {
			this.b = b;
			this.w = w;
		}
	}
	static class PQ implements Comparable<PQ>{
		int now;
		long d;
		public PQ(int now, long d) {
			this.now = now;
			this.d = d;
		}
		public int compareTo(PQ p) {
			return this.d>p.d? -1:1;
		}
	}
	
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int V = sc.nextInt(); // 頂点数
			int E = sc.nextInt(); // 辺数
			int r = sc.nextInt(); // 初めの頂点
			long INF = 500000*10000+1;
			
			@SuppressWarnings("unchecked")
			List<State>[] edge = new ArrayList[V];
			for(int i=0; i<V; i++) {
				edge[i] = new ArrayList<State>();
			}
			PriorityQueue<PQ> pq = new PriorityQueue<>();
			for(int i=0; i<E; i++) {
				int s = sc.nextInt();
				int t = sc.nextInt();
				int d = sc.nextInt();
				edge[s].add(new State(t, d));
			}
			long[] dis = new long[V];
			boolean[] processed = new boolean[V];
			for(int i=0; i<V; i++) {
				dis[i] = INF;
				processed[i] = false;
			}
			
			dis[r] = 0;
			pq.add(new PQ(r, 0));
			while(! pq.isEmpty()) {
				PQ p = pq.poll();
				if(processed[p.now]) {
					continue;
				}
				processed[p.now] = true;
				for(State s : edge[p.now]) {
					if(p.d+s.w < dis[s.b]) {
						dis[s.b] = p.d + s.w;
						pq.add(new PQ(s.b, dis[s.b]));
					}
				}
			}
			for(long cost : dis) {
				if(cost >= INF)	System.out.println("INF");
				else	System.out.println(cost);
			}
		}
	}

}



