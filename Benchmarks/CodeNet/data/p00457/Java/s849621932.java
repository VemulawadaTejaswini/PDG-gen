
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
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = scanner.nextInt();
			int ans = n;
			for (int i = 0; i < n; i++)
				for (int j = 1; j < 4; j++) {
					if (a[i] == j)
						continue;
					int tmp = a[i];
					a[i] = j;
					int l = i;
					int r = i;
					int cnt = 0;
					while (l >= 0) {
						int cc = a[l];
						while (l > 0 && cc == a[l - 1])
							l--;
						while (r < n - 1 && cc == a[r + 1])
							r++;
						if (r - l - cnt + 1 < 4)
							break;
						cnt += r - l - cnt + 1;
						l--;
					}
					a[i] = tmp;
					ans = Math.min(ans, n - cnt);
				}
			System.out.println(ans);
		}
	}
}