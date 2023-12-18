
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if((n|m)==0)
				break;
			int[] cnt = new int[11];
			while (n-- > 0) {
				int d = scanner.nextInt();
				int p = scanner.nextInt();
				cnt[p] += d;
			}
			int ans = 0;
			for (int i = 10; i > 0; i--)
				if (m >= cnt[i])
					m -= cnt[i];
				else {
					ans += i * (cnt[i] - m);
					m = 0;
				}

			System.out.println(ans);
		}
	}
}