
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int[] num = { 63, 6, 91, 79, 102, 109, 125, 39, 127, 111 };

		while (true) {
			int pre = 0;
			int n = scanner.nextInt();
			if (n == -1)
				break;
			while (n-- > 0) {
				int now = num[scanner.nextInt()];
				int ans = Integer.parseInt(Integer.toBinaryString(pre ^ now));
				System.out.printf("%07d\n", ans);
				pre = now;
			}
		}

	}
}