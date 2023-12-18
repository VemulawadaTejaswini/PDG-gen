
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		slove(0, 0, "");
	}

	private void slove(int x, int y, String s) {
		if (x == a && y == b) {
			System.out.println(s);
			return;
		}
		if ((x == 5 && y < 4) || (y == 5 && x < 4))
			return;
		if (x > a || y > b)
			return;

		slove(x + 1, y, s + "A");
		slove(x, y + 1, s + "B");
	}

	int a, b;
}