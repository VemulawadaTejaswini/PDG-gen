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

	static void solve()
	{
		int n = ni();
		int[] a = na(3*n);
		int[] b = na(3*n);
		int[][] ai = new int[n+1][3];
		int[] ap = new int[n+1];
		for(int i = 0;i < 3*n;i++){
			ai[a[i]][ap[a[i]]++] = i;
		}
		int[][] bi = new int[n+1][3];
		int[] bp = new int[n+1];
		for(int i = 0;i < 3*n;i++){
			bi[b[i]][bp[b[i]]++] = i;
		}

		int ans = 999999;
		for(int i = 0;i < 3*n;i++){
			inner:
			for(int j = i;j <= 3*n;j++){
				// valid?
				int[] f = new int[n+1];
				for(int k = i;k < j;k++){
					f[b[k]]++;
				}
				int[] ls = new int[n+1];
				for(int k = 0;k < i;k++) {
					ls[b[k]]++;
				}
				for(int k = 1;k <= n;k++){
					if(f[k] == 0){
						if(ls[k] == 0 || ls[k] == 3){
							continue inner;
						}
					}
				}

				int[] sa = new int[3*n];
				int p = 0;
				for(int k = 0;k < 3*n;k++){
					if(f[a[k]] == 3){
						sa[p++] = a[k];
					}else if(f[a[k]] == 2){
						if(k != ai[a[k]][1]){
							sa[p++] = a[k];
						}
					}else if(f[a[k]] == 1){
						if(ls[a[k]] == 2){
							// 2R0
							if(k == ai[a[k]][2]){
								sa[p++] = a[k];
							}
						}else if(ls[a[k]] == 0){
							// 0L2
							if(k == ai[a[k]][0]){
								sa[p++] = a[k];
							}
						}else{
							if(k != ai[a[k]][1]){
								sa[p++] = a[k];
							}
						}
					}
				}
				int q = i;
				for(int k = 0;k < p && q < j;k++){
					if(sa[k] == b[q]){
						q++;
					}
				}
				if(q != j)continue;

				int[] from = new int[6*n];
				int[] to = new int[6*n];
				int pre = -1;
				int r = 0;
				for(int k = i-1;k >= 0;k--){
					if(f[b[k]] == 0){
						if(pre != -1){
							from[r] = pre; to[r] = k; r++;
						}
						pre = k;
					}
				}
				pre = -1;
				for(int k = j;k < 3*n;k++){
					if(f[b[k]] == 0){
						if(pre != -1){
							from[r] = pre; to[r] = k; r++;
						}
						pre = k;
					}
				}
				for(int k = 1;k <= n;k++){
					if(f[k] == 0){
						if(ls[k] == 1){
							from[r] = bi[k][1]; to[r] = bi[k][0]; r++;
							from[r] = bi[k][0]; to[r] = bi[k][2]; r++;
						}else{
							from[r] = bi[k][1]; to[r] = bi[k][2]; r++;
							from[r] = bi[k][2]; to[r] = bi[k][0]; r++;
						}
					}
				}

				int[][] g = packD(3*n, from, to, r);
				if(sortTopologically(g) != null){
					ans = Math.min(ans, 3*n-(j-i));
				}
			}
		}
		out.println(ans > 3*n ? -1 : ans);
	}

	public static int[] sortTopologically(int[][] g)
	{
		int n = g.length;
		int[] ec = new int[n];
		for(int i = 0;i < n;i++){
			for(int to : g[i])ec[to]++;
		}
		int[] ret = new int[n];
		int q = 0;

		// sources
		for(int i = 0;i < n;i++){
			if(ec[i] == 0)ret[q++] = i;
		}

		for(int p = 0;p < q;p++){
			for(int to : g[ret[p]]){
				if(--ec[to] == 0)ret[q++] = to;
			}
		}
		// loop
		for(int i = 0;i < n;i++){
			if(ec[i] > 0)return null;
		}
		return ret;
	}


	public static int[][] packD(int n, int[] from, int[] to) {
		return packD(n, from, to, from.length);
	}

	public static int[][] packD(int n, int[] from, int[] to, int sup) {
		int[][] g = new int[n][];
		int[] p = new int[n];
		for (int i = 0; i < sup; i++) p[from[i]]++;
		for (int i = 0; i < n; i++) g[i] = new int[p[i]];
		for (int i = 0; i < sup; i++) {
			g[from[i]][--p[from[i]]] = to[i];
		}
		return g;
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
