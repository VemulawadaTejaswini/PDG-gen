
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
			if (n < 0) break;
			if (n == 0) {
				System.out.println(0);
			} else {
				int p = 0;
				int[] s = new int[20];
				while (n > 0) {
					s[p++] = n % 4;
					n /= 4;
				}
				for (int i = p - 1; i >= 0; i--) {
					System.out.print(s[i]);
				}
				System.out.println();
			}
			
		}
	}
}