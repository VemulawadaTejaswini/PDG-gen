
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		int s = 0;
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
			s += num[i];
		}
		boolean[] map = new boolean[s + 1];

		for (int i = 1; i < 1 << n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) == 1) {
					sum += num[j];
				}
			}
			map[sum] = true;
		}

		int m = scanner.nextInt();
		while (m-- > 0) {
			int a = scanner.nextInt();
			System.out.println(a <= s && map[a] ? "yes" : "no");
		}

	}
}