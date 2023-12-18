import static java.util.Arrays.*;

import java.util.Scanner;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	void run() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%.8f\n", a * b / 3.305785);
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}