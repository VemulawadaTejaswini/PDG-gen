import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		setIO();

		st = nl();
		int N = ni(st), K = ni(st);
		
		int[][] S = new int[K][2];
		for (int i = 0; i < K; i++) {
			st = nl();
			int L = ni(st), R = ni(st);
			S[i][0] = L;
			S[i][1] = R;
		}
		
		final int MOD = 998244353;
		
		long[] dp = new long[N+1];
		long[] pre = new long[N+2];
		dp[1] = 1; pre[1] = 0;
		for (int i = 1; i <= N; i++) {
			for (int k = 0; k < K; k++) {
				int L = Math.max(0, i - S[k][0]);
				int R = Math.max(0, i - S[k][1]);
				
				long temp = (pre[L+1] - pre[R]) % MOD;
				if (temp < 0) temp += MOD;
				
				dp[i] += temp;
				dp[i] %= MOD;
			}
			
			pre[i+1] = pre[i] + dp[i];
			pre[i] %= MOD;
		}
		
		//out.println(Arrays.toString(dp));
		//out.println(Arrays.toString(pre));
		
		out.println(dp[N]);
		
		f.close();
		out.close();
	}

	static BufferedReader f;
	static PrintWriter out;
	static StringTokenizer st;

	static String rl() throws IOException {
		return f.readLine();
	}

	static int ni(StringTokenizer st) {
		return Integer.parseInt(st.nextToken());
	}

	static long nlg(StringTokenizer st) {
		return Long.parseLong(st.nextToken());
	}

	static int ni() throws IOException {
		return Integer.parseInt(rl());
	}

	static long nlg() throws IOException {
		return Long.parseLong(rl());
	}

	static StringTokenizer nl() throws IOException {
		return new StringTokenizer(rl());
	}

	static int[] nia(int N) throws IOException {
		StringTokenizer st = nl();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = ni(st);
		return A;
	}

	static void setIn(String s) throws IOException {
		f = new BufferedReader(new FileReader(s));
	}

	static void setOut(String s) throws IOException {
		out = new PrintWriter(new FileWriter(s));
	}

	static void setIn() {
		f = new BufferedReader(new InputStreamReader(System.in));
	}

	static void setOut() {
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	}

	static void setIO(String s) throws IOException {
		setIn(s + ".in");
		setOut(s + ".out");
	}

	static void setIO() {
		setIn();
		setOut();
	}
}
