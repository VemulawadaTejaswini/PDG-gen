
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
		while (m-- > 0) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			int ans = Math.min(w, Math.min(n + 1 - w, Math.min(h, n + 1 - h)));
			ans %= 3;
			System.out.println(ans == 0 ? 3 : ans);
		}
	}
}