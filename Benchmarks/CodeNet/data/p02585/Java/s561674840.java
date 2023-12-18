import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt() - 1;
		}
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		int[] L = new int[N];
		long[] sum = new long[N];
		for (int i = 0; i < N; i++) {
			if (L[i] > 0) continue;
			int cnt = 0;
			long tmp = 0;
			for (int j = i; L[j] == 0; j = P[j]) {
				cnt++;
				tmp += C[j];
				L[j] = -1;
			}
			for (int j = i; L[j] < 0; j = P[j]) {
				L[j] = cnt;
				sum[j] = tmp;
			}
		}
		long ans = -1L << 50;
		for (int i = 0; i < N; i++) {
			long tmp = K / L[i] > 0 ? sum[i] * ((K / L[i]) - 1) : 0;
			if (tmp < 0) tmp = 0;
			int T = K / L[i] > 0 ? K % L[i] + L[i] : K;
			for (int k = 0, j = i; k < T; k++) {
				tmp += C[j];
				j = P[j];
				ans = Math.max(tmp, ans);
			}
		}
		System.out.println(ans);
	}
}
