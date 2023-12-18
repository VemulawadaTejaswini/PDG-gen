import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int d = sc.nextInt();
			if ((a | b | d) == 0) {
				break;
			}

			int min = Integer.MAX_VALUE;
			int aa = 0;
			int ba = 0;
			for (int i = 0; i < 100000; i++) {
				int a2 = a * i;
				int b2 = a2 - d;
				if (b2 % b == 0) {
					if (min > (Math.abs(i) + Math.abs(b2 / b))) {
						aa = Math.abs(i);
						ba = Math.abs(b2 / b);
						min = ba + aa;
					}
				}

				int b3 = a2 + d;
				// sc.next();
				if (b3 % b == 0) {
					if (min > (Math.abs(i) + Math.abs( b3 / b))) {
						aa = Math.abs(i);
						ba = Math.abs(b3 / b);
						min = aa + ba;
					}
				}
			}

			System.out.println(aa + " " + ba);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}