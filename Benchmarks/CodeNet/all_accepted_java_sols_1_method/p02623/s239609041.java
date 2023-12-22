import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		long[] B = new long[M];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextLong();
		}
		long[] a = new long[N + 1];
		long[] b = new long[M + 1];
		a[0] = 0;
		b[0] = 0;
		for (int i = 0; i < N; i++) {
			a[i + 1] = a[i] + A[i];
		}
		for (int i = 0; i < M; i++) {
			b[i + 1] = b[i] + B[i];
		}
		int ans = 0;
		int j = M;
		for (int i = 0; i <= N; i++) {
			if (a[i] > K) {
				break;
			}
			while (b[j] > K - a[i]) {
				j--;
			}
			ans = Math.max(ans, i + j);
		}
		System.out.println(ans);
	}

}
