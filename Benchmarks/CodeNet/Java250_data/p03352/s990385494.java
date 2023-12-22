import java.io.*;
import java.util.*;

public class Main{
	public static InputReader scn = new InputReader();
	public static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws Exception {
		//System.out.println("GO");

		int[] div = new int[1001];
		div[1] = 1;
		for (int i = 2; i <= 1e3; i++) {
			if (div[i] == 0) {
				for (int j = i; j <= 1e3; j += i) {
					div[j] = i;
				}
			}
		}

		int n = scn.nextInt();
		for (int i = n; i > 1; i--) {
			if(i == 980) {
				out.println(i);
			}
			HashMap<Integer, Integer> map = new HashMap<>();
			int k = i;
			while (k != 1) {
				if (map.containsKey(div[k])) {
					map.put(div[k], map.get(div[k]) + 1);
				} else {
					map.put(div[k], 1);
				}
				k /= div[k];
			}

			int z = -1;
			for (int x : map.keySet()) {
				if (z == -1) {
					z = map.get(x);
				} else if (map.get(x) != z) {
					z = -2;
				}
			}

			if (z > 1) {
				System.out.println(i);
				return;
			}
		}
		out.println(1);
		out.flush();
	}

	public static class InputReader {
		InputStream is;

		public InputReader() {
			is = System.in;
		}

		byte[] inbuf = new byte[1024];
		public int lenbuf = 0, ptrbuf = 0;

		int readByte() {
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

		boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		char nextChar() {
			return (char) skip();
		}

		String next() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		char[] next(int n) {
			char[] buf = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buf[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}

		char[][] nextMatrix(int n, int m) {
			char[][] map = new char[n][];
			for (int i = 0; i < n; i++)
				map[i] = next(m);
			return map;
		}

		int[] nextArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		int nextInt() {
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

		long nextLong() {
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
	}
}
