
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] player = new int[3][n];
		int[][] num = new int[3][101];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 3; j++) {
				int a = scanner.nextInt();
				player[j][i] = a;
				num[j][a]++;
			}

		for (int i = 0; i < n; i++) {
			int ans = 0;
			for (int j = 0; j < 3; j++) {
				if (num[j][player[j][i]] == 1)
					ans += player[j][i];
			}
			System.out.println(ans);

		}
	}
}