import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();

		sc.close();

		char[] c = new char[S.length()];
		S.getChars(0, S.length(), c, 0);

		Arrays.sort(c);

		if (c[0] == c[1] && c[2] == c[3] && c[0] != c[2]) {
			out.println("Yes");
		} else {
			out.println("No");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
