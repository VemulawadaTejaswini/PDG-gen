import java.util.Arrays;
import java.util.Scanner;

// aoj DPL_1_D
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// LIS O(n log n)
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);

		for (int j = 0; j < n; j++) {
			int i = lower_bound(dp, 0, n, a[j]);
			dp[i] = a[j];
		}

		System.out.println(lower_bound(dp, 0, n, Integer.MAX_VALUE));
		
		sc.close();
	}

	// [l,r)????????????data[i]>=value??¨??????????°????i???????????????
	private static int lower_bound(int[] data, int l, int r, int value) {
		while (r > l) {
			int mid = (r + l) / 2;
			if (data[mid] >= value) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		
		return r;
	}
}