

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int x1, x2, y1, y2, x3, x4, y3, y4;

		Scanner sc = new Scanner(System.in);

		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		y4 = x2 - x1 + y1;
		x4 = x1 + y1 - y2;
		y3 = x2 - x1 + y2;
		x3 = y1 - y2 + x2;
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

		sc.close();
	}
}
