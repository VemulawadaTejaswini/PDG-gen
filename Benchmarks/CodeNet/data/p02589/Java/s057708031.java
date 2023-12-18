import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = ir.next();
		}
		Arrays.sort(s, new Comparator<String>() {
			public int compare(String A, String B) {
				return A.length() - B.length();
			}
		});
		HashMap<String, long[]> mp = new HashMap<>();
		long res = 0;
		for (int i = 0; i < n; i++) {
			boolean[] a = new boolean[26];
			for (int j = 0; j < s[i].length(); j++) {
				String t = s[i].substring(j);
				tr(t);
				if (mp.containsKey(t)) {
					long[] p = mp.get(t);
					tr(p);
					for (int k = 0; k < 26; k++) {
						if (a[k])
							res += p[k];
					}
				}
				a[s[i].charAt(j) - 'a'] = true;
			}
			String t = "";
			if (mp.containsKey(t)) {
				long[] p = mp.get(t);
				for (int k = 0; k < 26; k++) {
					if (a[k])
						res += p[k];
				}
			}
			String x = s[i].substring(1);
			tr(x);
			if (mp.containsKey(x)) {
				long[] p = mp.get(x);
				p[s[i].charAt(0) - 'a']++;
				mp.put(x, p);
			} else {
				long[] p = new long[26];
				p[s[i].charAt(0) - 'a']++;
				mp.put(x, p);
			}
		}
		out.println(res);
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		System.err.println(Arrays.deepToString(o));
	}
}