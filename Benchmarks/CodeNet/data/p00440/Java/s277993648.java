
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
			int m0 = 0;
			int m1 = 0;
			for (int i = 1; i <= n; i++) {
				a[i][0] = b[i] ? a[i - 1][0] + 1 : 0;
				a[i][1] = b[i] ? a[i - 1][1] + 1 : a[i - 1][0] + 1;
				m0 = Math.max(m0, a[i][0]);
				m1 = Math.max(m1, a[i][1]);
			}
			System.out.println(b[0] ? m1 : m0);
		}
	}
}