import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
public class Main {
	int N;
	int[] M,L;
	int[][] S,E;
	boolean[] used;
	public long dfs(int n){
		if(n == N){
			return 0L;
		}
		
		long ret = 0;
		boolean ok = true;
		for(int j = 0;j < M[n];j++){
			for(int s = S[n][j];s < E[n][j];s++){
				if(used[s]){
					ok = false;
					break;
				}
			}
			if(!ok)break;
		}
		if(ok){
			
			for(int j = 0;j < M[n];j++){
				for(int s = S[n][j];s < E[n][j];s++){
					used[s] = true;
				}
			}
			
			ret = Math.max(ret,dfs(n + 1) + L[n]);
			
			for(int j = 0;j < M[n];j++){
				for(int s = S[n][j];s < E[n][j];s++){
					used[s] = false;
				}
			}
		}
		ret = Math.max(ret,dfs(n + 1));
		return ret;
	}
	
	public void solve(){
		
		while(true){
			N = nextInt();
			if(N == 0)break;
			used = new boolean[23];
			M = new int[N];
			L = new int[N];
			S = new int[N][];
			E = new int[N][];
			for(int i = 0;i < N;i++){
				M[i] = nextInt();
				L[i] = nextInt();
				S[i] = new int[M[i]];
				E[i] = new int[M[i]];
				for(int j = 0;j < M[i];j++){
					S[i][j] = nextInt();
					E[i][j] = nextInt();
				}
			}
			out.println(dfs(0));
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