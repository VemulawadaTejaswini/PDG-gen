import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long[] dp = new long[(int) N + 1];
		long res = 0;
		for (int i = 1; i <= N; i++) {
			long pos = i;
			dp[(int) pos] += 1;
			while (pos + i <= N) {
				pos += i;
				dp[(int) pos] += 1;
			}
			res += i * dp[i];
		}
		System.out.println(res);
	}
}