import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	//入力値
	int      N;
	String[] S;
	long[]   C;
	
	class Element {
		String left, right;
		long cost = 0L;
		
		public Element(String left, String right, long cost) {
			this.left  = left;
			this.right = right;
			this.cost  = cost;
		}
		
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		N = scanner.nextInt();
		S = new String[N];
		C = new long[N];
		
		LinkedList<Element> Q = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			S[i] = scanner.next();
			C[i] = scanner.nextLong();
			
			Q.add( new Element(S[i], "", C[i]) );
		}
		
		long minCost = Long.MAX_VALUE;
		
		while( !Q.isEmpty() ){
			Element elem = Q.pollFirst();
			
			if (minCost <= elem.cost) continue;
			
			if ( isPalindrome(elem.left + elem.right) ) {
				minCost = elem.cost;
				continue;
			}
			
			StringBuilder L = new StringBuilder(elem.left);
			StringBuilder R = new StringBuilder(elem.right);
			
			while(L.length() != 0 && R.length() != 0){
				// 回文にならない
				if (L.charAt(0) != R.charAt(R.length()-1)) break;
				
				L.deleteCharAt(0);
				R.deleteCharAt(R.length()-1);
			}
			
			if ( L.length() == 0 ){
				for (int i = 0; i < N; i++) {
					Q.add( new Element(S[i], R.toString(), elem.cost + C[i]) );
				}
			} else if (R.length() == 0){
				for (int i = 0; i < N; i++) {
					Q.add( new Element(L.toString(), S[i], elem.cost + C[i]) );
				}
			}
			
		}
		
		if (minCost == Long.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(minCost);
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
