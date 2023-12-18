import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	class LazySegmentTree {
		int n;
		int[] val;
		boolean[] lazy;

		public LazySegmentTree(int n_) {
			n = 1;
			while (n < n_) {
				n *= 2;
			}
			val = new int[2 * n - 1];
			lazy = new boolean[2 * n - 1];
		}

		void push(int k) {
			if (!lazy[k])
				return;
			val[k] *= -1;
			if (2 * k + 2 < lazy.length) {
				lazy[2 * k + 1] = !lazy[2 * k + 1];
				lazy[2 * k + 2] = !lazy[2 * k + 2];
			}
			lazy[k] = false;
		}

		void add(int a, int b) {
			add(0, n, a, b, 0);
		}

		int query(int a, int b) {
			return query(0, n, a, b, 0);
		}

		void add(int l, int r, int a, int b, int k) {
			push(k);
			if (b <= l || r <= a) {
				return;
			} else if (a <= l && r <= b) {
				lazy[k] = true;
				push(k);
			} else {
				add(l, (l + r) / 2, a, b, 2 * k + 1);
				add((l + r) / 2, r, a, b, 2 * k + 2);
				val[k] = val[2 * k + 1] + val[2 * k + 2];
			}
		}

		int query(int l, int r, int a, int b, int k) {
			push(k);
			if (b <= l || r <= a) {
				return 0;
			} else if (a <= l && r <= b) {
				return val[k];
			} else {
				int lv = query(l, (l + r) / 2, a, b, 2 * k + 1);
				int rv = query((l + r) / 2, r, a, b, 2 * k + 2);
				return lv + rv;
			}
		}
	}

	int pos = 0;
	ArrayList<Integer>[] g;
	int[][] ref;

	void dfs(int cur, int par) {
		ref[cur][0] = pos;
		++pos;
		for (int dst : g[cur]) {
			if (dst == par)
				continue;
			dfs(dst, cur);
		}
		ref[cur][1] = pos;
		++pos;
	}

	@SuppressWarnings("unchecked")
	void solve(int N, int Q, int[] P, int[] C, int[] V) {
		g = new ArrayList[N];
		for (int i = 0; i < N; ++i) {
			g[i] = new ArrayList();
		}
		for (int i = 1; i < N; ++i) {
			g[i].add(P[i - 1]);
			g[P[i - 1]].add(i);
		}
		ref = new int[N][2];
		dfs(0, -1);
		LazySegmentTree lst = new LazySegmentTree(2 * N);
		for (int i = 0; i < N; ++i) {
			lst.val[ref[i][0] + lst.n - 1] += C[i];
			lst.val[ref[i][1] + lst.n - 1] += C[i];
		}
		for (int i = lst.n - 2; i >= 0; --i) {
			lst.val[i] = lst.val[2 * i + 1] + lst.val[2 * i + 2];
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < Q; ++i) {
			int l = ref[V[i]][0];
			int r = ref[V[i]][1] + 1;
			lst.add(l, r);
			pw.println(lst.query(0, lst.n) > 0 ? "broccoli" : "cauliflower");
		}
		pw.close();
	}

	public void run() {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] P = new int[N - 1];
		int[] C = new int[N];
		int[] V = new int[Q];
		for (int i = 0; i < N - 1; ++i) {
			P[i] = sc.nextInt();
			--P[i];
		}
		for (int i = 0; i < N; ++i) {
			C[i] = sc.next().equals("G") ? 1 : -1;
		}
		for (int i = 0; i < Q; ++i) {
			V[i] = sc.nextInt() - 1;
		}
		solve(N, Q, P, C, V);
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

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
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
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

