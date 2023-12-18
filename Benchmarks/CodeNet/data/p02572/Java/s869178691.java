import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		long sum = 0;
		long ans = 0;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		for (int i = N - 1; i >= 0; i--) {
			sum -= a[i];
			ans = (ans + a[i] * sum) % 1_000_000_007;
		}
		System.out.println(ans);
	}
}
