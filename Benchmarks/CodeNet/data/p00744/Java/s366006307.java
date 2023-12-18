import java.io.*;
import java.math.BigDecimal;
import java.util.*;


public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m == 0 && n == 0) break;
			int[] b = new int[m];
			int[] r = new int[n];
			for(int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				r[i] = sc.nextInt();
			}
			MaximumFlow mf = new MaximumFlow(m+n+2,m+n,m+n+1);
			for(int i = 0; i < m; i++) {
				mf.addEdge(m+n, i, 1);
			}
			for(int i = m; i < m + n; i++) {
				mf.addEdge(i, m+n+1, 1);
			}
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					boolean ok = gcd(b[i],r[j])==1?false:true;
					if(ok) {
						mf.addEdge(i, m + j, 1);
					}
				}
			}
			int ans = mf.fordFulkerson();
			System.out.println(ans);
		}
		
	}
	static int gcd(int a, int b) {
		if(a < b) return gcd(b,a);
		if(b == 0) return a;
		return gcd(b,a%b);
	}
	
}
class MaximumFlow {
	public static final int INF = 100000000;

	int V;
	int source;
	int sink;

	java.util.ArrayList<Edge>[] graph;
	boolean[] used;

	@SuppressWarnings("unchecked")
	public MaximumFlow(int V, int source, int sink) {
		this.V = V;
		this.source = source;
		this.sink = sink;
		graph = new java.util.ArrayList[V];
		for (int i = 0; i < V; i++) {
			graph[i] = new java.util.ArrayList<Edge>();
		}
		used = new boolean[V];
	}

	public void addEdge(int from, int to, int cap) {
		graph[from].add(new Edge(to, cap, graph[to].size()));
		graph[to].add(new Edge(from, 0, graph[from].size() - 1));
	}

	public int fordFulkerson() {
		int flow = 0;
		while (true) {
			java.util.Arrays.fill(used, false);
			int f = dfsFF(source, sink, INF);
			if (f == 0) {
				break;
			}
			flow += f;
		}
		return flow;
	}

	private int dfsFF(int from, int to, int flow) {
		if (from == to) {
			return flow;
		}
		used[from] = true;

		for (Edge edge : graph[from]) {
			if (used[edge.to] || edge.cap <= 0) {
				continue;
			}
			int d = dfsFF(edge.to, to, Math.min(flow, edge.cap));
			if (d > 0) {
				edge.cap -= d;
				graph[edge.to].get(edge.rev).cap += d;
				return d;
			}
		}
		return 0;
	}

	class Edge {
		int to;
		int cap;
		int rev;

		public Edge(int to, int cap, int rev) {
			this.to = to;
			this.cap = cap;
			this.rev = rev;
		}
	}

}