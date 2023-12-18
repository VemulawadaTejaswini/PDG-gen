import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;

public class Main {

	private final static int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int[] c = new int[26];
		sc.fill(c);
		int[][] s = new int[D][26];
		for (int i = 0; i < D; i++) {
			sc.fill(s[i]);
		}

		int[] result = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			int max = -1;
			int index = -1;
			for (int j = 0; j < s[i].length; j++) {
				result[i] = j + 1;
				int tempScore = score(i + 1, c, s, result);
				if (max < tempScore) {
					max = tempScore;
					index = j;
				}
			}
			result[i] = index + 1;
		}
		debug(score(D, c, s, result));

		StringBuilder sb = new StringBuilder();
		for (int r : result) {
			sb.append(r).append(System.lineSeparator());
		}
		System.out.print(sb.toString());
	}

	private static int score(int D, int[] c, int[][] s, int[] result) {
		int sat = 0;
		int[] last = new int[26];
		for (int i = 0; i < D; i++) {
			int index = result[i] - 1;
			last[index] = i + 1;
			for (int j = 0; j < 26; j++) {
				sat -= (i + 1 - last[j]) * c[j];
			}
			sat += s[i][index];
		}
		return Integer.max(0, 1000000 + sat);
	}

	public static class Pair {
		private int x;
		private int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		@Override
		public String toString() {
			return "[" + x + ", " + y + "]";
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}

	private static int add(int a, int b) {
		return (a + b) % MOD;
	}

	private static int sub(int a, int b) {
		return (a - b % MOD) % MOD;
	}

	private static int mul(long a, long b) {
		return (int) (((a % MOD) * (b % MOD)) % MOD);
	}

	/**
	 * 最大公約数
	 */
	private static long gcd(long m, long n) {
		long temp;
		while (m % n != 0) {
			temp = n;
			n = m % n;
			m = temp;
		}
		return n;
	}

	/**
	 * 最小公倍数
	 */
	private static long lcm(long m, long n) {
		return m / gcd(m, n) * n;
	}

	public static class Scanner {
		private BufferedInputStream inputStream;
		private StringBuilder buffer = new StringBuilder();

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(int[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
		}

		public void fill(int[] a, int[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
			}
		}

		public long nextLong() throws IOException {
			long num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(long[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
		}

		public void fill(long[] a, long[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
				b[i] = nextLong();
			}
		}

		public long[] nextLong(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}

			return array;
		}

		public String next() throws IOException {
			int read = skip();
			do {
				buffer.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			String text = buffer.toString();
			buffer.delete(0, buffer.length());

			return text;
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}
