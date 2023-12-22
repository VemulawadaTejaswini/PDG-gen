

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		int k2 = 1;
		for (int i = 0; i < k; i++) {
			k2 *= 2;
		}

		int max = Math.max(a, Math.max(b, c));

		if (max == a) {
			System.out.println(a * k2 + b + c);
		} else if (max == b) {
			System.out.println(a + b * k2 + c);
		} else {
			System.out.println(a + b + c * k2);
		}
	}

}
