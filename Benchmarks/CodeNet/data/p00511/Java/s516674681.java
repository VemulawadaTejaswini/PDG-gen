
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int ans = scanner.nextInt();
		while (true) {
			char c = scanner.next().charAt(0);
			if (c == '+')
				ans += scanner.nextInt();
			else if (c == '-')
				ans -= scanner.nextInt();
			else if (c == '*')
				ans *= scanner.nextInt();
			else if (c == '/')
				ans /= scanner.nextInt();
			else {
				System.out.println(ans);
				return;
			}
		}
	}
}