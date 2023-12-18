
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	static final long INF = Long.MAX_VALUE / 2;
	static int[] wd = new int[]{0,1,0,-1};
	static int[] hd = new int[]{1,0,-1,0};
	static int w;
	static int h;
	private static void solve() {
		PrintWriter pr = new PrintWriter(System.out);
		while(true){
			w = ni();
			h = ni();
			if(w==0 && h==0) break;
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = nc();
				}
			}
			boolean[][] B = new boolean[h][w];
			boolean[][] W = new boolean[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]=='B'){
						dfs(B,map,i,j);
					}
					if(map[i][j]=='W'){
						dfs(W,map,i,j);
					}
				}
			}
			int bs = 0;
			int ws = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(B[i][j]==true&&W[i][j]==false) bs++;
					if(W[i][j]==true&&B[i][j]==false) ws++;
				}
			}
			pr.println(bs+" "+ws);
		}
		pr.flush();
	}
	
	private static void dfs(boolean[][] b, char[][] map, int i, int j) {
		for(int k=0;k<4;k++){
			if(j+wd[k]<w && j+wd[k]>=0 && i+hd[k]<h && i+hd[k]>=0
					&&b[i+hd[k]][j+wd[k]]==false && map[i+hd[k]][j+wd[k]]!='B' && map[i+hd[k]][j+wd[k]]!='W'){
				b[i+hd[k]][j+wd[k]] = true;
				dfs(b,map,i+hd[k],j+wd[k]);
			}
		}
	}

	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G-S+"ms");
	}

	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;

		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}

	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;

	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}

	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
	//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }

	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}

	private static int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}

	private static int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}

		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}

		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}