import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);

		boolean[] dp = new boolean[n];
		Arrays.fill(dp, true);

		int count = 0;
		for (int i = 0; i < n; i++) {

			if (dp[i]) {
				for (int j = i + 1; j < n; j++) {
					if (dp[j]) {
						if (input[i] == input[j])
							dp[i] = dp[j] = false;

						else if (input[j] % input[i] == 0)
							dp[j] = false;
					}
				}
			}

			if (dp[i])
				count++;
		}

		System.out.println(count);
	}
}
