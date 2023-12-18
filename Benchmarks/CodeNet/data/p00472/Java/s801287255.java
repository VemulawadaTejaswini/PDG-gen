
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int mod = 100000;
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] map = new int[n];
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum += scanner.nextInt();
			map[i] = sum;
		}
		int ans = 0;
		int index = 0;
		int now = 0;
		while (m-- > 0) {
			index += scanner.nextInt();
			ans += Math.abs(map[index] - now);
			ans %= mod;
			now = map[index];
		}
		System.out.println(ans);

	}
}