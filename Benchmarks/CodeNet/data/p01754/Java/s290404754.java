import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		int[] a = new int[N];// ?£??????§????????????????????£??????
		for (int i = 0; i < N; i++) {
			a[i] = C[i] + i * P;
		}
		Arrays.sort(a);
		for (int i = 1; i < N; i++) {
			a[i] += a[i - 1];
		}
		long ans = N * (Q + N - 1) / 2;
		long diff = N * (N - 1) * P / 2;
		// i + 1:?£??????§?£??????????????????°???
		for (int i = 0; i < N; i++) {
			ans = Math.max(ans, a[i] + P * (N - (i + 1)) * (Q + Q + N - (i + 1) - 1) / 2 - diff);
		}
		System.out.println((ans - diff));
	}
}