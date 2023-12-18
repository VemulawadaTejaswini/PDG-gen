import java.io.*;
import java.util.*;
public class Main{
	final public static long MOD = 998244353;
	public static int a, b, c, d;
	public static long powa[], powb[];
	public static long memo[][];
	public static void main(String[] args) throws IOException{
		PrintWriter out = new PrintWriter(System.out);
		FastIO sc = new FastIO(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		memo = new long[c+1][d+1];
		powa = new long[d+1];
		powb = new long[c+1];
		powa[0] = 1;
		powb[0] = 1;
		for(int i=1; i<=d; ++i) {
			powa[i] = (powa[i-1]*a)%MOD;
		}
		for(int i=1; i<=c; ++i) {
			powb[i] = (powb[i-1]*b)%MOD;
		}
		out.println(go(c, d));
		out.close();
	}
	public static long go(int x, int y) {
		if(memo[x][y]!=0) return memo[x][y];
		if(x==a&&y==b) {
			return memo[x][y]=1;
		}
		if(x==a) {
			return memo[x][y] = (powa[y-b])%MOD;
		}
		if(y==b) {
			return memo[x][y] = (powb[x-a])%MOD;
		}
		memo[x][y] = (memo[x][y] + go(x-1, y)*y)%MOD;
		memo[x][y] = (memo[x][y] + go(x, y-1)*x)%MOD;
		memo[x][y] = ((memo[x][y]-go(x-1, y-1)*(x-1)*(y-1))%MOD + MOD)%MOD;
		return memo[x][y];
	}
	static class FastIO {
		InputStream dis;
		byte[] buffer = new byte[1 << 17];
		int pointer = 0;
		public FastIO(String fileName) throws IOException {
			dis = new FileInputStream(fileName);
		}
		public FastIO(InputStream is) throws IOException {
			dis = is;
		}
		int nextInt() throws IOException {
			int ret = 0;
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}
 
			return (negative) ? -ret : ret;
		}
		long nextLong() throws IOException {
			long ret = 0;
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}
			return (negative) ? -ret : ret;
		}
		byte nextByte() throws IOException {
			if (pointer == buffer.length) {
				dis.read(buffer, 0, buffer.length);
				pointer = 0;
			}
			return buffer[pointer++];
		}
		String next() throws IOException {
			StringBuffer ret = new StringBuffer();
 
			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			while (b > ' ') {
				ret.appendCodePoint(b);
				b = nextByte();
			}
 
			return ret.toString();
		}
	}
}