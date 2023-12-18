import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main implements Runnable {
	int N,M;
	char[] a,b;
	int[][] dp;

	public void solve() {
		a = next().toCharArray();
		b = next().toCharArray();

		N = a.length;
		M = b.length;

		dp = new int[N+1][M+1];

		for(int i = 0;i < M+1;i++){
			dp[0][i] = i;
		}

		for(int i = 0;i < N+1;i++){
			dp[i][0] = i;
		}

		for(int i = 1;i < N+1;i++){
			for(int j = 1;j < M+1;j++){
				int min = Math.min(dp[i-1][j]+1,dp[i][j-1]+1);
				if(a[i-1] == b[j-1]){
					min = Math.min(min, dp[i-1][j-1]);
				}else{
					min = Math.min(min, dp[i-1][j-1]+1);
				}
				dp[i][j] = min;
			}
		}

		out.println(dp[N][M]);

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