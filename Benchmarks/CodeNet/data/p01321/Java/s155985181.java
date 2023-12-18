
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] ans = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 5; j++)
					ans[i] += scanner.nextInt();
			}
			Arrays.sort(ans);
			System.out.println(ans[n - 1] + " " + ans[0]);
		}
	}
}