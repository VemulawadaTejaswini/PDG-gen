import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main implements Runnable {
	static final int INF = (int)1e9+7;
	int N,M;
	char[] a,b;
	int[][] dp;

	public int dfs(int x,int y){

		if(x == 0 && y == 0){
			return 0;
		}

		if(x == 0){
			return y;
		}

		if(y == 0){
			return x;
		}

		if(dp[x][y] != INF)return dp[x][y];

		int ret = INF;

		//add
		if(x > 0){
			ret = Math.min(ret,dfs(x-1,y) + 1);
		}

		//remove
		if(y > 0){
			ret = Math.min(ret, dfs(x,y-1) + 1);
		}

		//replace
		if(x > 0 && y > 0){
			ret = Math.min(ret, dfs(x-1,y-1) + (a[x-1] == b[y-1] ? 0 : 1));
		}
		return dp[x][y] = ret;
	}

	public void solve() {
		a = next().toCharArray();
		b = next().toCharArray();

		N = a.length;
		M = b.length;

		dp = new int[N+1][M+1];
		for(int i = 0;i < N+1;i++){
			for(int j = 0;j < M+1;j++){
				dp[i][j] = INF;
			}
		}
		out.println(dfs(N,M));

	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start();
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

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}