import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] d = new int[K];
		int[][] A = new int[K][N];
		int[] x = new int[N];
		int ans =0;
		for (int i = 0; i < N; i++) {
			x[i] = 0;
		}
		for (int i = 0; i < K; i++) {
			d[i] = scan.nextInt();
			for (int j = 0; j < d[i]; j++) {
				A[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < K; i++) {
			for (int j = 0; j < d[i]; j++) {
				x[A[i][j]-1] = 1;
			}
		}

		for (int i = 0; i < N; i++) {
			if (x[i] == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	}

}