import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int r; (r = s.nextInt()) > 0;) {
			int c = s.nextInt(), q = s.nextInt();
			c_ = 1;
			while (c_ < c)
				c_ *= 2;
			int[][] dat = new int[r][2 * c_];
			for (int[] d : dat) {
				Arrays.fill(d, Integer.MAX_VALUE);
			}

			for (int i = 0; i < r; ++i) {
				for (int j = 0; j < c; ++j) {
					update(dat[i], j, s.nextInt());
				}
			}
			for (; q-- > 0;) {
				int r1 = s.nextInt(), c1 = s.nextInt(), r2 = s.nextInt(), c2 = s
						.nextInt();
				int min = Integer.MAX_VALUE;
				for (; r1 <= r2; ++r1) {
					min = Math.min(min, query(dat[r1], c1, c2 + 1, 0, 0, c_));
				}
				System.out.println(min);
			}
		}
	}

	static int c_;

	static void update(int[] d, int k, int a) {
		d[k += c_ - 1] = a;
		while (k > 0) {
			k = (k - 1) / 2;
			d[k] = Math.min(d[k * 2 + 1], d[k * 2 + 2]);
		}
	}

	static int query(int[] d, int a, int b, int k, int l, int r) {
		if (r <= a || b <= l) {
			return Integer.MAX_VALUE;
		}
		if (a <= l && r <= b) {
			return d[k];
		} else {
			int vl = query(d, a, b, k * 2 + 1, l, (l + r) / 2);
			int vr = query(d, a, b, k * 2 + 2, (l + r) / 2, r);
			return Math.min(vl, vr);
		}

	}

	static class Scanner {
		java.io.BufferedInputStream bis;

		public Scanner(java.io.InputStream is) {
			bis = new java.io.BufferedInputStream(is);
		}

		public String next() {
			StringBuilder sb = new StringBuilder();
			int b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				for (; !Character.isWhitespace(b); b = bis.read()) {
					sb.append((char) b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return sb.toString();
		}

		public int nextInt() {
			int r = 0, s = 1, b = ' ';
			try {
				for (; Character.isWhitespace(b); b = bis.read())
					;
				if ((s = b == '-' ? -1 : 1) < 0) {
					b = bis.read();
				}
				for (; Character.isDigit(b); b = bis.read())
					r = r * 10 + b - '0';
			} catch (Exception e) {
			}
			return s * r;

		}
	}
}