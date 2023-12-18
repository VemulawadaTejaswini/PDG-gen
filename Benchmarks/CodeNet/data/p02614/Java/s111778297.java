import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
	public static long MOD = 998244353;
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int h= sc.nextInt();
		int w= sc.nextInt();
		int k =sc.nextInt();
		int board[][] = new int[h][w];
		for(int i=0; i<h; ++i) {
			String str = sc.next();
			for(int j=0; j<w; ++j) {
				if(str.charAt(j)=='#') {
					board[i][j] = 1;
				}else{
					board[i][j] = 0;
				}
			}
		}
		int ans = 0;
		for(int i=0; i<1<<h; ++i) {
			for(int j=0; j<1<<w; ++j) {
				int cnt = 0;
				for(int a=0; a<h; ++a) {
					if(((1<<a)&i)>=1)continue;
					for(int b=0; b<w; ++b) {
						if(((1<<b)&j)>=1)continue;
						cnt+=board[a][b];
					}
				}
				if(cnt==k) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		out.close();
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
