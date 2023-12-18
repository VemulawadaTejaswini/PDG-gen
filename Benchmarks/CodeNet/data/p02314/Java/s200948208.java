import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.*;
public class Main {
	static int INF = (int)1e9 + 7;
	int N,M;
	int[] c;
	int[][] dp;
	
	public int dfs(int n,int s){
		
		if(n == M){
			if(s == 0){
				return 0;
			}else{
				return INF;
			}
		}
		
		int ret = INF;
		
		if(s - c[n] >= 0){
			ret = Math.min(ret,dfs(n + 1,s - c[n]) + 1);
			ret = Math.min(ret,dfs(n,s - c[n]) + 1);
		}
		ret = Math.min(ret,dfs(n + 1,s));
		return ret;
	}
	
	public void solve() {
		N = nextInt();
		M = nextInt();
		c = new int[M];
		dp = new int[M + 1][N + 1];
		
		for(int i = 0;i < M;i++){
			c[i] = nextInt();
		}
		
		for(int i = 0;i < M + 1;i++){
			Arrays.fill(dp[i],-1);
		}
		out.println(dfs(0,N));
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