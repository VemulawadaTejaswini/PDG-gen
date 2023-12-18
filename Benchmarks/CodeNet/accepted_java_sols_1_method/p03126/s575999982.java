import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		int K[] = new int[N];
		int A[][] = new int[N][M];
		int food[] = new int[M];
		int a[] = new int[M];
		for (int i = 0; i < M; i++) {
			food[i] = i + 1;
			a[i] = 0;
		}

		for (int i = 0; i < N; i++) {
			K[i] = sc.nextInt();
			for (int j = 0; j < K[i]; j++) {
				A[i][j] = sc.nextInt();
				for (int k = 0; k < M; k++) {
					if (A[i][j] == food[k]) {
						a[k]++;
					}
				}

			}
		}
		sc.close();
		int ans = 0;
		for (int i = 0; i < M; i++) {
			if (a[i] == N) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
