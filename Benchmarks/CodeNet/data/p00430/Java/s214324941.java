
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			if (n == 0)
				break;
			ans = new int[n + 1];
			ans[0] = n;
			rec(1, n);
		}
	}

	private void rec(int pos, int cnt) {
		if (cnt == 0) {
			for (int i = 1; i < pos - 1; i++)
				System.out.print(ans[i] + " ");
			System.out.println(ans[pos - 1]);
			return;

		}
		for (int i = ans[pos - 1]; i > 0; i--) {
			if (i > cnt)
				continue;
			ans[pos] = i;
			rec(pos + 1, cnt - i);
		}
	}

	int n;
	int[] ans;
}