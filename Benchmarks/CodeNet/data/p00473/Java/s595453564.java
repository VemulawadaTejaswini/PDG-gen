import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] c = new int[n + 1];
		for (int i = 1; i < n; i++) {
			c[i] = io.nextInt();
		}
		c[n] = 0;
		int[][][] dp = new int[2][n + 1][n / 2 + 1];
		int[] min0 = new int[n / 2 + 1];
		int[] min1 = new int[n + 1];
		Arrays.fill(min0, 1 << 29);
		Arrays.fill(min1, 1 << 29);
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n / 2; j++) {
				for (int k = 0; k < 2; k++) {
					dp[k][i][j] = 1 << 29;
				}
			}
		}
		dp[1][0][0] = min1[0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				if (j > i) {
					continue;
				}
				dp[0][i][j] = min1[i - j] + c[i];
				dp[1][i][j] = min0[j] + c[i];
				min0[j] = Math.min(min0[j], dp[0][i][j]);
				min1[i - j] = Math.min(min1[i - j], dp[1][i][j]);
				// System.out.println(i + "," + j + ":" + dp[i][j][0] + "/" +
				// dp[i][j][1] + "," + min[i][j][0] + "/" + min[i][j][1]);
			}
		}
		// System.out.println(Arrays.deepToString(dp));
		// System.out.println(Arrays.deepToString(min));
		int ans = 1 << 29;
		for (int i = 1; i <= n; i++) {
			ans = Math.min(ans, dp[0][i][n/2]);
			if (0 <= i - n / 2) {
				ans = Math.min(ans, dp[1][i][i-n/2]);
			}
		}
		System.out.println(ans);
	}

}

class IO {
	private final InputStream in;
	final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() {
		this(System.in);
	}

	public IO(InputStream source) {
		this.in = source;
	}

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

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private static boolean isNewLine(int c) {
		return c == '\n' || c == '\r';
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	private void skipNewLine() {
		while (hasNextByte() && isNewLine(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public boolean hasNextLine() {
		skipNewLine();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public char[] nextCharArray(int len) {
		char[] s = new char[len];
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		int i = 0;
		int b = readByte();
		while (isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}

	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}

	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] arrayInt(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] arrayLong(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}

	public double[] arrayDouble(int n) {
		double[] a = new double[n];
		for (int i = 0; i < n; i++)
			a[i] = nextDouble();
		return a;
	}

	public void arrayInt(int[]... a) {
		for (int i = 0; i < a[0].length; i++)
			for (int j = 0; j < a.length; j++)
				a[j][i] = nextInt();
	}

	public int[][] matrixInt(int n, int m) {
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++)
			a[i] = arrayInt(m);
		return a;
	}

	public char[][] charMap(int n, int m) {
		char[][] a = new char[n][m];
		for (int i = 0; i < n; i++)
			a[i] = nextCharArray(m);
		return a;
	}
}