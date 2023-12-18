

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		while (true) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			if (a + b + c == -3) {
				break;
			}
			d = a + b;
			if (a == -1 || b == -1)
				System.out.println("F");
			else if (d >= 80)
				System.out.println("A");
			else if (d >= 65)
				System.out.println("B");
			else if (d >= 50)
				System.out.println("C");
			else if (d >= 30) {
				if (c >= 50)
					System.out.println("C");
				else
					System.out.println("D");
			} else
				System.out.println("F");
		}
	}
}