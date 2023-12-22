import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String S = sc.next();

		sc.close();

		StringBuffer ans = new StringBuffer();

		for (char c : S.toCharArray()) {
			int x = c - 'A';
			x += N;
			x %= 26;
			ans.append((char) (x + 'A'));
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
