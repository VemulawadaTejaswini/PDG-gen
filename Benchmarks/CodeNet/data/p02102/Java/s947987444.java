import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main implements Runnable {

	int N, M;
	long C, D;
	int[] union;
	ArrayList<Edge>[] graph;

	private class Edge implements Comparable<Edge> {
		int from, to, c, d;

		public Edge(int from, int to, int c, int d) {
			this.from = from;
			this.to = to;
			this.c = c;
			this.d = d;
		}

		public int compareTo(Edge other) {
			double a = this.d * 1.0 / this.c;
			double b = other.d * 1.0 / other.c;

			if (a < b) {
				return 1;
			} else if (a > b) {
				return -1;
			}
			return 0;
		}
	}

	public boolean same(int x, int y) {
		return find(x) == find(y);
	}

	public int find(int x) {
		return union[x] = (union[x] == x ? x : find(union[x]));
	}

	public void unite(int x, int y) {
		x = find(x);
		y = find(y);

		if (same(x, y))
			return;

		if (x < y) {
			union[y] = x;
		} else {
			union[x] = y;
		}
	}

	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextInt();
		M = nextInt();

		graph = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		C = 0;
		D = 0;
		for (int i = 0; i < M; i++) {
			int a = nextInt();
			int b = nextInt();
			int c = nextInt();
			int d = nextInt();

			graph[a].add(new Edge(a, b, c, d));
			graph[b].add(new Edge(b, a, c, d));

			C += c;
			D += d;
		}
		union = new int[N];
		for (int i = 0; i < N; i++) {
			union[i] = i;
		}
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		for (Edge e : graph[0]) {
			pq.add(e);
		}

		long takeC = 0;
		long takeD = 0;

		while (pq.size() > 0) {
			Edge edge = pq.poll();
			int pre = edge.from;
			int now = edge.to;

			if (same(pre, now))
				continue;
			unite(pre, now);

			takeC += edge.c;
			takeD += edge.d;

			for (Edge e : graph[now]) {
				pq.add(e);
			}
		}

		if (C - takeC == 0)
			out.println(0);
		else
			out.println(String.format("%.06f", (D - takeD) * 1.0 / (C - takeC)));
	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}