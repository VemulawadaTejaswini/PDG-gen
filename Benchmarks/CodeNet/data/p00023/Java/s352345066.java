import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int n = sc.nextInt();
		while (n-- != 0) {
			double xa = sc.nextDouble(), ya = sc.nextDouble(), ra = sc.nextDouble();
			double xb = sc.nextDouble(), yb = sc.nextDouble(), rb = sc.nextDouble();

			double d = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
			if (ra + rb < d) {
				ln("0");
			} else if (ra > rb + d) {
				ln("2");
			} else if (rb > ra + d) {
				ln("-2");
			} else {
				ln("1");
			}
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