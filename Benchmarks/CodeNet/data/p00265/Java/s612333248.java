
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		int[] num = new int[300001];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			num[x] = x;
		}
		for (int i = 0; i < 300000; i++) {
			num[i + 1] = Math.max(num[i], num[i + 1]);
		}
		int ans = 0;
		for (int i = 0; i < q; i++) {
			int x = scanner.nextInt();
			ans = 0;
			for (int j = x; j <= 300000; j += x) {
				ans = Math.max(ans, num[j - 1] % x);
			}
			ans = Math.max(ans, num[300000] % x);
			System.out.println(ans);
		}

	}
}