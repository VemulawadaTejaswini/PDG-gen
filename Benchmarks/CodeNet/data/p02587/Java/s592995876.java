import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	//入力値
	int      N;
	String[] S;
	long[]   C;
	
	long minCost = Long.MAX_VALUE;
	
	class Element implements Comparable<Element>{
		String left, right;
		long cost = 0L;
		
		public Element(int index){
			left  = S[index];
			right = "";
			cost  = C[index];
		}
		
		public Element(int left, int right) {
			this.left  = S[left];
			this.right = S[right];
			this.cost  = C[left] + C[right];
		}
		
		public Element(String left, String right, long cost) {
			this.left  = left;
			this.right = right;
			this.cost  = cost;
		}
		
		@Override
		public int compareTo(Element o) {
			return (int)( (cost - o.cost) % 1000000007L );
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		N = scanner.nextInt();
		S = new String[N];
		C = new long[N];
		
		for (int i = 0; i < N; i++) {
			S[i] = scanner.next();
			C[i] = scanner.nextLong();
		}
		
		TreeSet<Element> palindromeSet = new TreeSet<>();
		for (int l = 0; l < N; l++) {
			if (isPalindrome(S[l]))
				minCost = Math.min(minCost, C[l]);
			
			for (int r = 0; r < N; r++) {
				if (l == r) continue;
				palindromeSet.add( new Element(l,r) );
			}
		}
		
		while( !palindromeSet.isEmpty() ){
			Element elem = palindromeSet.pollFirst();
			String L  = elem.left;
			String R  = elem.right;
			long cost = elem.cost;
			
			if (minCost < cost){
				System.out.println(minCost);
				return;
			}
			
			int left = 0, right = R.length()-1;
			boolean isContinue = false;
			
			while(true){
				// 回文にならない
				if (L.charAt(left) != R.charAt(right)){
					isContinue = true;
					break;
				}
				
				if (left == L.length()-1 || right == 0){
					L = L.substring(left + 1);
					R = R.substring(0, right);
					break;
				}
				
				left++;
				right--;
			}
			
			if (isContinue) continue;
			
			if (L.isEmpty()){
				//すでに回文である
				if (isPalindrome(R)) {
					System.out.println(cost);
					return;
				}
				
				String reverse = new StringBuffer(R).reverse().toString();
				for (int i = 0; i < N; i++) {
					if ( S[i].startsWith(reverse) ) {
						palindromeSet.add( new Element(S[i], R, cost + C[i]) );
					}
				}
				
			} else {
				//終了条件：すでに回文である
				if (isPalindrome(L)) {
					System.out.println(cost);
					return;
				}
				
				String reverse = new StringBuffer(L).reverse().toString();
				for (int i = 0; i < N; i++) {
					if ( S[i].endsWith(reverse) ) {
						palindromeSet.add( new Element(L, S[i], cost + C[i]) );
					}
				}
			}
			
		}
		
		System.out.println(-1);
	}
	
	/*
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
	 */
	
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
