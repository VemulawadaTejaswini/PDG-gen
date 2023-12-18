

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();

		long ab = Math.abs(a - b);

		if (ab > (v - w) * t)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
