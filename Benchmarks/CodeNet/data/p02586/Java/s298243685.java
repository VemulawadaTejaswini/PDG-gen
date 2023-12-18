import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.rmi.dgc.Lease;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		main.out.close();
	}
	// ======================================================================
	int R, C, K;
	int[][] V;
	long memo[][][];
	long calc(int r, int c, int cnt) {
//		out.println("開始　r = " + r + "  c = " + c + "  cnt = " + cnt);
		if(r == R-1 && c == C-1) {
			if(cnt >= 3) {
//				out.println("  リターン　０");
				return 0;
			} else {
//				out.println("  リターン　" + V[r][c]);
				return V[r][c];
			}
		}
		if(memo[r][c][cnt] != -1) {
//			out.println("  リターンメモ　" + memo[r][c][cnt]);
			return memo[r][c][cnt];
		}
		long ans = 0;
		if(r+1 < R)	{
			if(cnt >= 3)
				ans = Math.max(ans, calc(r+1, c, 0));
			else 
				ans = Math.max(ans, calc(r+1, c, 0) + V[r][c]);
		}
		if(c+1 < C) {
			if(cnt >= 3)
				ans = Math.max(ans, calc(r, c+1, cnt));
			else {
				if(V[r][c] != 0)
					ans = Math.max(ans, calc(r, c+1, cnt+1) + V[r][c]);
				ans = Math.max(ans, calc(r, c+1, cnt));
			}
		}
//		out.println("終了　r = " + r + "  c = " + c 
//						+ "  cnt = " + cnt + "  ans = " + ans);
		return memo[r][c][cnt] = ans;
	}
	public void solve() {
		R = ni();
		C = ni();
		K = ni();
		V = new int[R][C];
		int r, c;
		for (int i = 0; i < K; i++) {
			r = ni() - 1;
			c = ni() - 1;
			V[r][c] = ni();
		}
		memo = new long[R][C][4];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				Arrays.fill(memo[i][j], -1);
			}
		}
		out.println(calc(0,0,0));
	}
	// ------------------------------------------
	// ライブラリ
	// ------------------------------------------
	// Print
	private PrintWriter out = new PrintWriter(System.out);
	
	// Scanner
	private FastScanner scan = new FastScanner();
	int ni(){ return scan.nextInt();}
	int[] ni(int n){int[] a = new int[n]; for(int i = 0; i < n; i++){a[i] = ni();} return a;}
	int[][] ni(int y, int x){int[][] a = new int[y][x];
	for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ni();}} return a;}
	long nl(){return scan.nextLong();}
	long[] nl(int n){long[] a = new long[n]; for(int i = 0; i < n; i++){a[i] = nl();} return a;}
	long[][] nl(int y, int x){long[][] a = new long[y][x];
	for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = nl();}} return a;}
	String ns(){return scan.next();}
	String[] ns(int n){String[] a = new String[n]; for(int i = 0; i < n; i++){a[i] = ns();} return a;}
	String[][] ns(int y, int x){String[][] a = new String[y][x];
	for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ns();}} return a;}
}
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() { return Double.parseDouble(next());}
}
