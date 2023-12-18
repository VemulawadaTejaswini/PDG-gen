
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			int m = scanner.nextInt();
			int ans = 0;
			while (m-- > 0) {
				int nx = scanner.nextInt();
				int ny = scanner.nextInt();
				if (x <= nx && nx <= x + w && y <= ny && ny <= y + h)
					ans++;
			}
			System.out.println(ans);
		}
	}
}