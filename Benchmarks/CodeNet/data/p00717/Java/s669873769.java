import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		for (;;) {
			int n = ir.nextInt();
			if (n == 0)
				return;
			int[][][] p=new int[n+1][][];
			for(int i=0;i<=n;i++){
				int m=ir.nextInt();
				p[i]=new int[m][];
				for(int j=0;j<m;j++)
					p[i][j]=ir.nextIntArray(2);
			}
			for(int i=1;i<=n;i++){
				if(check(i,p))
					out.println(i);
			}
			out.println("+++++");
		}
	}

	public static boolean check(int cur,int[][][] p){
		if(p[0].length!=p[cur].length)
			return false;
		int n=p[0].length;
		boolean f=Math.abs(p[0][1][0]-p[0][0][0]+p[0][1][1]-p[0][0][1])==Math.abs(p[cur][1][0]-p[cur][0][0]+p[cur][1][1]-p[cur][0][1]);
		for(int i=0;i<n-2;i++){
			f&=dir(p[0][i+1][0]-p[0][i][0],p[0][i+1][1]-p[0][i][1],p[0][i+2][0]-p[0][i+1][0],p[0][i+2][1]-p[0][i+1][1])==dir(p[cur][i+1][0]-p[cur][i][0],p[cur][i+1][1]-p[cur][i][1],p[cur][i+2][0]-p[cur][i+1][0],p[cur][i+2][1]-p[cur][i+1][1]);
			f&=Math.abs(p[0][i+2][0]-p[0][i+1][0]+p[0][i+2][1]-p[0][i+1][1])==Math.abs(p[cur][i+2][0]-p[cur][i+1][0]+p[cur][i+2][1]-p[cur][i+1][1]);
		}
		if(f)
			return true;
		for(int i=0;i<n/2;i++){
			int[] t=p[cur][i];
			p[cur][i]=p[cur][n-1-i];
			p[cur][n-1-i]=t;
		}
		f=Math.abs(p[0][1][0]-p[0][0][0]+p[0][1][1]-p[0][0][1])==Math.abs(p[cur][1][0]-p[cur][0][0]+p[cur][1][1]-p[cur][0][1]);
		for(int i=0;i<n-2;i++){
			f&=dir(p[0][i+1][0]-p[0][i][0],p[0][i+1][1]-p[0][i][1],p[0][i+2][0]-p[0][i+1][0],p[0][i+2][1]-p[0][i+1][1])==dir(p[cur][i+1][0]-p[cur][i][0],p[cur][i+1][1]-p[cur][i][1],p[cur][i+2][0]-p[cur][i+1][0],p[cur][i+2][1]-p[cur][i+1][1]);
			f&=Math.abs(p[0][i+2][0]-p[0][i+1][0]+p[0][i+2][1]-p[0][i+1][1])==Math.abs(p[cur][i+2][0]-p[cur][i+1][0]+p[cur][i+2][1]-p[cur][i+1][1]);
		}
		return f;
	}

	public static int dir(int a,int b,int c,int d){
		int sa=Integer.signum(a);
		int sb=Integer.signum(b);
		int sc=Integer.signum(c);
		int sd=Integer.signum(d);
		return sa*sd==-1||sb*sc==1?1:-1;
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
