import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] a = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextLong();
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i][k] == 0 || a[k][j] == 0 || a[i][j] == 0) continue;
					if (a[i][k] + a[k][j] < a[i][j]) {
						System.out.println(-1);
						return;
					}

					if (a[i][k] + a[k][j] == a[i][j]) {
						a[i][j] = 0;
						a[j][i] = 0;
					}
				}
			}
		}

		long answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				answer += a[i][j];
			}
		}

		System.out.println(answer / 2);
	}
}
