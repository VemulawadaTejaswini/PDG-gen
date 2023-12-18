import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
	static int v = 0;
	static List<List<Integer>> ansList = null;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] sa = br.readLine().split(" ");
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(sa[i]);
		}

		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] min = new int[n];
		int[] max = new int[n];
		Arrays.fill(min, 1);
		Arrays.fill(max, Integer.MAX_VALUE);
		min[0] = t[0];
		max[0] = t[0];
		for (int i = 1; i < n; i++) {
			if (t[i - 1] == t[i]) {
				max[i] = max[i - 1];
			} else {
				min[i] = t[i];
				max[i] = t[i];
			}
		}

		if (min[n - 1] <= a[n - 1] && a[n - 1] <= max[n - 1]) {
			min[n - 1] = a[n - 1];
			max[n - 1] = a[n - 1];
		} else {
			System.out.println(0);
			return;
		}
		for (int i = n - 2; i >= 0; i--) {
			if (a[i + 1] == a[i]) {
				max[i] = Math.min(max[i], max[i + 1]);
			} else {
				if (min[i] <= a[i] && a[i] <= max[i]) {
					min[i] = a[i];
					max[i] = a[i];
				} else {
					System.out.println(0);
					return;
				}
			}
		}

		long ans = 1;
		for (int i = 0; i < n; i++) {
			int d = max[i] - min[i] + 1;
			ans *= d;
			ans %= 1000000007;
		}
		System.out.println(ans);
	}
}
