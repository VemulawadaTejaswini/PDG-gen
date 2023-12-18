import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	class Seg {
		int n = 1;
		int[] v;

		public Seg(int n_) {
			while (n < n_)
				n *= 2;
			v = new int[2 * n - 1];
		}

		void add(int k, int val) {
			k += n - 1;
			v[k] += val;
			while (k > 0) {
				k = (k - 1) / 2;
				v[k] = v[2 * k + 1] + v[2 * k + 2];
			}
		}

		int query(int a, int b) {
			return query(0, n, a, b, 0);
		}

		int query(int l, int r, int a, int b, int k) {
			if (b <= l || r <= a)
				return 0;
			else if (a <= l && r <= b) {
				return v[k];
			} else {
				int vl = query(l, (l + r) / 2, a, b, 2 * k + 1);
				int vr = query((l + r) / 2, r, a, b, 2 * k + 2);
				return vl + vr;
			}
		}
	}

	void run() {
		FastScanner sc = new FastScanner();
		ArrayDeque<Integer>[] que = new ArrayDeque[6 * 100000 + 1];
		for (int i = 0; i < que.length; ++i) {
			que[i] = new ArrayDeque<Integer>();
		}
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] c = new int[N];
		int[][] query = new int[Q][3];
		Seg seg=new Seg(N);
		for (int i = 0; i < N; ++i) {
			c[i] = sc.nextInt()-1;
			if (que[c[i]].isEmpty()) {
				seg.add(i, 1);
			}
			que[c[i]].addLast(i);
		}

		for (int i = 0; i < Q; ++i) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			query[i] = new int[] { l, r, i };
		}
		Arrays.sort(query, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		int[] ans=new int[Q];
		int q=0;
		for (int i=0;i<Q;++i) {
			while (q<Q && query[q][0]==i) {
				ans[query[q][2]]=seg.query(query[q][0], query[q][1]+1);
				++q;
				
			}
			que[c[i]].pollFirst();
			if (!que[c[i]].isEmpty()) {
				seg.add(que[c[i]].peekFirst(), 1);
			
			}
		}
		PrintWriter pw=new PrintWriter(System.out);
		for (int i=0;i<Q;++i) {
			pw.println(ans[i]);
		}
		pw.flush();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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
}
