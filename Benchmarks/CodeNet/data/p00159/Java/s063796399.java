
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
			int n = sc.nextInt();
			if (n == 0) break;
			final double EPS = 1e-10;
			double bestValue = 0;
			int bestId = -1;
			for (int iii = 0; iii < n; iii++) {
				int id = sc.nextInt();
				double h = sc.nextDouble() / 100.0;
				double w = sc.nextDouble();
				double value = Math.abs(22 - w / (h * h));
				if (bestId == -1 || 
					bestValue > value + EPS ||
					(Math.abs(bestValue - value) < EPS && bestId > id) 
				) {
					bestValue = value;
					bestId = id;
				}
			}
			System.out.println(bestId);
		}
	}
}