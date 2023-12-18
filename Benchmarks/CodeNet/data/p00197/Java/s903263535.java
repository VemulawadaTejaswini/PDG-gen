
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
			if (n == 0)
				break;
			int m = scanner.nextInt();
			slove(n, m);
		}

	}

	private void slove(int n, int m) {
		if (n > m) {
			int tmp = m;
			m = n;
			n = tmp;
		}
		int step = 1;
		while (true) {
			if (m % n == 0)
				break;
			int tmp2 = n;
			n = m % n;
			m = tmp2;
			step++;
		}
		System.out.println(n + " " + step);

	}
}