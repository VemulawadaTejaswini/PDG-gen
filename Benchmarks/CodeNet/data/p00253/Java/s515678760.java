
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] k = new int[n + 1];
			for (int i = 0; i <= n; i++)
				k[i] = scanner.nextInt();
			loop: for (int i = 0; i <= n; i++) {
				int[] ktmp = new int[n];
				int p = 0;
				for (int j = 0; j < i; j++)
					ktmp[p++] = k[j];
				for (int j = i + 1; j <= n; j++)
					ktmp[p++] = k[j];
				for (int j = 2; j < n; j++)
					if (ktmp[j] - ktmp[j - 1] != ktmp[j - 1] - ktmp[j - 2])
						continue loop;
				System.out.println(k[i]);
				break;
			}
		}
	}
}