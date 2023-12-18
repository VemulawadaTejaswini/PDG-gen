import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=998244353;//1000000007;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		long[][][] dp=new long[C+1][D+1][3];
		dp[A][B][0]=1;
		for (int i = A+1; i <= C; i++) {
			dp[i][B][1]=(dp[i-1][B][0]+dp[i-1][B][1]+dp[i-1][B][2])*(long)B;
			dp[i][B][1]%=MOD;
		}
		for (int i = B+1; i <= D; i++) {
			dp[A][i][0]=(dp[A][i-1][0])*(long)(A-1);
			dp[A][i][1]=dp[A][i-1][0]+dp[A][i-1][1]*(long)(A-1);
			dp[A][i][2]=dp[A][i-1][1]+dp[A][i-1][2]*(long)(A);
			dp[A][i][0]%=MOD;
			dp[A][i][1]%=MOD;
			dp[A][i][2]%=MOD;
		}
		for (int i = A+1; i <= C; i++) {
			for (int j = B+1; j <= D; j++) {
				dp[i][j][0]+=dp[i][j-1][0]*(long)(i-1);
				dp[i][j][0]%=MOD;
				dp[i][j][1]+=(dp[i-1][j][0]+dp[i-1][j][1]+dp[i-1][j][2])*(long)(j);
				dp[i][j][1]%=MOD;
				dp[i][j][2]+=(dp[i][j-1][1]+dp[i][j-1][2]*(long)(i));
				dp[i][j][2]%=MOD;
			}
		}
		System.out.println((dp[C][D][0]+dp[C][D][1]+dp[C][D][2])%MOD);
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
