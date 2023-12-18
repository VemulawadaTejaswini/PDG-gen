
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
			int[] num = new int[n + 1];
			for (int i = 0; i < n; i++)
				num[i] = scanner.nextInt();
			num[n] = 1 << 30;
			System.out.print(num[0]);
			for (int i = 1; i < n; i++)
				if (num[i - 1] + 1 == num[i])
					if (num[i] + 1 == num[i + 1])
						continue;
					else
						System.out.print("-" + num[i]);
				else
					System.out.print(" " + num[i]);
			System.out.println();
		}
	}
}