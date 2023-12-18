
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			u = scanner.nextInt();
			if ((n | u) == 0)
				break;
			need = new int[n];
			int all = 0;
			unit = new int[n];
			for (int i = 0; i < n; i++) {
				unit[i] = scanner.nextInt();
				all += unit[i];
				int k = scanner.nextInt();
				for (int j = 0; j < k; j++) {
					int x = scanner.nextInt();
					need[i] |= (1 << x);
				}
			}
			if (all == u) {
				System.out.println(n);
				continue;
			}
			ans = n;
			v = new boolean[1 << n];
			slove(0, 0, 0);
			System.out.println(ans);
		}
	}

	private void slove(int bit, int one, int have) {
		if (ans == one)
			return;
		if (have >= u) {
			ans = one;
			return;
		}
		if (ans - 1 == one)
			return;

		for (int i = 0; i < n; i++) {
			int a = bit | (1 << i);
			if (v[a] || (bit | need[i]) != bit)
				continue;
			v[a] = true;
			slove(a, one + 1, have + unit[i]);
		}
	}

	int n, u;
	int[] need, unit;
	int ans;
	boolean[] v;
}