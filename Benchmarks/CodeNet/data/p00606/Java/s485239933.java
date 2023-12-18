
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] xs = new int[3];
			int[] ys = new int[3];
			for (int i = 0; i < 3; i++) {
				int a = scanner.next().charAt(0) - 'A';
				xs[i] = a % 3;
				ys[i] = a / 3;
			}
			double[][][] dp = new double[2][3][3];
			int u = 0;
			dp[u][xs[0]][ys[0]] = 1;
			for (int i = 0; i < n; i++) {
				for (int x = 0; x < 3; x++)
					for (int y = 0; y < 3; y++)
						for (int[] m : move) {
							int nx = x + m[0];
							int ny = y + m[1];
							if (nx == xs[2] && ny == ys[2] || nx < 0 || 2 < nx
									|| ny < 0 || 2 < ny)
								dp[1 - u][x][y] += dp[u][x][y] / 4;
							else
								dp[1 - u][nx][ny] += dp[u][x][y] / 4;
						}
				u = 1 - u;
			}
			System.out.printf("%.8f\n", dp[u][xs[1]][ys[1]]);
		}
	}

	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

}