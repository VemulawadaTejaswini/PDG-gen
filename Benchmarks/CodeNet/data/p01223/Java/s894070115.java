import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		for (;; n--) {
			if (n == 0) {
				break;
			}
			int r = sc.nextInt();
			int a = sc.nextInt();
			int p1 = 0;
			int p2 = 0;
			for (int i = 1; i < r; i++) {
				int b = sc.nextInt();
				p1 = Math.max(p1, a - b);
				p2 = Math.max(p2, b - a);
				a = b;
			}
			System.out.println(p2 + " " + p1);

		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}