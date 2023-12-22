import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int N[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0;j < n; j++) {
				N[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			int m1 = scanner.nextInt();
			int m2 = scanner.nextInt();
			for (int j = 0; j < m2; j++) {
				int x = scanner.nextInt();
				N[m1 - 1][x - 1] = 1;
			}
		}
		for (int k = 0;k < n; k++) {
			for (int l = 0; l < n - 1; l++) {
				System.out.print(N[k][l] + " ");
			}
			System.out.println(N[k][n - 1]);
		}
	}
}

