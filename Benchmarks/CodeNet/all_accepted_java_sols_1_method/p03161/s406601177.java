import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ans = new int[n];
		ans[0] = 0;
		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = Math.max(0, i - k); j < i; j++) {
				int t = ans[j] + Math.abs(arr[j] - arr[i]);
				if (min > t) {
					min = t;
				}
			}
			ans[i] = min;
		}
		System.out.println(ans[n - 1]);
	}
}
