
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int MAX = 1000000;
		boolean[] prime = new boolean[MAX + 1];
		for (int i = 2; i <= MAX; i++) {
			if (!prime[i]) {
				for (int j = i * 2; j <= MAX; j += i) {
					prime[j] = true;
				}
			}
		}
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			int[] a = new int[n];
			int min = Integer.MAX_VALUE;
			boolean[] f = new boolean[m + 1];
			f[0] = true;
			for (int i = 0; i < n; i++) {
				int s = scanner.nextInt();
				min = Math.min(s, min);
				a[i] = s;
				for (int j = s * 2; j <= m; j += s) {
					f[j] = true;
				}
			}
			int max = 0;
			for (int i = min; i <= m; i++) {
				if (f[i])
					continue;
				for (int j = 0; j < n; j++) {
					if (i - a[j] >= 0 && f[i - a[j]]) {
						f[i] = true;
						break;
					}
				}
				if (f[i] && !prime[i])
					max = i;
			}
			System.out.println(max == 0 ? "NA" : max);

		}

	}
}