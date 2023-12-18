
import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				char ans = 0;
				if (ans == 0) {
					if (a >= 100 || b >= 100 || c >= 100) ans = 'A';
				}
				if (ans == 0) {
					if (a + b >= 180) ans = 'A';
				}
				if (ans == 0) {
					if (a + b + c >= 240) ans = 'A';
				}
				if (ans == 0) {
					if (a + b + c >= 210) ans = 'B';
				}
				if (ans == 0) {
					if (a + b + c >= 150 && (a >= 80 || b >= 80)) ans = 'B';
				}
				if (ans == 0) {
					ans = 'C';
				}
				System.out.println(ans);
			}
		}
	}
}