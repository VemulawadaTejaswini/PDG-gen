import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int V = sc.nextInt();
		int E = sc.nextInt();
		int[] u = new int[E];
		int[] v = new int[E];
		int[] c = new int[E];
		for (int i = 0; i < E; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		new FordFulkerson(V, E, u, v, c).ans();
	}


}

class FordFulkerson {
	static class Edge {
		int from;
		int to;
		Edge(int from, int to) {
			this.from = from;
			this.to = to;
		}
	}
	static final int INF = Integer.MAX_VALUE;
	int v;
	int e;
	TreeMap<Integer, ArrayList<Edge>> map;
	HashMap<Edge, Integer> edges;
	public FordFulkerson(int V, int e, int[] u, int[] v, int[] c) {
		this.v = V;
		this.e = e;
		map = new TreeMap<>();
		edges = new HashMap<>();
		for (int i = 0; i < this.v; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < e; i++) {
			Edge tmp = new Edge(u[i], v[i]);
			map.get(u[i]).add(tmp);
			edges.put(tmp, c[i]);
		}
	}
	void ans() {
		int maxflow = 0;
		while (true) {
			boolean[] used = new boolean[v];
			int f = dfs(0, INF, used);
			if (f == 0) {
				break;
			} else {
				maxflow += f;
			}
		}
		System.out.println(maxflow);
	}
	int dfs(int from, int flow, boolean[] used) {
		if (from == v - 1) {
			return flow;
		}
		used[from] = true;
		for (Edge edge: map.get(from)) {
			if (!used[edge.to] && edges.get(edge) > 0) {
				int d = dfs(edge.to, Math.min(flow, edges.get(edge)), used);
				if (d > 0) {
					edges.put(edge, edges.get(edge) - d);
					Edge rev = new Edge(edge.to, edge.from);
					if (edges.containsKey(rev)) {
						edges.put(rev, edges.get(rev) + d);
					} else {
						edges.put(rev, d);
					}
					map.get(edge.to).add(rev);
					return d;
				}
			}
		}
		return 0;
	}
}



class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || Integer.MAX_VALUE < nl) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
