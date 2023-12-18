
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] player = new int[n][3];
		int[][] num = new int[101][3];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 3; j++) {
				int a = scanner.nextInt();
				player[i][j] = a;
				num[a][j]++;
			}

		for (int i = 0; i < n; i++) {
			int ans = 0;
			for (int j = 0; j < 3; j++) {
				if (num[player[i][j]][j] == 1)
					ans += player[i][j];
			}
			System.out.println(ans);

		}
	}
}