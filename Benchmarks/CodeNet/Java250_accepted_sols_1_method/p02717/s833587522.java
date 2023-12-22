

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int a = x;
		int b = y;
		int c = z;

		int mix;

		mix = a;
		a = b;
		b = mix;

		mix = a;
		a = c;
		c = mix;

		System.out.println(a + " " + b + " " + c);

		sc.close();
	}
}
