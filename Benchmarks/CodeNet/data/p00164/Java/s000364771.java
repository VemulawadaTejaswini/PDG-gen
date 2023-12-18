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
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = sc.nextInt();
			
			int st = 32;
			for (int time = 0; st > 0; time++) {
				st -= (st - 1) % 5;
				System.out.println(st);
				int g = a[time%a.length];
				st -= g;
				if (st < 0) {
					st = 0;
				}
				System.out.println(st);
			}
		}
	}
}