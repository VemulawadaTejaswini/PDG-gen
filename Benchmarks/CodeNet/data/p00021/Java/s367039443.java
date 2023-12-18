import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int n = sc.nextInt();

		while (n-- != 0) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			double dx1 = x1 - x2;
			double dy1 = y1 - y2;
			double dx2 = x3 - x4;
			double dy2 = y3 - y4;
			ln((Math.abs(dx1 * dy2 - dx2 * dy1) < Double.MIN_NORMAL) ? "YES"
					: "NO");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}