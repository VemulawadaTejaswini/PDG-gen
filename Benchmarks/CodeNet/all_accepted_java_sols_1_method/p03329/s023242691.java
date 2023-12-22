import java.util.Scanner;

public class Main {
	static int MAX = 100000;
	static int dp[] = new int[MAX + 10];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		dp[0] = 0;

		for (int i = 1; i <= MAX; i++) {
			dp[i] = MAX;
			int power = 1;
			while (power <= i) {
				dp[i] = Math.min(dp[i], dp[i - power] + 1);
				power *= 6;
			}
			power = 1;
			while(power <= i) {
				dp[i] = Math.min(dp[i], dp[i - power] + 1);
				power *= 9;
			}
		}

		System.out.println(dp[N]);
	}
}