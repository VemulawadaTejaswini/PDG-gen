import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	private static final int MAX = 43;
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		
		long A = scanner.nextLong(), B = scanner.nextLong();
		long S = A + B;
		long X = 0;
		for (int i = 2; i < N; i++) {
			X ^= scanner.nextLong();
		}
		
		//桁数、繰り上がり、Aより大きいフラグ：aの最大値
		long[][][] DP = new long[MAX][2][2];
		
		for (int i = 0; i < MAX; i++) {
			for (int c = 0; c < 2; c++) {
				for (int f = 0; f < 2; f++) {
					DP[i][c][f] = Long.MIN_VALUE;
				}
			}
		}
		
		DP[0][0][0] = 0;
		
		//a xor b = Xかつa + b = Sを満たすaの最大値を求める
		long D = 1;
		for (int i = 0; i < MAX-1; i++) {
			long DX = X & 1;
			long DS = S & 1;
			long DA = (A >> i) & 1;
			
			// 繰り上り
			for (int c = 0; c < 2; c++) {
				// Aより大きいフラグ
				for (int f = 0; f < 2; f++) {
					//DP[i][c][f]を展開しDP[i+1][][]を最大化する
					
					if ( DP[i][c][f] < 0 ) continue;
					
					for (long na = 0; na < 2; na++) {
						for (long nb = 0; nb < 2; nb++) {
							if ( (na ^ nb) != DX ) continue;
							if ( ((na + nb + c) & 1) != DS ) continue;
							
							int nc = (na + nb + c > 1) ? 1 : 0;
							int nf;
							if (DA > na) {
								nf = 0;
							} else if(DA < na) {
								nf = 1;
							} else {
								nf = f;
							}
							
							DP[i+1][nc][nf] = Math.max(DP[i+1][nc][nf], DP[i][c][f] + na * D);
						}
					}
					
					
				}
			}
			
			X >>= 1;
			S >>= 1;
			D <<= 1;
		}
		
		long max = DP[MAX-1][0][0];
		if (max <= 0) {
			System.out.println(-1);
		} else {
			System.out.println(A - max);
		}
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
