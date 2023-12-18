import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	long[][] memo;
	long MOD = 1000000007;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		// 0: 0と9を双方含む
		// 1: 0のみ含む
		// 2: 9のみ含む
		// 3: 0と9を双方含まない
		memo = new long[N][4];

		// 初期化
		memo[0][0] = 0;
		memo[0][1] = 1;
		memo[0][2] = 1;
		memo[0][3] = 8;
	}

	void calc() {
		for (int i = 1; i < N; ++i) {
			memo[i][0] = (memo[i - 1][0] * 10 + memo[i - 1][1] + memo[i - 1][2]) % MOD;
			memo[i][1] = (memo[i - 1][1] * 9 + memo[i - 1][3]) % MOD;
			memo[i][2] = (memo[i - 1][2] * 9 + memo[i - 1][3]) % MOD;
			memo[i][3] = (memo[i - 1][3] * 8) % MOD;
		}
	}

	void showResult() {
		System.out.println(memo[N - 1][0]);
	}
}