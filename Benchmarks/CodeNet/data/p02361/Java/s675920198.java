import java.util.*;

public class Main {
	static long[] dist;
	static long INF = 100000000000000000L;
	static ArrayList<ArrayList<Edge>> adj;
	
	static class Edge {
		int to;
		long w;
		Edge(int _to, long _w) {
			this.to = _to;
			this.w = _w;
		}
		
		@Override
		public String toString() {
			return "(to=" + to + ", w=" + w + ")";
		}
		
	}
	
	static class NextNode {
		int id;
		long cost;
		NextNode(int _id, long _cost) {
			id = _id; cost = _cost;
		}
	}
	
	static void initG(int V) { // V: the number of vertexes
		for(int i=0; i<V; i++) {
			adj.add(new ArrayList<Edge>());
		}
	}

	static void dijkstra(int s) {
		Arrays.fill(dist, INF);
		dist[s] = 0;
		PriorityQueue<NextNode> pq = new PriorityQueue<NextNode>(new Comparator<NextNode>() {
			public int compare(NextNode n1, NextNode n2) {
				if(n1.cost > n2.cost) return 1;
				else if(n1.cost==n2.cost) return 0;
				else return -1;
			}
		});
		pq.add(new NextNode(s, 0));
		while(!pq.isEmpty()) {
			NextNode cn = pq.poll();
			if(cn.cost > dist[cn.id]) continue;
			for(Edge e : adj.get(cn.id)) {
				if(cn.cost + e.w < dist[e.to]) {
					dist[e.to] = cn.cost + e.w;
					pq.add(new NextNode(e.to, dist[e.to]));
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int r = sc.nextInt();
		dist = new long[V];
		adj = new ArrayList<ArrayList<Edge>>(V);
		initG(V);
		for(int i=0; i<E; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			adj.get(s).add(new Edge(t, d));
		}
		sc.close();
		dijkstra(r);
		for(int i=0; i<V; i++) {
			if(dist[i] == INF) {
				System.out.println("INF");
			} else {
				System.out.println(dist[i]);
			}
		}
	}
	
}

