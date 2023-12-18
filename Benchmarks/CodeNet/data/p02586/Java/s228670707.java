import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	int C, R;
	long[][][] DP;
	
	int conv(int x, int y){
		return (y-1)*C+x;
	}
	
	long maxDP(int x, int y){
		return  Math.max(DP[x][y][3],
					Math.max(DP[x][y][2],
					Math.max(DP[x][y][1], DP[x][y][0])));
	}

	public Main() {
		FastScanner scanner = new FastScanner();
		R = scanner.nextInt();
		C = scanner.nextInt();
		int K = scanner.nextInt();

		HashMap<Integer, Long> Items = new HashMap<>();
		for (int i = 0; i < K; i++) {
			int y = scanner.nextInt();
			int x = scanner.nextInt();
			Items.put(conv(x, y), scanner.nextLong());
		}
		
		DP = new long[C+1][R+1][4];

		for (int y = 1; y <= R; y++) {
			for (int x = 1; x <= C; x++) {
				long value = Items.getOrDefault(conv(x, y),0L);
				DP[x][y][0] = Math.max(DP[x-1][y][0], maxDP(x,y-1));
				DP[x][y][1] = Math.max(DP[x-1][y][1], DP[x][y][0]   + value);
				DP[x][y][2] = Math.max(DP[x-1][y][2], DP[x-1][y][1] + value);
				DP[x][y][3] = Math.max(DP[x-1][y][3], DP[x-1][y][2] + value);
			}
		}

		System.out.println(maxDP(C, R));
	}

	public static void main(String[] args) {
		new Main();
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
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
