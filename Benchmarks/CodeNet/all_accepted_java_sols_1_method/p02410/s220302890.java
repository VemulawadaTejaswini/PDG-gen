

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int A[][] = new int[N][M];
		int b[] = new int[M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < M; i++) {
			b[i] = sc.nextInt();
		}

		int ans;

		for (int i = 0; i < N; i++) {
			ans = 0;
			for (int j = 0; j < M; j++) {
				ans += (A[i][j] * b[j]);
			}
			System.out.println(ans);
		}
	}
}
