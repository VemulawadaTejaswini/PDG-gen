import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	int num = 0;
	//入力値
	int      N;
	String[] S;
	long[]   C;
	
	class Element implements Comparable<Element>{
		int originalNumber;
		String left, right;
		long cost = 0L;
		
		public Element() {
			this.originalNumber = num;
			num++;
		}
		
		public Element(int index){
			this();
			left  = "";
			right = S[index];
			cost  = C[index];
		}
		
		public Element(int left, int right) {
			this();
			this.left  = S[left];
			this.right = S[right];
			this.cost  = C[left] + C[right];
		}
		
		public Element(String left, String right, long cost) {
			this();
			this.left  = left;
			this.right = right;
			this.cost  = cost;
		}
		
		@Override
		public int compareTo(Element o) {
			if (cost > o.cost)
				return  1;
			else if (cost < o.cost)
				return -1;
			else
				return  this.originalNumber - o.originalNumber;
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		N = scanner.nextInt();
		S = new String[N];
		C = new long[N];
		
		TreeSet<Element> palindromeSet = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			S[i] = scanner.next();
			C[i] = scanner.nextLong();
			
			palindromeSet.add( new Element(i) );
		}
		
		for (int l = 0; l < N; l++) {
			for (int r = 0; r < N; r++) {
				if (l == r) continue;
				palindromeSet.add( new Element(l,r) );
			}
		}
		
		while( !palindromeSet.isEmpty() ){
			Element elem = palindromeSet.pollFirst();
			
			if ( isPalindrome(elem.left + elem.right) ) {
				System.out.println(elem.cost);
				return;
			}
			
			StringBuilder L = new StringBuilder(elem.left);
			StringBuilder R = new StringBuilder(elem.right);
			boolean isRightLonger = elem.left.length() < elem.right.length();
			
			boolean isContinue = false;
			while(L.length() != 0 && R.length() != 0){
				// 回文にならない
				if (L.charAt(0) != R.charAt(R.length()-1)){
					isContinue = true;
					break;
				}
				
				L.deleteCharAt(0);
				R.deleteCharAt(R.length()-1);
			}
			
			if (isContinue) continue;
			
			if ( isRightLonger ) {
				//すでに回文である
				if (isPalindrome(R.toString())) {
					System.out.println(elem.cost);
					return;
				}
				
				String reverse = new StringBuilder(R).reverse().toString();
				for (int i = 0; i < N; i++) {
					if ( S[i].startsWith(reverse) ) {
						palindromeSet.add( new Element(S[i], R.toString(), elem.cost + C[i]) );
					}
				}
				
			} else {
				//終了条件：すでに回文である
				if (isPalindrome(L.toString())) {
					System.out.println(elem.cost);
					return;
				}
				
				String reverse = new StringBuilder(L).reverse().toString();
				for (int i = 0; i < N; i++) {
					if ( S[i].endsWith(reverse) ) {
						palindromeSet.add( new Element(L.toString(), S[i], elem.cost + C[i]) );
					}
				}
			}
			
		}
		
		System.out.println(-1);
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
