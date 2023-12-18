
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
			char[] s = sc.next().toCharArray();
			if (s[0] == '0') break;
			int a = 0;
			int b = 0;
			int n = s.length;
			for (int i = n - 1; i > 0; i--) {
				if (s[i] == 'A') a++; else b++;
			}
			if (a > b) a++; else b++;
			System.out.println(a + " " + b);
		}
	}
}