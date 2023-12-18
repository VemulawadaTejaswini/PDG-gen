import java.util.*; 
import java.io.*;

public class Main {
	
	public static int check(int n , Set<Integer> set) {
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				if(n/i == i) {
					if(set.contains(i)) return 0; 
				}
				else {
					if(set.contains(i) || set.contains(n/i)) return 0; 
				}
			}
		}
		return 1; 
	}
	public static void solve(InputReader in) {
		int n = in.readInt(); 
		int a[] = new int[n]; 
		
		for(int i = 0; i<n; i++)
			a[i] = in.readInt(); 
		
		Set<Integer> set = new HashSet<>(); 
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		for(int i : a) {
			set.add(i); 
			map.put(i, map.getOrDefault(i, 0) + 1); 
		}
		if(map.get(1) != null) {
			int k = map.get(1); 
			if(k == 1) {
				System.out.println(1); 
				return; 
			}
			else {
				System.out.println(0); 
				return; 
			}
		}
		
		int count = 0; 
		
		for(int j = 0; j<n; j++) {
			if(check(a[j] , set) == 1 && map.get(a[j]) == 1) count++; 
		}
		
		System.out.println(count); 
	}
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in); 
		int t = 1; 
		while(t-- > 0) {
			solve(in); 
		}
	}
}

class InputReader{
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	 public InputReader(InputStream stream) {
		this.stream = stream;
	}

     public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

     public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

     public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

     public long readLong() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9') {
				throw new InputMismatchException();
			}
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	
     public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
     
     public String next() {
		return readString();
	}
    
     public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
