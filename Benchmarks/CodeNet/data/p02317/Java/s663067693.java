import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n+1];
		for (int i=1; i<n+1; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int[] dp = new int[n+1];
		int max = 0;

		for (int i=1; i<n+1; i++) {
			dp[i] = 1;
			for (int j=0; j<i; j++) {
				if (a[j] < a[i]) {
					dp[i] = Math.max(dp[i],dp[j]+1);
				}
			}
			dp[i] = max = Math.max(max,dp[i]);
		}

		System.out.println(dp[n]);

		br.close();
	}
}