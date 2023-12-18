import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
 
public class Main {
	int S,z;
	long[] n;
	public void solve() {
		S = nextInt();
		z = S;
		while(z--> 0){
			n = new long[9];
			for(int i = 0;i < 9;i++){
				n[i] = Long.parseLong(next(),16);
			}
			long N9 = 0;
			for(int i = 0;i < 8;i++){
				N9 += n[i];
			}
			long K = 0;
			int a = (int)((N9&1)^1);
			int b = (int)((n[8]&1)^1);
			
			if(a == b){
				K = 0;
			}else{
				K = 1;
			}
			
			for(int i = 1;i < 32;i++){
				long zero = K;
				N9= 0;
				int xor = 0;
				for(int j = 0;j < 8;j++){
					N9 += (n[j] ^ zero);
				}
				
				a = (int)((N9 >> i)&1);
				b = (int)((n[8] >> i)&1);
				
				if(a == b){
					xor = 0;
				}else{
					xor = 1;
				}
				K = (K | ((long)xor << i));
			}
			
			out.println(Long.toHexString(K));
		}
	}
 
	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}
 
	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;
 
	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}
 
	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}
 
	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}
 
	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}
 
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}
 
	public int nextInt() {
		return Integer.parseInt(next());
	}
 
	public long nextLong() {
		return Long.parseLong(next());
	}
 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}