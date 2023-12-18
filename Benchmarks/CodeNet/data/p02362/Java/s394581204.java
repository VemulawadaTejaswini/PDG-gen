import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int v = sc.nextInt();
		int e = sc.nextInt();
		int r = sc.nextInt();
		int[] s = new int[e];
		int[] t = new int[e];
		int[] d = new int[e];
		for (int i = 0; i < e; i++) {
			s[i] = sc.nextInt();
			t[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		new BellmanFord(v, e, r, s, t, d).ans();
	}
}

class BellmanFord {
	static class Edge {
		int from;
		int to;
		int cost;
		Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	static final int INF = Integer.MAX_VALUE;
	int v;
	int e;
	int r;
	ArrayList<Edge> edges;
	int[] distance;
	public BellmanFord(int v, int e, int r, int[] s, int[] t, int[] d) {
		this.v = v;
		this.e = e;
		this.r = r;
		edges = new ArrayList<>(e);
		for (int i = 0; i < e; i++) {
			edges.add(new Edge(s[i], t[i], d[i]));
		}
	}
	void run() {
		distance = new int[v];
		for (int i = 0; i < v; i++) {
			distance[i] = INF;
		}
		distance[r] = 0;
		for (int i = 0; i < v - 1; i++) {
			for (Edge edge: edges) {
				if (distance[edge.from] == INF) continue;
				if (distance[edge.from] + edge.cost < distance[edge.to]) {
					distance[edge.to] = distance[edge.from] + edge.cost;
				}
			}
		}
	}
	public void ans() {
		run();
		for (Edge edge: edges) {
			if (distance[edge.from] == INF) continue;
			if (distance[edge.from] + edge.cost < distance[edge.to]) {
				System.out.println("NEGATIVE CYCLE");
				return;
			}
		}
		for (int i = 0; i < v; i++) {
			if (distance[i] == INF) {
				System.out.println("INF");
			} else {
				System.out.println(distance[i]);
			}
		}
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
