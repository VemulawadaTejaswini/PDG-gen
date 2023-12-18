import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Main.run();
	}

	@SuppressWarnings("resource")
	private static void run() {
		Scanner scan = new Scanner(System.in);
		int c;
		while ((c = scan.nextInt()) != 0) {
			int x = 0, xTotal = 0, y = 0, yTotal = 0;
			for (int i = 0; i < c; i++) {
				x = scan.nextInt();
				y = scan.nextInt();
				if (x == y) {
					xTotal += x;
					yTotal += y;
					continue;
				}
				if (x > y)
					xTotal += (x + y);
				else
					yTotal += (x + y);
			}
			System.out.println(xTotal + " " + yTotal);
		}
		System.exit(0);

	}
}