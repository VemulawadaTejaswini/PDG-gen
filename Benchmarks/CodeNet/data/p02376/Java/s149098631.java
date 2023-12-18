import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static void solve() {
		int v = in.nextInt();
		int e = in.nextInt();

		DirectedGraph g = new DirectedGraph(v);

		for (int i=0; i<e; i++) {
			g.addLink(in.nextInt(), in.nextInt(), in.nextInt());
		}

		out.println(dinic(g,0,v-1));
	}

	static int dinic(DirectedGraph g, int source, int sink) {
		int n = g.n;
		int[] cnt = new int[n];

		for (int i=0; i<n; i++)
			for (int[] link : g.get(i))
				cnt[link[0]]++;

		int[][] rev = new int[n][];
		for (int i=0; i<n; i++) rev[i] = new int[cnt[i]];
		for (int i=n-1; i>=0; i--)
			for (int[] link : g.get(i))
				rev[link[0]][--cnt[link[0]]] = i;

		int[][] flow = new int[n][n];
		int[] level = new int[n];
		int[] path = new int[n];
		int res = 0;

		while (true) {
			Arrays.fill(level,-1);
			path[0] = source;
			int ptr = 1;
			level[source] = 0;

			for (int i=0; i<ptr; i++) {
				int cur = path[i];

				for (int[] link : g.get(cur)) {
					int next = link[0], cap = link[1];
					if (level[next] == -1 && cap - flow[cur][next] > 0) {
						path[ptr++] = next;
						level[next] = level[cur] + 1;
					}
				}

				for (int next : rev[cur]) {
					if (level[next] == -1 && -flow[cur][next] > 0) {
						path[ptr++] = next;
						level[next] = level[cur] + 1;
					}
				}
			}

			if (level[sink] == -1) break;
			int f = 0;
			while ((f = dfsDinic(g,level,rev,flow,source,sink,Integer.MAX_VALUE/2)) > 0)
				res += f;
		}

		return res;
	}

	static int dfsDinic(DirectedGraph g, int[] level, int[][] rev, int[][] flow, int cur, int sink, int min){
		if (cur == sink) return min;

		int left = min;

		for (int[] link : g.get(cur)) {
			int next = link[0], cap = link[1];
			if (level[next] == level[cur] + 1 && cap-flow[cur][next] > 0) {
				int f = dfsDinic(g,level,rev,flow,next,sink,Math.min(left, cap-flow[cur][next]));
				if (f > 0) {
					flow[cur][next] += f;
					flow[next][cur] -= f;
					left -= f;
					if (left == 0) return min;
				}
			}
		}

		for (int next : rev[cur]) {
			if (level[next] == level[cur] + 1 && -flow[cur][next] > 0) {
				int f = dfsDinic(g,level,rev,flow,next,sink,Math.min(left, -flow[cur][next]));
				if (f > 0) {
					flow[cur][next] += f;
					flow[next][cur] -= f;
					left -= f;
					if (left == 0) return min;
				}
			}
		}

		return min - left;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class DirectedGraph {

	public static final int INF = Integer.MAX_VALUE/2;

	public final int n;
	private ArrayList<ArrayList<int[]>> adjlist;

	public DirectedGraph(int n) {
		this.n = n;
		this.adjlist = new ArrayList<ArrayList<int[]>>();
		for (int i=0; i<n; i++) adjlist.add(new ArrayList<int[]>());
	}

	public void addLink(int from, int to) {
		addLink(from,to,0);
	}

	public void addLink(int from, int to, int c) {
		adjlist.get(from).add(new int[]{to,c});
	}

	public ArrayList<int[]> get(int v) {
		return adjlist.get(v);
	}

	public String toString() {
		StringBuilder res = new StringBuilder();
		for (int i=0; i<n; i++) {
			res.append(i).append(" ").append(Arrays.deepToString(adjlist.get(i).toArray())).append("\n");
		}
		return res.substring(0,res.length()-1);
	}
}