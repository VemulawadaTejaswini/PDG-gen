import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	final static int INF = Integer.MAX_VALUE;
	final static int MOD = 100000007;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		int[] sosu = { 3, 5, 7, 11, 13 };
		int cnt;
		int num;
		int tmp;
		int yaku;
		int ans = 0;
		if (n > 104) {
			for (int i = 107; i <= n; i++) {
				if (i % 2 == 0) {
					continue;
				}
				tmp = i;
				yaku = 1;
				for (int j = 0; j < 5; j++) {
					cnt = 0;
					while (tmp % sosu[j] == 0) {
						tmp /= sosu[j];
						cnt++;
					}
					yaku *= cnt + 1;
				}
				if (yaku == 8) {
					ans++;
				}
			}
			ans++;
		}

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();

	}

	private int lowerbound(int[] a, int n) {//n<a[i]となる最小のi
		int l = 0;
		int r = a.length - 1;
		int c;
		if (n >= a[r]) {
			return a.length;
		}
		while (l != r) {
			c = (l + r) / 2;
			if (a[c] <= n) {
				l = c + 1;
			} else {
				r = c;
			}
		}
		return l;
	}

	private int upperbound(int[] a, int n) {//a[i]<nとなる最大のi
		int l = 0;
		int r = a.length - 1;
		int c;
		if (n <= a[0]) {
			return -1;
		}
		while (l != r) {
			c = (l + r + 1) / 2;
			if (a[c] < n) {
				l = c;
			} else {
				r = c - 1;
			}
		}
		return l;
	}

	private int lis(int[] a) {
		int[] b = new int[a.length + 1];
		Arrays.fill(b, INF);
		for (int i = 0; i < a.length; i++) {
			b[upperbound(b, a[i]) + 1] = a[i];
		}
		return upperbound(b, INF - 1) + 1;
	}

	private class FastScanner {
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
}
