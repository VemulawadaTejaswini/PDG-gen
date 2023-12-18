
import java.io.IOException;
import java.util.Arrays;
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
			gain = new int[n];
			int all = 0;
			unit = new int[n];
			for (int i = 0; i < n; i++) {
				unit[i] = gain[i] = scanner.nextInt();
				all += unit[i];
				int k = scanner.nextInt();
				for (int j = 0; j < k; j++) {
					int x = scanner.nextInt();
					need[i] |= (1 << x);
				}
			}
			Arrays.sort(gain);
			for (int i = n - 2; i >= 0; i--)
				gain[i] += gain[i + 1];
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
		if (ans <= one)
			return;
		if (have >= u) {
			ans = one;
			return;
		}

		for (int i = 0; i < n; i++) {
			int a = bit | (1 << i);
			if (v[a] || (bit | need[i]) != bit)
				continue;
			v[a] = true;
			slove(bit | (1 << i), one + 1, have + unit[i]);
		}
	}

	int n, u;
	int[] need, unit, gain;
	int ans;
	boolean[] v;
}