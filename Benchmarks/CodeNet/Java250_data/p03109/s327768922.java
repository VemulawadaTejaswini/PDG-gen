import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();
		Date d = new Date(s);
		Date h = new Date("2019/04/30");
		if (d.after(h)) {
			out.println("TBD");
		} else {
			out.println("Heisei");
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
