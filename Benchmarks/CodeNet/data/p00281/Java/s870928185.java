import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	static Scanner stdIn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> s = new ArrayList<Integer>();
		ArrayList<Integer> t = new ArrayList<Integer>();
		ArrayList<Integer> e = new ArrayList<Integer>();
		while(true) {
			int ts = sc.nextInt();
			int tt = sc.nextInt();
			int te = sc.nextInt();
			
			if(ts == 0 && tt == 0 && te == 0) break;
			s.add(ts);
			t.add(tt);
			e.add(te);
		}
		
		int l = sc.nextInt();
		for(int i = 0; i < l; i++) {
			int[] list = new int[m];
			int[] ans = new int[n];
			for(int j = 0; j < m; j++) {
				list[j] = sc.nextInt();
			}
			for(int j = 0; j < s.size(); j++) {
				int ts = s.get(j);
				int tt = t.get(j);
				int te = e.get(j);
			
				ans[ts-1] += list[tt-1] * te;
			}
			out.print(ans[0]);
			for(int j = 1; j < n; j++) {
				out.print(" " + ans[j]);
			}
			out.println();
		}
		out.flush();
		
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
	private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
		return (int)nextLong();
	}
 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
 
}