import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

import java.util.HashSet;

public class Main {
	
	int N;
	char[] B = {'a','i','u','e','o'};
	public void solve() {
		while(true){
			N = nextInt();
			if(N == 0)break;
			String[] S = new String[N];
			for(int i = 0;i < N;i++){
				String s = next();
				StringBuilder sb = new StringBuilder();
				boolean preB = false;
				for(int j = 0;j < s.length();j++){
					if(j == 0 || preB){
						if(preB)preB = false;
						sb.append(s.charAt(j));
					}
					
					for(int k = 0;k < B.length;k++){
						if(B[k] == s.charAt(j)){
							preB = true;
						}
					}
				}
				
				S[i] = sb.toString();
			}
			
			
			boolean isAns = false;
			for(int i = 1;i <= 50;i++){
				HashSet<String> set = new HashSet<String>();
				boolean ok = true;
				for(int j = 0;j < N;j++){
					if(set.contains(S[j].substring(0,Math.min(S[j].length(),i)))){
						ok = false;
						break;
					}else{
						set.add(S[j].substring(0,Math.min(S[j].length(),i)));
					}
				}
				
				if(ok){
					out.println(i);
					isAns = true;
					break;
				}
			}
			
			if(!isAns){
				out.println(-1);
			}
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