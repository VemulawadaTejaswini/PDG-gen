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
			String s = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(s + " " + (a + b) + " " + (a * 200 + b * 300));
		}
	}
}