import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.BitSet;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static final int INF=Integer.MAX_VALUE;
	static int[] dp,dp2;
	static BitSet ef,of;

	static void solve() {
		dp=new int[(int)1e6];
		dp2=new int[(int)1e6];
		ef=new BitSet((int)1e7);
		of=new BitSet((int)1e7);
		Arrays.fill(dp,INF);
		Arrays.fill(dp2,INF);
		dp[0]=dp2[0]=0;
		int[] tet=new int[100];
		for(int i=1;i<100;i++){
			tet[i]=tet[i-1]+i*(i+1)/2;
			if(i%4==1)
				of.set(tet[i]);
			else
				ef.set(tet[i]);
		}

		for(;;){
			int n=ir.nextInt();
			if(n==0)
				break;
			out.println(count(n,tet)+" "+count_odd(n,tet));
		}
	}

	static int count(int n,int[] tet){
		if(dp[n]!=INF)
			return dp[n];
		if(ef.get(n)||of.get(n))
			return 1;
		for(int i=1;i<=n/2;i++){
			dp[n]=Math.min(dp[n], count(i,tet)+count(n-i,tet));
		}
		return dp[n];
	}

	static int count_odd(int n,int[] tet){
		if(dp2[n]!=INF)
			return dp2[n];
		if(of.get(n))
			return 1;
		for(int i=1;i<=n/2;i++){
			dp2[n]=Math.min(dp2[n], count_odd(i,tet)+count_odd(n-i,tet));
		}
		return dp2[n];
	}

	public static void main(String[] args) throws Exception {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
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