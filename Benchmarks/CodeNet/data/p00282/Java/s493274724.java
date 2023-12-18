import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	static Scanner stdIn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static String[] s = new String[] {"","Man","Oku","Cho","Kei","Gai","Jo","Jou","Ko","Kan","Sei","Sai","Gok","Ggs","Asg","Nyt","Fks","Mts"};
	public static void main(String[] args) {
		while(true) {
			int[] list = new int[18];
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			list[0] = a;
			for(int i = 2; i <= b; i++) {
				for(int j = 0; j < 18; j++) {
					list[j] *= a;
				}
				for(int j = 0; j < 17; j++) {
					list[j+1] += list[j] / 10000;
					list[j] %= 10000;
				}
			}
			
			for(int i = 17; i >= 0; i--) {
				if(list[i] != 0) {
					out.print(list[i] + s[i]);
				}
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