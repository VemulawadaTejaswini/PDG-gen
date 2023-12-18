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
			g.addLink(in.nextInt(), in.nextInt());
		}

		DirectedGraph sccg = g.findStronglyConnectedComponents();
		int[] refSCC = g.getSCC();

		int q = in.nextInt();
		while (q-- > 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			out.println(refSCC[x] == refSCC[y] ? "1" : "0");
		}
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

	private int n;
	private ArrayList<ArrayList<int[]>> adjlist;
	private int[] ord, lowlink, refSCC;
	private int timestamp;

	public DirectedGraph() {
		this.n = 0;
		this.adjlist = new ArrayList<ArrayList<int[]>>();
	}

	public DirectedGraph(int n) {
		this.n = n;
		this.adjlist = new ArrayList<ArrayList<int[]>>();
		for (int i=0; i<n; i++) adjlist.add(new ArrayList<int[]>());
	}

	public void add() {
		this.n++;
		adjlist.add(new ArrayList<int[]>());
	}

	public void addLink(int from, int to) {
		addLink(from,to,0);
	}

	public void addLink(int from, int to, int c) {
		adjlist.get(from).add(new int[]{to,c});
	}

	public ArrayList<int[]> getSuccessors(int cur) {
		return adjlist.get(cur);
	}

	public int[] getSCC() {
		if (refSCC == null) findStronglyConnectedComponents();
		return refSCC.clone();
	}

	public int size() {
		return n;
	}

	public String toString() {
		StringBuilder res = new StringBuilder();
		for (int i=0; i<n; i++) {
			res.append(i).append(" ").append(Arrays.deepToString(adjlist.get(i).toArray())).append("\n");
		}
		return res.substring(0,res.length()-1);
	}

	public DirectedGraph findStronglyConnectedComponents() {
		this.ord = new int[n];
		this.lowlink = new int[n];
		this.timestamp = 1;

		this.refSCC = new int[n];

		DirectedGraph res = new DirectedGraph();
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

		for (int i=0; i<n; i++) {
			if (ord[i] != 0) continue;
			findStronglyConnectedComponents(i, stack, res);
		}

		//TODO add link

		return res;
	}

	private void findStronglyConnectedComponents(int cur, ArrayDeque<Integer> stack, DirectedGraph g) {
		ord[cur] = timestamp;
		lowlink[cur] = timestamp;
		timestamp++;

		stack.add(cur);

		for (int[] to : adjlist.get(cur)) {
			int next = to[0];
			if (ord[next] == 0) {
				findStronglyConnectedComponents(next, stack, g);
				lowlink[cur] = Math.min(lowlink[cur], lowlink[next]);
			} else if (stack.contains(next)) {
				lowlink[cur] = Math.min(lowlink[cur], ord[next]);
			}
		}

		if (ord[cur] != lowlink[cur]) return;

		int v;
		do {
			v = stack.pollLast();
			refSCC[v] = g.size();
		} while(v != cur);

		g.add();
	}
}