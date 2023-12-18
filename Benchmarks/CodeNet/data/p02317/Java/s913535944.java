import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
		longestIncreasingSubsequence(a);
		// int N = sc.nextInt();
		// double[] x = new double[N];
		// double[] r = new double[N];
		// for (int i = 0; i < N; ++i) {
		// x[i] = sc.nextDouble();
		// r[i] = sc.nextDouble();
		// }
		// double[][] arr = new double[N][];
		// for (int i = 0; i < N; ++i) {
		// arr[i] = new double[] { x[i] + r[i], x[i] - r[i] };
		// }
		// Arrays.sort(arr, new Comparator<double[]>() {
		// @Override
		// public int compare(double[] o1, double[] o2) {
		// return Double.compare(o1[0], o2[0]);
		// }
		// });
		// int ans = 0;
		// double[] dp = new double[N];
		// Arrays.fill(dp, Double.MAX_VALUE / 10);
		// for (int i = 0; i < N; ++i) {
		// int left = -1;
		// int right = N;
		// while (right - left > 1) {
		// int middle = (left + right) / 2;
		// if (dp[middle] < arr[i][1]) {
		// left = middle;
		// } else {
		// right = middle;
		// }
		// }
		// dp[left + 1] = arr[i][1];
		// ans = Math.max(ans, left + 1);
		// }
		// System.out.println(ans + 1);
	}

	static void longestIncreasingSubsequence(int[] a) {
		int N = a.length;
		int ans = 0;
		double[] dp = new double[N];
		Arrays.fill(dp, Double.MAX_VALUE / 10);
		for (int i = 0; i < N; ++i) {
			int left = -1;
			int right = N;
			while (right - left > 1) {
				int middle = (left + right) / 2;
				if (dp[middle] < a[i]) {
					left = middle;
				} else {
					right = middle;
				}
			}
			dp[left + 1] = a[i];
			ans = Math.max(ans, left + 1);
		}
		++ans;
		System.out.println(ans);

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}