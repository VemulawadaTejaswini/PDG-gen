
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if ((a | b) == 0)
				break;
			b -= a;
			int ans1 = b / 1000;
			b %= 1000;
			int ans2 = b / 500;
			b %= 500;
			int ans3 = b / 100;
			System.out.println(ans3 + " " + ans2 + " " + ans1);
		}
	}
}