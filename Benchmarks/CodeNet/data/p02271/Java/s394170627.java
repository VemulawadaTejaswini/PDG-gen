
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

		slove(0, 0, num, map);
		int m = scanner.nextInt();
		while (m-- > 0) {
			int a = scanner.nextInt();
			System.out.println(a <= s && map[a] ? "yes" : "no");
		}

	}

	private void slove(int i, int sum, int[] num, boolean[] map) {
		map[sum] = true;
		if (i == num.length)
			return;

		slove(i + 1, sum + num[i], num, map);
		slove(i + 1, sum, num, map);
	}
}