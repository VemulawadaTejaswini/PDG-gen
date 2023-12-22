import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int h = Integer.parseInt(scan.next());
		int w = Integer.parseInt(scan.next());
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());

		String x = "";
		String y = "";
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < w; i++) {
			if (i < a) {
				x = x.concat("0");
				y = y.concat("1");
			} else {
				x = x.concat("1");
				y = y.concat("0");
			}
		}
		for (int i = 0; i < h; i++) {
			if (i < b) {
				out.println(x);
			} else {
				out.println(y);
			}
		}
		out.flush();
	}
}