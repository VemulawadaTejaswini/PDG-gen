import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		Graph g = new Graph(n);
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int c = sc.nextInt();
				g.add(i, c);
			}
		}

		LCA lca = new LCA(g, 0);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int l = lca.lca(u, v);
			System.out.println(l);
		}
	}

}

class LCA {
	private final int logN;
	private final int n;
	private final Graph graph;
	private final int[][] par;
	public final int[] depth;

	public LCA(Graph g, int root) {
		this.graph = g;
		this.n = g.size();
		this.logN = Integer.numberOfTrailingZeros(Integer.highestOneBit(n - 1)) + 1;
		this.par = new int[logN][n];
		this.depth = new int[n];

		init(root);
	}

	private void init(int root) {
		// dfs(root, -1, 0);
		bfs(root);
		for (int k = 0; k < logN - 1; k++) {
			for (int v = 0; v < n; v++) {
				if (par[k][v] < 0)
					par[k + 1][v] = -1;
				else
					par[k + 1][v] = par[k][par[k][v]];
			}
		}
	}

	private void bfs(int v) {
		Arrays.fill(depth, Integer.MAX_VALUE);
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(v);
		depth[v] = 0;
		par[0][v] = -1;
		while (!queue.isEmpty()) {
			int now = queue.poll();
			for (Graph.Path p : graph.get(now)) {
				if (depth[p.to] > depth[now] + 1) {
					depth[p.to] = depth[now] + 1;
					queue.add(p.to);
					par[0][p.to] = now;
				}
			}
		}
	}

	public int lca(int u, int v) {
		if (depth[u] > depth[v]) {
			int tmp = u;
			u = v;
			v = tmp;
		}
		for (int k = 0; k < logN; k++) {
			if (((depth[v] - depth[u]) >> k & 1) == 1)
				v = par[k][v];
		}
		if (u == v)
			return u;

		for (int k = logN - 1; k >= 0; k--) {
			if (par[k][u] != par[k][v]) {
				u = par[k][u];
				v = par[k][v];
			}
		}
		return par[0][u];
	}
}

class FastScanner {
	public static String debug = null;

	private final InputStream in = System.in;
	private int ptr = 0;
	private int buflen = 0;
	private byte[] buffer = new byte[1024];
	private boolean eos = false;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				if (debug != null) {
					buflen = debug.length();
					buffer = debug.getBytes();
					debug = "";
					eos = true;
				} else {
					buflen = in.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen < 0) {
				eos = true;
				return false;
			} else if (buflen == 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean isEOS() {
		return this.eos;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		return (int) nextLong();
	}

	public long[] nextLongList(int n) {
		return nextLongTable(n, 1)[0];
	}

	public int[] nextIntList(int n) {
		return nextIntTable(n, 1)[0];
	}

	public long[][] nextLongTable(int n, int m) {
		long[][] ret = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}

class Graph {
	public static class Path implements Comparable<Path> {
		public final int from;
		public final int to;
		public final long cost;

		public Path(int from, int to, long cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Path o) {
			return Long.compare(this.cost, o.cost);
		}
	}

	private final List<List<Path>> edgeList;
	private final int size;

	public Graph(int n) {
		this.size = n;
		this.edgeList = new ArrayList<List<Path>>();
		for (int i = 0; i < n; i++) {
			this.edgeList.add(new ArrayList<Path>());
		}
	}

	public void add(int from, int to, long cost) {
		this.edgeList.get(from).add(new Path(from, to, cost));
	}

	public void addBoth(int v1, int v2, long cost) {
		this.add(v1, v2, cost);
		this.add(v2, v1, cost);
	}

	public void add(int from, int to) {
		this.edgeList.get(from).add(new Path(from, to, 1));
	}

	public void addBoth(int v1, int v2) {
		this.add(v1, v2, 1);
		this.add(v2, v1, 1);
	}

	public List<Path> get(int from) {
		return this.edgeList.get(from);
	}

	public int size() {
		return this.size;
	}
}