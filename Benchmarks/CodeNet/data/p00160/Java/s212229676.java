

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			long ans = 0;
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int h = sc.nextInt();
				int w = sc.nextInt();

				int length = x + y + h;

				int wt[] = { 2, 5, 10, 15, 20, 25, Integer.MAX_VALUE };
				int lt[] = { 60, 80, 100, 120, 140, 160, Integer.MAX_VALUE };
				int mt[] = { 600, 800, 1000, 1200, 1400, 1600, 0 };
				for (int z = 0;; z++) {
					if (wt[z] >= w && lt[z] >= length) {
						ans += mt[z];
						break;
					}
				}
			}
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}