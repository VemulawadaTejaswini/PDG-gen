import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	static final long MOD = 998244353L;
	
	Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		int S = scanner.nextInt();
		
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		
		long[][] DP = new long[N+1][S+1];
		DP[0][0] = 1;
		for (int i = 0; i <  N; i++) {
			
			//遷移先の合計値
			for (int s = 0; s <= S; s++) {
				DP[i+1][s] = (DP[i+1][s] + DP[i][s] * 2L % MOD) % MOD;
				
				if (s-A[i] >= 0) {
					DP[i+1][s] = (DP[i+1][s] + DP[i][s-A[i]]) % MOD;
				}
				
			}
		}
		
		System.out.println(DP[N][S]);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	long[] fac, finv, inv;
	
	void init(int max) {
		max += 1;
		fac = new long[max];
		finv = new long[max];
		inv = new long[max];
		
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < max; i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[(int) (MOD % i)] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}
	
	long combination(int n, int k) {
		if (n < k) return 0;
		if (n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
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

