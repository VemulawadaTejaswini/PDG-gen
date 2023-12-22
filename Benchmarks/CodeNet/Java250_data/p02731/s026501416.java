import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int L = sc.nextInt();

		sc.close();

		out.println(new BigDecimal(Math.pow(L / 3.0, 3)).toPlainString());

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
