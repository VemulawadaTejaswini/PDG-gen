import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String S = sc.next();

		sc.close();

		if (N % 2 != 0) {
			out.println("No");
		} else {
			String a = S.substring(0, N / 2);
			String b = S.substring(N / 2);
			if (a.equals(b)) {
				out.println("Yes");
			} else {
				out.println("No");
			}

		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
