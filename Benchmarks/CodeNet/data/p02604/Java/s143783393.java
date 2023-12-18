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
	// =====================================================================
	final long INF = (long)(1e18);
	int N;
	int[] X, Y, P;
	long[] ans;
	int[][] xdif, ydif;
	public void solve() {
		long start = System.currentTimeMillis();

		N = ni();
		X = new int[N];
		Y = new int[N];
		P = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = ni();
			Y[i] = ni();
			P[i] = ni();
		}
		// 前処理
		xdif = new int[1<<N][N];
		ydif = new int[1<<N][N];
		for (int i = 0; i < (1<<N); i++) {
			for (int j = 0; j < N; j++) {
				xdif[i][j] = Math.abs(X[j]);		// X = 0 からの距離
				ydif[i][j] = Math.abs(Y[j]);		// Y = 0 からの距離
				for (int j2 = 0; j2 < N; j2++) {
					if((i & (1<<j2)) == 0)		continue;
					xdif[i][j] = Math.min(xdif[i][j], Math.abs(X[j]-X[j2]));	// 線との距離
					ydif[i][j] = Math.min(ydif[i][j], Math.abs(Y[j]-Y[j2]));	// 
				}
			}
		}
		ans = new long[N+1];
		Arrays.fill(ans, INF);
		int cnt, ybit;
		long sum;
		for (int i = 0; i < (1 << N); i++) {		// ０　～　Ｎ－１　ビットのＯＮ／ＯＦＦ　すべて
			cnt = Integer.bitCount(i);
			for (int j = i; j >= 0; j--) {			// 立っているビットを　Ｘ　と　Ｙ　に分配する
				j &= i;								// 立ってるビットを　Ｘ　とする
				ybit = i - j;						// 差分は　Ｙ　のビットが立っている
				sum = 0;
				for (int j2 = 0; j2 < N; j2++) {	// 町の数、繰り返す
					if((i & (int)(1 << j2)) == 1)	continue;	// 電車が通るので次へ
													// 前計算の値で計算する
					sum += Math.min((long)xdif[j][j2]*P[j2], 
									(long)ydif[ybit][j2]*P[j2]);
				}
				ans[cnt] = Math.min(ans[cnt], sum);
			}
		}
		for (int i = 0; i <= N; i++) {
			out.println(ans[i]);
		}
		
		long end = System.currentTimeMillis();
//		out.println(" --> time  " + (end - start) + " ms");
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
