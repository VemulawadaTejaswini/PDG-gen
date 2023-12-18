
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
			int r = scanner.nextInt();
			if ((n | r) == 0)
				break;
			int[] card = new int[n];
			for (int i = 1; i <= n; i++)
				card[n - i] = i;
			int[] tmp = new int[n];
			while (r-- > 0) {
				int p = scanner.nextInt() - 1;
				int c = scanner.nextInt();
				for (int i = 0; i < p; i++)
					tmp[i] = card[i];
				for (int i = 0; i < c; i++)
					card[i] = card[i + p];
				for (int i = 0; i < p; i++)
					card[i + c] = tmp[i];
			}
			System.out.println(card[0]);
		}
	}
}