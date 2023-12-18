import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Main {

	private static final String NO = "No";
	private static final String YES = "Yes";
	InputStream is;
	PrintWriter out;
	String INPUT = "";

	private static final long MOD = 998244353L;

	void solve() {
		int T = 1;
		for (int i = 0; i < T; i++)
			solve(i);
	}

	void solve(int p) {
		int n = ni();
		int k = ni();
		int N = 300000;
		int a[] = na(n);
		SegmentTreeRMQ t = new SegmentTreeRMQ(N + 2);
		for (int i : a) {
			int l = Math.max(0, i - k);
			int r = Math.min(N, i + k)+1;
			int v = t.min(l, r) - 1;
			t.update(i, v);
//			tr(i, l, r, -v);
		}
		out.print(-(t.min(0, N)));
	}

	// a^b
	long power(long a, long b) {
		long x = 1, y = a;
		while (b > 0) {
			if (b % 2 != 0) {
				x = (x * y) % MOD;
			}
			y = (y * y) % MOD;
			b /= 2;
		}
		return x % MOD;
	}

	private long gcd(long a, long b) {
		while (a != 0) {
			long tmp = b % a;
			b = a;
			a = tmp;
		}
		return b;
	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n) {
			if (!(isSpaceChar(b)))
				buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private List<Integer> na2(int n) {
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			a.add(ni());
		return a;
	}

	private int[][] na(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = na(m);
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long[] nl(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}

	private long[][] nl(int n, int m) {
		long[][] a = new long[n][];
		for (int i = 0; i < n; i++)
			a[i] = nl(m);
		return a;
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public class SegmentTreeRMQ {
		public int M, H, N;
		public int[] st;

		public SegmentTreeRMQ(int n) {
			N = n;
			M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
			H = M >>> 1;
			st = new int[M];
//			Arrays.fill(st, 0, M, Integer.MAX_VALUE);
		}

		public SegmentTreeRMQ(int[] a) {
			N = a.length;
			M = Integer.highestOneBit(Math.max(N - 1, 1)) << 2;
			H = M >>> 1;
			st = new int[M];
			for (int i = 0; i < N; i++) {
				st[H + i] = a[i];
			}
			Arrays.fill(st, H + N, M, Integer.MAX_VALUE);
			for (int i = H - 1; i >= 1; i--)
				propagate(i);
		}

		public void update(int pos, int x) {
			st[H + pos] = x;
			for (int i = (H + pos) >>> 1; i >= 1; i >>>= 1)
				propagate(i);
		}

		private void propagate(int i) {
			st[i] = Math.min(st[2 * i], st[2 * i + 1]);
		}

		public int minx(int l, int r) {
			int min = Integer.MAX_VALUE;
			if (l >= r)
				return min;
			while (l != 0) {
				int f = l & -l;
				if (l + f > r)
					break;
				int v = st[(H + l) / f];
				if (v < min)
					min = v;
				l += f;
			}

			while (l < r) {
				int f = r & -r;
				int v = st[(H + r) / f - 1];
				if (v < min)
					min = v;
				r -= f;
			}
			return min;
		}

		public int min(int l, int r) {
			return l >= r ? Integer.MAX_VALUE : min(l, r, 0, H, 1);
		}

		private int min(int l, int r, int cl, int cr, int cur) {
			if (l <= cl && cr <= r) {
				return st[cur];
			} else {
				int mid = cl + cr >>> 1;
				int ret = Integer.MAX_VALUE;
				if (cl < r && l < mid) {
					ret = Math.min(ret, min(l, r, cl, mid, 2 * cur));
				}
				if (mid < r && l < cr) {
					ret = Math.min(ret, min(l, r, mid, cr, 2 * cur + 1));
				}
				return ret;
			}
		}

		public int firstle(int l, int v) {
			int cur = H + l;
			while (true) {
				if (st[cur] <= v) {
					if (cur < H) {
						cur = 2 * cur;
					} else {
						return cur - H;
					}
				} else {
					cur++;
					if ((cur & cur - 1) == 0)
						return -1;
					if ((cur & 1) == 0)
						cur >>>= 1;
				}
			}
		}

		public int lastle(int l, int v) {
			int cur = H + l;
			while (true) {
				if (st[cur] <= v) {
					if (cur < H) {
						cur = 2 * cur + 1;
					} else {
						return cur - H;
					}
				} else {
					if ((cur & cur - 1) == 0)
						return -1;
					cur--;
					if ((cur & 1) == 1)
						cur >>>= 1;
				}
			}
		}
	}

}
