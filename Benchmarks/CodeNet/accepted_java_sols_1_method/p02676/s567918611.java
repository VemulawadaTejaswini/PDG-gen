import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int k = sc.nextInt();
		String s = sc.next();

		if (k >= s.length()) {
			out.println(s);
		} else {
			out.println(s.substring(0, k) + "...");
		}

		out.flush();
	}
}
