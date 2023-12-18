import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		long[][] mtx = new long[N][N];
		long[] wk = new long[N];

		wk[0] = 0;
		for (int i = 0; i < N; i++) {
			mtx[i][0] = a[i];
			wk[0] += mtx[i][0];
		}
		for (int j = 1; j < N; j++) {
			wk[j] = 0;
			for (int i = 0; i < N; i++) {
				mtx[i][j] = Math.min(mtx[i][j - 1], a[(i + j) % N]);
				wk[j] += mtx[i][j];
			}
		}

		long ans = Long.MAX_VALUE;
		for (int j = 0; j < N; j++) {
			ans = Math.min(ans, wk[j] + x * j);
		}
		System.out.println(ans);
	}
}
