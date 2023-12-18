import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			if (n == 0 && x == 0) {
				break;
			}

			int ans = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					int k = x - (i + j);
					if (k >= j + 1 && k <= n) {
						ans++;
					}
				}
			}
			out.println(ans);
		}

		sc.close();
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

