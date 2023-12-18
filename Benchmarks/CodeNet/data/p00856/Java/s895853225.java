import java.util.*;
import java.io.*;
import java.math.*;

import javax.xml.crypto.Data;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		while(true) {
			n = sc.nextInt();
			int t = sc.nextInt();
			int l = sc.nextInt();
			int b = sc.nextInt();
			if(n == 0 && t == 0 && l == 0 && b == 0) break;
			int[] listA = new int[n+1];
			for(int i = 0; i < l; i++) {
				listA[sc.nextInt()] = 1;
			}
			for(int i = 0; i < b; i++) {
				listA[sc.nextInt()] = 2;
			}
			double dp[][] = new double[t+1][n+1];
			dp[0][0] = 1;
			for(int i = 0; i < t; i++) {
				for(int j = 0; j < n; j++) {
					for(int k = 1; k <= 6; k++) {
						if(listA[dif(j+k)] == 1) {
							//dp[i+1][dif(j+k)] += dp[i][j]*(1.0/6.0);
							if(i+2 > n) continue;
							dp[i+2][dif(j+k)] += dp[i][j]*(1.0/6.0);
						}
						else if(listA[dif(j+k)] == 2) {
							dp[i+1][0]        += dp[i][j]*(1.0/6.0);
						}
						else {
							dp[i+1][dif(j+k)] += dp[i][j]*(1.0/6.0);
						}
					}
				}
			}
			double sum = 0.0;
			for(int i = 0; i <= t; i++) {
				sum += dp[i][n];
			}
			out.println(sum);
		}
		out.flush();
	}
	static int dif(int a) {
		if(a > n) {
			System.out.println(n + n - a + " " + a + " " + n);
			return n + n-a;
		}
		else {
			return a;
		}
	}


}


//-----------------Template------------------//
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
		 if (!hasNext()) throw new NoSuchElementException();
		 int n = 0;
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
	 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	 
 
}