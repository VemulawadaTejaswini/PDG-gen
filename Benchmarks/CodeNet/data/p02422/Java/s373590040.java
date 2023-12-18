
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder a = new StringBuilder(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < b; i++) {
			String[] c = scanner.nextLine().split(" ");
			int d = Integer.parseInt(c[1]);
			int e = Integer.parseInt(c[2]) + 1;
			if (c[0].equals("print")) {
				System.out.println(a.substring(d, e));
			} else if (c[0].equals("reverse")) {
				StringBuilder builder = new StringBuilder(a.substring(d, e))
						.reverse();
				a.replace(d, e, builder.toString());
			} else {
				a.replace(d, e, c[3]);
			}

		}
	}
}
