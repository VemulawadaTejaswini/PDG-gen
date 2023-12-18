
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
			int d = scanner.nextInt();
			if (d == 0)
				break;
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] num = new int[n + 1];
			for (int i = 1; i < n; i++)
				num[i] = scanner.nextInt();
			num[n] = d;
			Arrays.sort(num);
			int ans = 0;
			while (m-- > 0) {
				int k = scanner.nextInt();
				int pos = Arrays.binarySearch(num, k);
				if (pos < 0) {
					pos = -pos - 2;
					ans += Math.min(k - num[pos], num[pos + 1] - k);
				}
			}
			System.out.println(ans);
		}
	}
}