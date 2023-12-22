import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] g = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				g[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			u--;
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int v = sc.nextInt();
				v--;
				g[u][v] = 1;
			}
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != 0) {
					System.out.print(" ");
				}
				System.out.print(g[i][j]);
			}
			System.out.print("\n");
		}
	}
}