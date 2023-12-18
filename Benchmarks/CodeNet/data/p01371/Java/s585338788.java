import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		while(true) {
			int N = reader.nextInt();
			if(N==0) break;
			int[][] costs = new int[N][N+1];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N+1; j++) {
					costs[i][j] = reader.nextInt();
				}
			}
			solver(N, costs);
		}
	}

	public static void solver(int N, int[][] costs) {
		int[] dp = new int[(int) (Math.pow(2, N))];
		for(int i=0; i<Math.pow(2, N); i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		for(int i=1; i<Math.pow(2, N); i++) {
			for(int k=0; k<N; k++) {
				if((i/(int)Math.pow(2, k))%2 == 1) {
					int mincost = costs[k][0];
					for(int x=0; x<N; x++) {
						if(((i-(int)Math.pow(2, k))/(int)Math.pow(2, x))%2 == 1) {
							mincost = Math.min(mincost, costs[k][x+1]);
						}
					}
					dp[i] = Math.min(dp[i], dp[i-(int)Math.pow(2, k)]+mincost);
				}
			}
		}
		System.out.println(dp[(int)Math.pow(2, N)-1]);
	}

	// Read Class
	static class FS {
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

		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}

		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}