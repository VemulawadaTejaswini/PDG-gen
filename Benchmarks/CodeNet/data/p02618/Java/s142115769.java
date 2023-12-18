import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
import java.util.Random;
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
	final int KIND = 26;
	int D;
	int[] C, A;
	int[][] S;
	TreeSet<Integer>[] dSet = new TreeSet[KIND];		// タイプ別の日付（０－）のセット

	long calcScore(int[] schedule) {		// 答えの配列から結果を計算する
		long score = 0, wk;
		int[] last = new int[KIND];
		Arrays.fill(last, -1);
		int type;
		for (int d = 0; d < D; d++) {
			type = schedule[d];		// 0 - 25
			score += S[d][type];
			last[type] = d;
			for (int j = 0; j < KIND; j++) {
				wk = (long)C[j] * (d - last[j]);
				score -= wk;
			}
//			out.println(score);
		}
		return score;
	}
	long add(long score, int d, int q) {
		score += S[d][q];
		Integer left = dSet[q].lower(d);
		Integer right = dSet[q].higher(d);
		left = (left == null ? -1 : left);
		right = (right == null ? D : right);
		int len1 = right - left - 1;
		int len2 = d - left - 1;
		int len3 = right - d - 1;
		score +=  ((long)len1 * (len1+1) * C[q] / 2);
		score -=  ((long)len2 * (len2+1) * C[q] / 2);
		score -=  ((long)len3 * (len3+1) * C[q] / 2);
		A[d] = q;
		dSet[q].add(d);
//		out.println("add   S[" + d + "][" + q + "] = " + S[d][q] 
//						+ "  left = " + left + "  right = " + right);
//		out.println("      len1 = " + len1 + "  len2 = " + len2 
//						+ "  len3 = " + len3 + "  C[" + q + "] = " + C[q]);
//		out.println("   -->  新しい値を追加した結果[" + score + "]");
		return score;

	}
	long erace(long score, int d) {
		int q = A[d];
		score -= S[d][q];
		Integer left = dSet[q].lower(d);
		Integer right = dSet[q].higher(d);
		left = (left == null ? -1 : left);
		right = (right == null ? D : right);
		int len1 = right - left - 1;
		int len2 = d - left - 1;
		int len3 = right - d - 1;
		score -=  ((long)len1 * (len1+1) * C[q] / 2);
		score +=  ((long)len2 * (len2+1) * C[q] / 2);
		score +=  ((long)len3 * (len3+1) * C[q] / 2);
		A[d] = -1;
		dSet[q].remove(d);
//		out.println("erase  S[" + d + "][" + q + "] = " + S[d][q] 
//						+ "  left = " + left + "  right = " + right);
//		out.println("      len1 = " + len1 + "  len2 = " + len2 
//						+ "  len3 = " + len3 + "  C[" + q + "] = " + C[q]);
//		out.println("   -->  値を削除した結果[" + score + "]");
		return score;

	}
	long update(long score, int d, int q) {	// d日目をタイプq に変更する
		score = erace(score, d);
		score = add(score, d, q);
		return score;
	}
	List<PP> CList = new ArrayList();			// C の大きい順に並んだ　種類（０－２５）のリスト
	List<PP>[] dSList = new ArrayList[KIND];	// S の大きい順に並んだ　日付（０－３６５）のリストの配列（種類）
	int[] Smax;
	public void solve() {
		long start = System.currentTimeMillis();
		D = ni();
		Smax = new int[D];
		C = new int[KIND];
		for (int i = 0; i < KIND; i++) {
			C[i] = ni();			// タイプ別のかけ数（満足度をさげる）
			CList.add(new PP(C[i], i));
			dSList[i] = new ArrayList<PP>();
		}
		CList.sort(comparing(PP::getKey, reverseOrder()));
		S = new int[D][KIND];		// タイプ別の満足度
		int max, no;
		for (int i = 0; i < D; i++) {
			max = 0; no = 0;
			for (int j = 0; j < KIND; j++) {
				S[i][j] = ni();
				dSList[j].add(new PP(S[i][j], i));
				if(max < S[i][j]) {
					max = S[i][j];
					no = j;
				}
			}
			Smax[i] = no;
			CList.sort(comparing(PP::getKey, reverseOrder()));
		}
		for (int i = 0; i < KIND; i++) {
			dSList[i].sort(comparing(PP::getKey, reverseOrder()));;
		}
		CList.sort(comparing(PP::getKey, reverseOrder()));
		Random random = new Random(0);
//		for (int i = 0; i < D; i++)		A[i] = random.nextInt(KIND-1);	// ０－２５　の範囲の乱数
		int cnt = 0, index = 0, cnt2 = 0, wk;
		int[] cc = { 30, 14, 6 };
		A = new int[D];
		Arrays.fill(A, -1);
		LOOP:
		for(PP pp : CList) {
			wk = cc[index];
			for (PP pp2 : dSList[pp.val]) {
				if(A[pp2.val] == -1) {
					A[pp2.val] = pp.val;
					wk--;
					cnt++;
				}
				if(wk < 0)		break;
				if(cnt >= D)	break LOOP;
			}
			cnt2++;
			if(cnt2 >= 15)		index = 2;
			else if(cnt2 >= 5)	index = 1;
		}
		for (int i = 0; i < D; i++) {
			if(A[i] == -1)	out.println("初期設定できていない　i = " + i);
		}
		for (int i = 0; i < KIND; i++) 	dSet[i] = new TreeSet<Integer>();
		for (int i = 0; i < D; i++) 	dSet[A[i]].add(i);
		long current_score = calcScore(A);
//		out.println("初期のスコア　[" + current_score + "]");

		long new_score = 0;
		int d, q, sv;
		while(System.currentTimeMillis() - start < 1900) {
			d = random.nextInt(D-1);
			if(A[d] == Smax[d])		continue;
			sv = A[d];
			q = Smax[d];
			new_score = update(current_score, d, q);
			if(new_score < current_score) {		// ダメなら戻す
				update(new_score, d, sv);
			}
//			out.println("  -->  更新[" + current_score + "]  愚直解[" + calcScore(A) + "]");
		}
		for (int i = 0; i < D; i++) {
			out.println(A[i]+1);
		}
//		try {
//			FileWriter file = new FileWriter("C:\\temp\\output.txt");
//		    PrintWriter pw = new PrintWriter(new BufferedWriter(file));
//			for (int i = 0; i < D; i++) {
//				pw.println(A[i]+1);
//			}
//			pw.close();
//			file.close();
//		} catch (Exception ex) {}

	}
	// Set に入れるなら　PPKEY　を使う！
	class PP {
		public int key, val;
		public PP(int key, int val) {
			this.key = key;
			this.val = val;
		}
		public int getKey() {			return key;		}
		public void setKey(int key) {	this.key = key;	}
		public int getVal() {			return val;		}
		public void setVal(int val) {	this.val = val;	}
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
