import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	int N;
	char[] ch;
	
	public boolean isCat(int m,int w){
		if(m >= w)return true;
		
		if(ch[m] == 'm' && ch[w] == 'w'){
			for(int e = m + 1;e < w;e++){
				if(ch[e] == 'e'){
					if(isCat(m + 1,e - 1) && isCat(e + 1,w - 1)){
						return true;
					}
				}
			}
		}
		return false;
	}
	
    public void solve() {
		ch = next().toCharArray();
		N = ch.length;
		if(isCat(0,N - 1)){
			out.println("Cat");
		}else{
			out.println("Rabbit");
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