

import static java.util.Arrays.deepToString;

import java.util.Arrays;
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
		while (sc.hasNext()) {
			double x = sc.nextDouble();
			if (x < 0) break;
			x *= 16;
			if (x - (int)x > 1e-6) {
				System.out.println("NA");
			} else if (x > (1 << 12)) {
				System.out.println("NA");
			} else {
				int y = (int)x;
				for (int i = 11; i > 3; i--) {
					System.out.print(y >> i & 1);
				}
				System.out.print(".");
				for (int i = 3; i >= 0; i--) {
					System.out.print(y >> i & 1);
				}
				System.out.println();
			}
		}
	}
}