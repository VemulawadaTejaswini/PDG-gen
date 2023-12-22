import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private boolean check(int n) {
		char[] c = String.valueOf(n).toCharArray();

		boolean result = true;
		for (int i = 0; i < c.length / 2; i++) {
			if (c[i] != c[c.length - i - 1]) {
				result = false;
			}
		}

		return result;

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		int ans = 0;

		for (int x = A; x <= B; x++) {
			if (check(x)) {
				ans++;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
