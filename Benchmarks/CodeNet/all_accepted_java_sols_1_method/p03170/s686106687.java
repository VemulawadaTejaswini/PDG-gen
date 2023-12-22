import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int[] a = new int[n];
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] dp = new int[k + 1];
		for (int i = 0; i < n; i++) {
			dp[a[i]] = 1;
		}
		for (int i = 1; i <= k; i++) {
			if (dp[i] == 0) {
				for (int j = 0; j < n; j++) {
					int b = i - a[j];
					if (b < 0) {
						dp[i] = 2;
						break;
					}
					if (dp[b] == 1) {
						dp[i] = 2;
					}
					if (dp[b] == 2) {
						dp[i] = 1;
						break;
					}
				}
			}
		}

		if (dp[k] == 1) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}
	}
}
