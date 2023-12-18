
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] m = new int[n][n];
		for (int i = 0; i < n; i++) {
			int u = scanner.nextInt();
			int k = scanner.nextInt();
			u--;
			for (int j = 0; j < k; j++) {
				int v = scanner.nextInt();
				v--;
				m[u][v] = 1;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(m[i][j]);
				System.out.print(j == n - 1 ? '\n' : ' ');
			}
		}

	}
}