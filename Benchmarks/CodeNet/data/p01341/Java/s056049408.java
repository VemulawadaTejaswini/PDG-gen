
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);	
	
	class Edge implements Comparable<Edge> {
		int from, to;
		double cost;

		Edge(int from, int to, double cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		public int compareTo(Edge s) {
			return Double.compare(s.cost, cost);
		}
	}

	class UnionFindTree {
		int[] parent;
		
		public UnionFindTree(int n) {
			parent = new int[n];
			for (int i = 0; i < parent.length; i++) {
				parent[i] = i;
			}
		}
		
		public int find(int x) {
			if (parent[x] == x) return x;
			return parent[x] = find(parent[x]);
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public void unite(int x, int y) {
			int xx = find(x), yy = find(y);
			if (xx == yy) return;
			parent[xx] = yy;
		}
	}

	double calcDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	
	public void run() {
		int n = in.nextInt(), m = in.nextInt();
		int[] x = new int[n], y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		for (int i = 0; i < m; i++) {
			int from = in.nextInt() - 1, to = in.nextInt() - 1;
			pq.add(new Edge(from, to, calcDistance(x[from], y[from], x[to], y[to])));
		}
		
		UnionFindTree uft = new UnionFindTree(n);
		
		double res = 0;
		while (!pq.isEmpty()) {
			Edge e = pq.poll();
			
			if (!uft.same(e.to, e.from)) {
				uft.unite(e.to, e.from);
			} else {
				res += e.cost;
			}
		}
		System.out.println(res);
	}
	
	/* MLE... Why?
	class Edge {
		int to;
		double cost;

		Edge(int to, double cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	
	final int CONV_CONST = 30010;
	
	boolean[] visited;
	ArrayList<Edge>[] g;
	HashSet<Integer> hash = new HashSet<Integer>();
	
	double calcDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	
	int convert(int x, int y) {
		return Math.max(x, y) * CONV_CONST + Math.min(x, y);
	}
	
	int a, b;
	double min;
	
	boolean dfs(int u, int goal, int prev) {
		if (u == goal && prev != -1) {
			return true;
		}
		if (visited[u]) return false;
		visited[u] = true;
		
		for (Edge e : g[u]) {
			if (hash.contains(convert(e.to, u))) continue;
			
			if (prev != e.to && dfs(e.to, goal, u)) {
				if (min > e.cost) {
					min = e.cost;
					a = e.to;
					b = u;
				}
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void run() {
		int n = in.nextInt(), m = in.nextInt();
		int[] x = new int[n], y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		
		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<Edge>();
		}
		for (int i = 0; i < m; i++) {
			int from = in.nextInt() - 1, to = in.nextInt() - 1;
			double dist = calcDistance(x[from], y[from], x[to], y[to]);
			g[from].add(new Edge(to, dist));
			g[to].add(new Edge(from, dist));
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += g[i].size();
		}
		System.out.println(sum);
		
		double res = 0;
		for (int i = 0; i < n; i++) {
			while (true) {
				a = -1; b = -1; min = Double.MAX_VALUE;
				Arrays.fill(visited, false);
				dfs(i, i, -1);
				if (a == -1) break;
					
				hash.add(convert(a, b));

				res += min;
			}
		}
		
		System.out.println(hash.size());
		System.out.println(res);
		
		out.close();
	}
	*/
	
	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}