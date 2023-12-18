
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int[] a;
	boolean[] have;
	boolean[] t;

	boolean dfs(int k, int rest) {
		if (rest == 0) {
			t = Arrays.copyOf(have, n);
			return greedy();
		}
		if (a[k] > rest)
			return false;
		have[k] = true;
		if (dfs(k + 1, rest - a[k]))
			return true;
		have[k] = false;
		return dfs(k + 1, rest);
	}

	boolean choice(int k, int rest) {
		if (rest == 0)
			return true;
		if (k < 0)
			return false;
		if (!t[k])
			return choice(k - 1, rest);
		if (a[k] <= rest) {
			t[k] = false;
			if (choice(k - 1, rest - a[k]))
				return true;
			t[k] = true;
		}
		return choice(k - 1, rest);
	}

	boolean greedy() {
		for (int i = 0; i < n - 1; i++) {
			if (!t[i]) {
				if (!choice(i - 1, a[i])) {
					return false;
				}
				t[i] = true;
			}
		}
		return true;
	}

	void run() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			n = scanner.nextInt();
			if (n == 0)
				break;
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			have = new boolean[n];
			have[0] = true;
			Arrays.sort(a);
			System.out.println(dfs(1, a[n - 1] - a[0]) ? "YES" : "NO");

		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}