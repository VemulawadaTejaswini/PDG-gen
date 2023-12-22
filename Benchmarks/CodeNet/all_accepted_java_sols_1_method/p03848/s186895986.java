import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (arr[i] != (i + n % 2) / 2 * 2 + (n + 1) % 2) {
				System.out.println(0);
				return;
			}
		}
		int ans = 1;
		for (int i = 0; i < n / 2; i++) {
			ans *= 2;
			ans %= MOD;
		}
		System.out.println(ans);
	}
}
