import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// aoj GRL_2_A Kruskal O(E log V)
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int v = sc.nextInt();
		int e = sc.nextInt();

		Kruskal fw = new Kruskal(v);
		for (int i = 0; i < e; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			fw.addEdge(s, t, d);
		}

		pr.println(fw.getSpaningTreeCost());

		pr.close();
		sc.close();
	}
	
	private static class Kruskal {
		List<Edge> edges;
		int n;

		// Union-Find
		int[] parent;
		int[] rank;
		
		Kruskal(int n) {
			this.n = n;
			edges = new ArrayList<Edge>();

			// Union-Find
			parent = new int[this.n];
			rank = new int[this.n];
			for (int i = 0; i < this.n; i++) {
				parent[i] = i;
				rank[i] = 0;
			}
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			edges.add(new Edge(i, j, c));
		}

		public long getSpaningTreeCost() {
			Collections.sort(edges);

			long ret = 0;
			for (Edge e : edges) {
				if (!same(e.u, e.v)) {
					ret += e.w;
					union(e.u, e.v);
				}
			}
			
			return ret;
		}
		
		private static class Edge implements Comparable<Edge> {
			int u; // from
			int v; // to
			int w; // cost
			
			Edge(int u, int v, int w) {
				this.u = u;
				this.v = v;
				this.w = w;
			}

			@Override
			public int compareTo(Edge o) {
//				return Integer.compare(this.d, o.d);
				return this.w > o.w ? 1 : this.w < o.w ? -1 : 0;
			}
		}

		int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}
		
		boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		void union(int x, int y) {
			x = find(x);
			y = find(y);
			if (x != y) {
				if (rank[x] > rank[y]) {
					parent[y] = x;
				} else {
					parent[x] = y;
					if (rank[x] == rank[y]) {
						rank[y]++;
					}
				}
			}

			return;
		}
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;
		
		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		
		String next() throws RuntimeException  {
			try {
				if (it == null || !it.hasNext()) {
					it = Arrays.asList(br.readLine().split(" ")).iterator();
				}
				return it.next();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}
		
		int nextInt() throws RuntimeException {
			return Integer.parseInt(next());
		}

		long nextLong() throws RuntimeException {
			return Long.parseLong(next());
		}

		float nextFloat() throws RuntimeException {
			return Float.parseFloat(next());
		}

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}