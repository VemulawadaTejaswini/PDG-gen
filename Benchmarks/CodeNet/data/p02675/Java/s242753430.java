import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main() {
		prob(System.in, System.out);
	}

	public static void prob(InputStream in, PrintStream out) {
		Scanner sc = new Scanner(in);
		String line = sc.nextLine();
		int num = Integer.valueOf(line);
		int one = num % 10;
		if (one == 3) {
			out.println("bon");
		} else if (one == 0 || one == 1 || one == 6 || one == 8) {
			out.println("pon");
		} else {
			out.println("hon");
		}

	}
}