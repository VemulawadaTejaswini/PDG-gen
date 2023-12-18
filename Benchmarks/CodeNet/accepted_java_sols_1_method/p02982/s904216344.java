import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, D;
		N = sc.nextInt();
		D = sc.nextInt();
		int[][] X = new int[N][D];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				X[i][j] = sc.nextInt();
			}
		}

		int cnt = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int sum = 0;
				for (int k = 0; k < D; k++) {
					sum += Math.abs(X[i][k] - X[j][k]) * Math.abs(X[i][k] - X[j][k]);
				}
				if (Math.sqrt(sum) % 1 == 0) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}
}
