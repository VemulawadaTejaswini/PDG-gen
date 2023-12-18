
import static java.util.Arrays.deepToString;
import static java.util.Arrays.fill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
			int sum = 0;
			for (int i = 0; i < n; i++) sum += sc.nextInt();
			System.out.println(sum / n);
		}
	}
}