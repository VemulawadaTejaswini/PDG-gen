
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int ans = scanner.nextInt();
			if (ans == 0)
				break;
			for (int i = 0; i < 9; i++)
				ans -= scanner.nextInt();
			System.out.println(ans);
		}
	}
}