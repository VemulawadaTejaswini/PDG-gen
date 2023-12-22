import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();

		sc.close();

		if (A > K) {
			A -= K;
			K = 0;
		} else {
			K -= A;
			A = 0;
		}

		if (B > K) {
			B -= K;
			K = 0;
		} else {
			B = 0;
		}

		out.println(A + " " + B);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
