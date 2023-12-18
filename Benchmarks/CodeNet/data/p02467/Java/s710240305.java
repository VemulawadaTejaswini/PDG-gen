import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();

		sc.close();

		out.print(n + ":");

		List<Integer> ans = new ArrayList<>();

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				ans.add(i);
				n /= i;
			}
		}

		// 1以外が残るのは、元のnが素数だった場合
		if (n != 1) {
			ans.add(n);
		}

		for (int x : ans) {
			out.print(" " + x);
		}
		out.println();
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

