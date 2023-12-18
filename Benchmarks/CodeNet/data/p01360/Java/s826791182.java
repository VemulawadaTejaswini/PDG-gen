import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	char[] ch;
	int[][] dp;

	//pre = 0,pre = 1

	public int dfs(int n, int pre, int left, int right) {

		if (n == ch.length)
			return 0;

		if(dp[n][pre + 1]!= -1){
			return dp[n][pre + 1];
		}

		int next = ch[n] - '0';
		int ret = Integer.MAX_VALUE;

		if (pre == -1) {

			ret = Math.min(ret, dfs(n + 1, 0, next, right));
			ret = Math.min(ret, dfs(n + 1, 1, left, next));

		} else if (pre == 0) {

			if(right == -1 || next % 3 <= right % 3){
				ret = Math.min(ret, dfs(n + 1,0,next,right) + 1);
			}

			if(next % 3 >= left % 3){
				ret = Math.min(ret, dfs(n + 1,1,left,next));
			}
		} else {
			if(next % 3 <= right % 3){
				ret = Math.min(ret,dfs(n + 1,0,next,right));
			}

			if(left == -1 || next % 3 >= left % 3){
				ret = Math.min(ret, dfs(n + 1,1,left,next) + 1);
			}
		}

		return dp[n][pre + 1] = ret;
	}

	public void solve() {
		while (true) {

			String S = next();

			if (S.equals("#"))
				break;
			ch = S.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				ch[i] = (char) (ch[i] - 1);
			}

			dp = new int[ch.length + 1][3];
			for(int i = 0;i < ch.length + 1;i++){
				for(int j = 0;j < 3;j++){
					dp[i][j] = -1;
				}
			}

			out.println(dfs(0, -1, -1, -1));
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