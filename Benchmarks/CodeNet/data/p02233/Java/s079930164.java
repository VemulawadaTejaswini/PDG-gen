import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	static int[] dp;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		dp = new int[n + 1];

		System.out.println(f(n));
	}

	static int f(int n) {

		if (n == 0)
			return 1;
		if (n == 1)
			return 1;

		if (dp[n] != 0)
			return dp[n];

		return dp[n] = f(n - 1) + f(n - 2);

	}

}