import java.io.*;
import java.util.*;
import java.math.*;

public class B {
	public void run() {
		Scanner sc = new Scanner(System.in);

		boolean[] p = new boolean[300000];
		boolean[] ms = new boolean[300000];
		for (int i = 0; i < ms.length; i++) {
			ms[i] = ((i % 7 == 1) || (i % 7 == 6));
			p[i] = ms[i];
		}
		for (int i = 2; i < ms.length; i++) {
			if (p[i]) {
				for (int j = i + i; j < ms.length; j += i) {
					p[j] = false;
				}
			}
		}

		for (;;) {
			int n = sc.nextInt();
			if (n == 1) {
				break;
			}
			System.out.print(n + ":");
			for (int i = 2; i <= n; i++) {
				if (!p[i])
					continue;
				if (n % i == 0) {
					System.out.print(" " + i);
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] Aregs) {
		B a = new B();
		a.run();
	}
}