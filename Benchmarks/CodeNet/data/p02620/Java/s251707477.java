import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.rmi.dgc.Lease;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
	int D;
	int[] C, A;
	int[][] S;
	TreeSet<Integer>[] dSet = new TreeSet[26];		// タイプ別の日付（０－）のセット
	
	long calc(int[] data) {		// 答えの配列から結果を計算する（日付　１－）
		long ans = 0, wk;
		int[] last = new int[26];
		int no;
		for (int i = 0; i < data.length; i++) {
			no = data[i]-1;		// 0 - 25
			ans += S[i][no];
			last[no] = i+1;
			for (int j = 0; j < 26; j++) {
				wk = (long)C[j] * (i+1-last[j]);
				ans -= wk;
			}
//			out.println(ans);
		}
		return ans;
	}
	long update(long val, int d, int q) {	// d日目をタイプq に変更する
		int org = A[d] - 1;						// 元のタイプ（0 - 25）
//		out.println("元の満足度[" + val + " [" + d 
//						+ "]日目を [" + org + "] --> [" + q + "]　に換える");
		long ans = val - S[d][org];				// 満足度を引く
		Integer left = dSet[org].lower(d);		// 
		Integer right = dSet[org].higher(d);
		int wk = (left == null ? d+1 : d - left);
		int wk2 = (right == null ? D - d : right - d);
		ans -= ((long)wk * wk2 * C[org]);
		dSet[org].remove(d);
//		out.println("   left = " + left + "  right = " + right);
//		out.println("   wk = " + wk + "  wk2 = " 
//						+ wk2 + "  C[" + org + "] = " + C[org]);
//		out.println("   -->  削除分を引いた結果[" + ans + "]");
		ans += S[d][q];
		left = dSet[q].lower(d);
		right = dSet[q].higher(d);
		wk = (left == null ? d+1 : d - left);
		wk2 = (right == null ? D - d : right - d);
		ans += ((long)wk * wk2 * C[q]);
		A[d] = q+1;
//		out.println("   left = " + left + "  right = " + right);
//		out.println("   wk = " + wk + "  wk2 = " 
//						+ wk2 + "  C[" + q + "] = " + C[q]);
//		out.println("   -->  新しい値を反映した結果[" + ans + "]");
		return ans;
	}
	public void solve() {
		D = ni();
		C = ni(26);				// タイプ別のかけ数（さげる）
		S = new int[D][26];		// タイプ別の満足度
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < 26; j++) {
				S[i][j] = ni();
			}
		}
		A = ni(D);				// 答えの配列（１－２６）
		for (int i = 0; i < 26; i++) {
			dSet[i] = new TreeSet<Integer>();
		}
		for (int i = 0; i < D; i++) {
			dSet[A[i]-1].add(i);
		}
		int M = ni();
		int d, q;
		long ans = calc(A);
//		out.println(" 愚直解　[" + ans + "]");
		for (int i = 0; i < M; i++) {
			d = ni()-1;
			q = ni()-1;
			ans = update(ans, d, q);
			out.println(ans);
//			out.println(" 更新[" + ans + "]  愚直解[" + calc(A) + "]");
		}
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
