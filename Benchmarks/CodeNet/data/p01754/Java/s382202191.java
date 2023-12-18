import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long P = sc.nextLong();
		long Q = sc.nextLong();
		long[] C = new long[(int)N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		Long[] a = new Long[(int)N];
		for (int i = 0; i < N; i++) {
			a[i] = C[i] + i * P;
		}
		Arrays.sort(a, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return -Long.compare(o1, o2);
			}
		});
		for (int i = 1; i < N; i++) {
			a[i] += a[i - 1];
		}
		long ans = P * N * (2 * Q + N - 1) / 2;
		long diff = N * (N - 1) * P / 2;
		// i + 1:?£??????§?£??????????????????°???
		for (int i = 0; i < N; i++) {
			ans = Math.max(ans, a[i] + P * (N - (i + 1)) * (2 * Q + 2 * (N - (i + 1) - 1)) / 2 - diff);
		}
		System.out.println(ans);
	}
}