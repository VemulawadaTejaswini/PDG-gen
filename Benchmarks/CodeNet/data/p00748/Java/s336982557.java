import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	static void solve() {
		int maxN = 1000000, INF = Integer.MAX_VALUE;
		int[][] ary = new int[2][maxN + 1];
		Arrays.fill(ary[0], INF);
		Arrays.fill(ary[1], INF);
		ary[0][0] = ary[1][0] = 0;
		ArrayList<Integer> rt = new ArrayList<Integer>();
		ArrayList<Integer> rt_odd = new ArrayList<Integer>();
		for (int i = 1;; i++) {
			int rt_i = rt(i);
			if (rt_i >= maxN) {
				break;
			}
			rt.add(rt_i);
			if (rt_i % 2 == 1) {
				rt_odd.add(rt_i);
			}
		}
		for (int i = 0; i <= maxN; i++) {
			if (ary[0][i] < INF) {
				for (int j = 0; j < rt.size(); j++) {
					int rt_j = rt.get(j);
					if (i + rt_j <= maxN) {
						ary[0][i + rt_j] = min(ary[0][i + rt_j], ary[0][i] + 1);
					} else {
						break;
					}
				}
			}
			if (ary[1][i] < INF) {
				for (int j = 0; j < rt_odd.size(); j++) {
					int rt_odd_j = rt_odd.get(j);
					if (i + rt_odd_j <= maxN) {
						ary[1][i + rt_odd_j] = min(ary[1][i + rt_odd_j], ary[1][i] + 1);
					} else {
						break;
					}
				}
			}
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				break;
			}
			out.println(ary[0][N] + " " + ary[1][N]);
		}
		out.flush();
	}

	public static void main(String[] args) {
		solve();
	}

	static int max(int a, int b) {
		return a < b ? b : a;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static int rt(int n) {
		return n * (n + 1) * (n + 2) / 6;
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
}