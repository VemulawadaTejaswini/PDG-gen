import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		int K=sc.nextInt();
		HashMap<Integer, Long> hashMap=new HashMap<>();
		for (int i = 0; i < K; i++) {
			int r=sc.nextInt()-1;
			int c=sc.nextInt()-1;
			long w=sc.nextLong();
			hashMap.put(kumi(r, c, C), w);
		}
		long[][][] dp=new long[R+1][C+1][4];
		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					dp[i][j][0]=Math.max(dp[i][j][0], dp[i-1][j][j2]);
					dp[i][j][j2]=Math.max(dp[i][j][j2], dp[i][j-1][j2]);
				}
				if (hashMap.containsKey(kumi(i-1, j-1, C))) {
					long w=hashMap.get(kumi(i-1, j-1, C));
					for (int j2 = 1; j2 < 4; j2++) {
						dp[i][j][j2]=Math.max(dp[i][j][j2], dp[i][j-1][j2-1]+w);
					}
					for (int j2 = 0; j2 < 4; j2++) {
						dp[i][j][1]=Math.max(dp[i][j][1], dp[i-1][j][j2]+w);
					}
				}
			}
		}
		long ans=0;
		for (int i = 0; i < 4; i++) {
			ans=Math.max(ans, dp[R][C][i]);
		}
		System.out.println(ans);
 	}
	static int kumi(int i, int j, int W){
        return i*W+j;//W列の２次配列を一次元にする
    }
	static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
