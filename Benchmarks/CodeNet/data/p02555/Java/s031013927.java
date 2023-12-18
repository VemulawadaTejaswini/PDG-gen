import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    static final long MOD = 1000000007;
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int S = reader.nextInt();
		solver(S);
	}
	
	public static void solver(int S) {
	    // write logic
	    long[][] dp = new long[S+1][4];
	    dp[0][0] = 1;
	    for(int i=0; i<S; i++) {
	        dp[i+1][1] = dp[i][0] + dp[i][3];
	        dp[i+1][2] = dp[i][1];
	        dp[i+1][3] = dp[i][2] + dp[i][3];
	        for (int j=1; j<=3; j++) dp[i+1][j] %= MOD;
	    }
	    
	    System.out.println(dp[S][3]);
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