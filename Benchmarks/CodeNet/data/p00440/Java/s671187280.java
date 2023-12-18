
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
			int k = scanner.nextInt();
			if ((n | k) == 0)
				break;
			boolean[] b = new boolean[n + 1];
			int[][] a = new int[n + 1][2];
			for (int i = 0; i < k; i++)
				b[scanner.nextInt()] = true;
			int ans = 0;
			for (int i = 1; i <= n; i++) {
				a[i][0] = b[i] ? a[i - 1][0] + 1 : 0;
				ans = Math.max(ans, a[i][0]);
			}
			if (b[0]) {
				for (int i = 1; i <= n; i++) {
					a[i][1] = b[i] ? a[i - 1][1] + 1 : a[i - 1][0] + 1;
					ans = Math.max(ans, a[i][1]);
				}
			}
			System.out.println(ans);
		}
	}
}