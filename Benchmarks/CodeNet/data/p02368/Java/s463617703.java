import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		new Main().run();
		System.err.println(System.currentTimeMillis() - t);
	}

	ArrayList<Integer>[] g;
	int[] ord;
	int[] low;
	int[] col;
	int order = 0;
	int color = 0;
	ArrayDeque<Integer> que = new ArrayDeque<>();

	void scc() {
		int n = g.length;
		ord = new int[n];
		low = new int[n];
		col = new int[n];
		Arrays.fill(ord, -1);
		Arrays.fill(col, -1);
		for (int i = 0; i < n; ++i) {
			if (ord[i] != -1)
				continue;
			dfs(i);
		}

	}

	void dfs(int cur) {
		ord[cur] = order;
		low[cur] = order;
		++order;
		for (int dst : g[cur]) {
			if (ord[dst] != -1) {
				low[cur] = Math.min(low[cur], ord[dst]);
			} else {
				dfs(dst);
				low[cur] = Math.min(low[cur], low[dst]);
			}
		}
		que.addLast(cur);
		if (low[cur] == ord[cur]) {
			int v = -1;
			while (v != cur) {
				v = que.pollFirst();
				col[v] = color;
			}
			++color;
		}
	}

	@SuppressWarnings("unchecked")
	void run() {
		Scanner sc = new Scanner();
		int V = sc.nextInt();
		int E = sc.nextInt();
		g = new ArrayList[V];
		for (int i = 0; i < g.length; ++i)
			g[i] = new ArrayList<>();
		for (int i = 0; i < E; ++i) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			g[s].add(t);
		}
		scc();
		int Q = sc.nextInt();
		while (Q-- > 0) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			System.out.println(col[u] == col[v] ? 1 : 0);
		}
	}

	class Scanner {
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
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
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
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}