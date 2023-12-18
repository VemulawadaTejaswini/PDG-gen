import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	static void solve() {
		int D = sc.nextInt();
		int N = sc.nextInt();
		int[] T = new int[D];
		for (int i = 0; i < D; i++) {
			T[i] = sc.nextInt();
		}
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		int C_MAX = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
			C_MAX = max(C_MAX, C[i]);
		}
		int[][] dp = new int[D][C_MAX + 1];
		for (int i = 0; i < D; i++) {
			for (int j = 0; j <= C_MAX; j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		for (int j = 0; j < N; j++) {
			if (A[j] <= T[0] && T[0] <= B[j]) {
				dp[0][C[j]] = 0;
			}
		}
		for (int i = 1; i < D; i++) {
			for (int j = 0; j < N; j++) {
				if (A[j] <= T[i] && T[i] <= B[j]) {
					for (int k = 0; k <= C_MAX; k++) {
						dp[i][C[j]] = max(dp[i][C[j]], dp[i - 1][k] + Math.abs(C[j] - k));
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i <= C_MAX; i++) {
			ans = max(ans, dp[D - 1][i]);
		}
		out.println(ans);
		out.flush();
	}

	public static void main(String[] args) {
		solve();
	}

	static int max(int a, int b) {
		return a < b ? b : a;
	}

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
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private static boolean isPrintableChar(int c) {
		return '!' <= c && c <= '~';
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		int n = 0;
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
}