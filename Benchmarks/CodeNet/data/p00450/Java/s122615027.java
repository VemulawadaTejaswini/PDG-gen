
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
			int[] stack = new int[n + 1];
			int top = 0;
			int color = scanner.nextInt();
			for (int i = 1; i < n; i++) {
				int cur = scanner.nextInt();
				if (color == cur)
					continue;
				color = cur;
				if (i % 2 == 0)
					stack[top++] = i;
				else if (top > 0)
					top--;
			}
			stack[top++] = n;
			int ans = 0;
			int cur = 0;
			for (int i = 0; i < top; i++) {
				if (i % 2 == 0)
					ans += stack[i] - cur;
				cur = stack[i];

			}
			if (color == 0 ^ top % 2 != 0)
				ans = n - ans;
			System.out.println(ans);
		}
	}
}