import java.util.*;

public class Main {
	// sovle max-flow problem by Ford-Fulkerson algorithm.
	// time complexity: O(F|E|) where F is a max-flow and E is a set of edges.
	// from: "プログラミングコンテストチャレンジブック[第2版]"(http://amzn.asia/3MkgFHb) p188
	static int MAX_V = 100;
	static int INF = 10000000;
	static ArrayList<ArrayList<Edge>> G = new ArrayList<ArrayList<Edge>>(MAX_V); // {{
//		for(int i=0; i<MAX_V; i++) {
//			G.add(new ArrayList<Edge>());
//		}
//	}};
	// TODO: https://stackoverflow.com/questions/8559092/create-an-array-of-arraylists
	// もっとマシな設計にできないか
	static boolean[] used = new boolean[MAX_V];
	
	static void addEdge(int from, int to, int cap) {
		G.get(from).add(new Edge(to, cap, G.get(to).size()));
		G.get(to).add(new Edge(from, 0, G.get(from).size()-1));
	}
	
	static int dfs(int v, int t, int f) {
		if(v==t) return f;
		used[v] = true;
		for(int i=0; i<G.get(v).size(); i++) {
			Edge e = G.get(v).get(i);
			if(!used[e.to] && e.cap > 0) {
				int d = dfs(e.to, t, Math.min(f, e.cap));
				if(d>0) {
					e.cap -= d;
					G.get(e.to).get(e.rev).cap += d;
					return d;
				}
			}
		}
		return 0;
	}
	
	static int maxFlow(int s, int t) {
		int flow = 0;
		for(;;) {
			Arrays.fill(used, false);
			int f = dfs(s, t, INF);
			if(f==0) return flow;
			flow += f;
		}
	}
	
	static void initGraph(int maxV) {
		for(int i=0; i<maxV; i++) {
			G.add(new ArrayList<Edge>());
		}
	}
	
	static class Edge {
		int to, cap, rev;
		Edge(int to, int cap, int rev) {
			this.to = to; this.cap = cap; this.rev = rev;
		}
	}
	
	// VERIFIED at http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=GRL_6_A&lang=jp
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int s = 0;
		int t = V-1;
		initGraph(V);
		for(int i=0; i<E; i++) {
			int u = sc.nextInt(); int v = sc.nextInt(); int c = sc.nextInt();
			addEdge(u, v, c);
		}
		System.out.println(maxFlow(s, t));
	}
}

