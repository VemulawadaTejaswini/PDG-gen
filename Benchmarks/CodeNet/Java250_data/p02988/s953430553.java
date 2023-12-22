import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int[] p = nextIntArray(sc, n);

		sc.close();

		int ans = 0;
		for (int i = 1; i < n - 1; i++) {
			if (p[i - 1] < p[i] && p[i] < p[i + 1] ||
				p[i - 1] > p[i] && p[i] > p[i + 1]) {
				ans++;
			}
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
