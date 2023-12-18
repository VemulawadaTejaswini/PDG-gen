import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		
		boolean isPairwiseCoprime = true;
		
		HashSet<Integer> CD = new HashSet<>();
		
		int zero = scanner.nextInt();
		CD.add(zero);
		for (int i = 2; i*i <= zero; i++) {
			if ( zero % i == 0) {
				CD.add(i);
				CD.add(zero/i);
			}
		}
		
		int one = scanner.nextInt();
		if (CD.contains(one)) isPairwiseCoprime = false;
		CD.add(one);
		for (int i = 2; i*i <= one; i++) {
			if ( one % i == 0) {
				if (CD.contains(i) || CD.contains(one/i)) isPairwiseCoprime = false;
				CD.add(i);
				CD.add(one/i);
			}
		}
		
		int gcd = GCD(zero, one);
		
		for (int i = 2; i < N; i++) {
			int A = scanner.nextInt();
			
			gcd = GCD(gcd, A);
			
			if (!isPairwiseCoprime) continue;
			
			if (CD.contains(A)) isPairwiseCoprime = false;
			CD.add(A);
			
			for (int j = 2; j*j <= A; j++) {
				if ( A % j == 0) {
					if (CD.contains(j) || CD.contains(A/j)) isPairwiseCoprime = false;
					CD.add(j);
					CD.add(A/j);
				}
			}
		}
		
		if (isPairwiseCoprime){
			System.out.println("pairwise coprime");
		} else if (gcd == 1){
			System.out.println("setwise coprime");
		} else {
			System.out.println("not coprime");
		}
	}
	
	int GCD(int a, int b){
		int tmp;
		while ( (tmp = a%b) != 0){
			a = b;
			b = tmp;
		}
		return b;
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
