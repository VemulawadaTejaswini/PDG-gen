import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	//入力値
	int      N;
	String[] S;
	long[]   C;
	
	long minCost = Long.MAX_VALUE;
	
	public Main() {
		FastScanner scanner = new FastScanner();
		N = scanner.nextInt();
		S = new String[N];
		C = new long[N];
		
		for (int i = 0; i < N; i++) {
			S[i] = scanner.next();
			C[i] = scanner.nextLong();
			
			//文字列１つで既に回文状態にあるものを探す
			if ( isPalindrome(S[i]) ){
				minCost = Math.min(minCost, C[i]);
			}
		}
		
		for (int l = 0; l < N; l++) {
			for (int r = 0; r < N; r++) {
				if (minCost <= C[l] + C[r]) continue;
				
				solve(S[l], S[r], C[l] + C[r]);
			}
		}
		
		if (minCost == Long.MAX_VALUE){
			System.out.println(-1);
		} else {
			System.out.println(minCost);
		}
	}
	
	void solve(String L, String R, long costSum){
		int left = 0, right = R.length() - 1;
		
		while(true){
			//終了条件：回文ではない
			if (L.charAt(left) != R.charAt(right)) return;
			
			if (left == L.length() - 1 || right == 0){
				L = L.substring(left + 1);
				R = R.substring(0, right);
				break;
			}
			
			left++;
			right--;
		}
		
		if (L.isEmpty()){
			//終了条件：すでに回文である
			if (isPalindrome(R)) {
				minCost = Math.min(minCost, costSum);
				return;
			}
			
			String reverse = new StringBuffer(R).reverse().toString();
			for (int i = 0; i < N; i++) {
				//costが減ることは無いのでcostの最小値を超えた時点で枝かり
				if (minCost <= costSum + C[i]) continue;
				
				if ( S[i].startsWith(reverse) ) {
					solve(S[i], R, costSum + C[i]);
				}
			}
		} else {
			//終了条件：すでに回文である
			if (isPalindrome(L)) {
				minCost = Math.min(minCost, costSum);
				return;
			}
			
			String reverse = new StringBuffer(L).reverse().toString();
			for (int i = 0; i < N; i++) {
				//costが減ることは無いのでcostの最小値を超えた時点で枝かり
				if (minCost <= costSum + C[i]) continue;
				
				if ( S[i].endsWith(reverse) ) {
					solve(L, S[i], costSum + C[i]);
				}
			}
		}
	}
	
	// 文字列sが回文かどうかを判定する．
	// 0文字はtrue
	boolean isPalindrome(String s){
		int len = s.length();
		
		for (int i = 0; 2*i + 1 < len; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1))
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		new Main();
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
	
	private int readByte() {
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}
	
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
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
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
