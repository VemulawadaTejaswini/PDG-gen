import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		char[] cs=sc.next().toCharArray();
		long sum=0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i]=='1') {
				sum++;
			}
		}
		long plusmod=0;
		long minusmod=0;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i]=='1') {
				plusmod+=modPow(2, N-1-i, sum+1);
				plusmod%=(sum+1);
				if (sum!=1) {
					minusmod+=modPow(2, N-1-i, sum-1);
					minusmod%=(sum-1);
				}	
			}
		}
		for (int i = 0; i < cs.length; i++) {
			long plusm=plusmod;
			long minusm=minusmod;
			int count=1;
			if (cs[i]=='0') {
				plusm+=modPow(2, N-1-i, sum+1);
				plusm%=(sum+1);
				while (plusm!=0) {
					plusm%=Integer.bitCount((int)plusm);
					count++;
				}
			}else {
				if (sum==1) {
					out.println(0);
					continue;
				}
				minusm-=modPow(2, N-1-i, sum-1);
				minusm%=sum-1;
				if (minusm<0) {
					minusm+=sum-1;
				}
				while (minusm!=0) {
					minusm%=Integer.bitCount((int)minusm);
					count++;
				}
			}
			out.println(count);
		}
		out.flush();
 	}
	static long modPow(long x, long y,long MOD) {
        long z = 1;
        while (y > 0) {
            if (y % 2 == 0) {
                x = (x * x) % MOD;
                y /= 2;
            } else {
                z = (z * x) % MOD;
                y--;
            }
        }
        return z;
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
