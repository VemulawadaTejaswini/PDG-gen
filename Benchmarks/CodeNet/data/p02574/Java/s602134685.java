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
	public void solve() {
		int N = ni();
		int a;
		eratosthenes(1000000);
		for (int i = 0; i < N; i++) {
			a = ni();
			primeFactorization(a);
		}
		int cntNot1 = 0, cntN = 0;
		int wk;
		for(int key : map.keySet()) {
			wk = map.get(key);
			if(wk != 1)		cntNot1++;
			if(wk == N)		cntN++;
		}
		if(cntNot1 == 0)		out.println("pairwise coprime");
		else if(cntN == 0)		out.println("setwise coprime");
		else					out.println("not coprime");
	}

//	// 割った数を保存するマップ　３で２回割れたら、ans.get(3) == 2　となる
//	Map<Long, Long> map = new HashMap<Long, Long>();
//	// 単純な素因数分解
//	void primeFactorization(long n){
//		long num = n;
//		Long wk = 0L;
//		boolean f;
//		long sv = 0;
//		// ２　～　ルートｎ　の間、繰り返す
//		for(long i = 2; i * i <= n && num != 1; ++i){
//			// i で割り切れる間、割る
//			f = true;
//			while(num % i == 0){
//				num /= i;
//				if(f) {
//					map.merge(i, 1L, Long::sum);
//					f = false;
//					sv = i;
//				}
//			}
//		}
//		if(num != 1 && num != sv) {
//			map.merge(num, 1L, Long::sum);
//		}
//	}
	
	// エラトステネスの篩(ふるい）　→　素数の表を作る（大体　O(N) らしい）
	int[] arr = new int[1000001];					// 初期値 0(素数なら 0　[2] = 0  2は素数)
	void eratosthenes(int n){
		arr[0] = arr[1] = 0;								// １　は素数でない
		for(int i = 2; i * i <= n; i++){
			if(arr[i] == 0) {								// I が素数なら
				for(int j = i + i; j <= n; j += i){			// j は i の倍数となる
					arr[j] = i;								// i の倍数は素数でない
				}
			}
		}
//		for (int i = 0; i < n; i++) {
//			out.println("arr[" + i + "] = " + arr[i]);
//		}
	}
	// 割った数を保存するマップ　３で２回割れたら、ans.get(3) == 2　となる
	Map<Integer, Integer> map = new HashMap();
	void primeFactorization(int n){
//		out.println("因数分解　開始　：　" + n);
		int sv = 0;
		while(true) {
			if(n <= 1)	break;
			if(n != sv) {
				map.merge(n, 1, Integer::sum);
			}
			if(arr[n] == 0)	break;
			else if(arr[n] != n && arr[n] != sv) {
				map.merge(arr[n], 1, Integer::sum);
				sv = arr[n];
			}
			n = n / arr[n];
		}
//		out.println("因数分解　終了　：　" + n);
//		for(int key : map.keySet()) {
//			out.println("key = " + key + "  cnt = " + map.get(key));
//		}
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
