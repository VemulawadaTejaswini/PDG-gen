
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			int[] num = new int[n + m];
			for (int i = 0; i < num.length; i++)
				num[i] = scanner.nextInt();
			Arrays.sort(num);
			int ans = num[0];
			for (int i = 1; i < num.length; i++)
				ans = Math.max(ans, num[i] - num[i - 1]);
			System.out.println(ans);
		}
	}
}