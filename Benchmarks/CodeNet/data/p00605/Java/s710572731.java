
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
			int k = scanner.nextInt();
			if ((n | k) == 0)
				break;
			int[] num = new int[k];
			for (int i = 0; i < k; i++)
				num[i] = scanner.nextInt();
			String ans = "Yes";
			for (int i = 0; i < n; i++)
				for (int j = 0; j < k; j++) {
					int a = scanner.nextInt();
					num[j] -= a;
					if (num[j] < 0)
						ans = "No";
				}
			System.out.println(ans);
		}
	}
}