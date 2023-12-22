
import java.util.*;

public class Main {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int arr[] = new int[n+1];
		for (int i = 1; i <=n; i++) {
			arr[i] = scn.nextInt();

		}
		
		System.out.println(frog(arr, k,n));

	}

	public static int frog(int[] arr, int k,int n) {
		int dp[] = new int[n + 1];
		
		for (int i = 2; i <=n; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = i - 1; j >= 1 && (i - j) <= k; j--) {
				dp[i] = Math.min(dp[i], Math.abs(arr[i] - arr[j]) + dp[j]);
			}

		}
		return dp[n];

	}
}