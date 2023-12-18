
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = scanner.nextInt();
		int[] ans = new int[n];
		while (m-- > 0) {
			int a = scanner.nextInt();
			for (int i = 0; i < n; i++) {
				if (num[i] <= a) {
					ans[i]++;
					break;
				}
			}
		}
		int ret = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (max < ans[i]) {
				max = ans[i];
				ret = i;
			}
		}
		System.out.println(ret + 1);
	}
}