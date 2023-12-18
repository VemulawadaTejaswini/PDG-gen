import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int m = sc.nextInt();
			if (m == 0) {
				break;
			}
			int value[] = new int[m];
			int num[] = new int[m];
			for (int i = 0; i < m; i++) {
				value[i] = sc.nextInt();
				num[i] = sc.nextInt();
			}
			int dp[] = new int[8000];
			dp[0] = 1;
			for (int i = 0; i < m; i++) {
				for (int k = 7999; k >= value[i]; k--) {
					for (int j = 1; j <= num[i]; j++) {
						if (k - value[i] * j >= 0) {
							dp[k] += dp[k - value[i] * j];
						}
					}
				}
			}

			int g = sc.nextInt();
			for (int i = 0; i < g; i++) {
				int n = sc.nextInt();
				System.out.println(dp[n]);
			}

		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}