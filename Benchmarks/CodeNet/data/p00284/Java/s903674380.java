
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			int s = scanner.nextInt();
			int g = scanner.nextInt();
			int ans = 0;
			while (s < g) {
				int to = 1;
				while (true) {
					int next = to * 2;
					if (s % next != 0)
						break;
					if (s + next > g)
						break;
					to = next;
				}
				s += to;
				ans++;
			}
			System.out.println(ans);
		}
	}
}