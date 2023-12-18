import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			long q = sc.nextLong();
			if (q < 0) break;
			double x = q/2.0;
			double e = 0.00001 * q;
			while (Math.abs(x * x * x - q) >= e) {
				x = x - (x * x * x - q) / (3 * x * x);
			}
			System.out.printf("%.6f\n", x);
		}
	}
}