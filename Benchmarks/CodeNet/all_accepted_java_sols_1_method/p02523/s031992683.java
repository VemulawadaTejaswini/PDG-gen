

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1, x2, y1, y2;
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		double x = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		System.out.println(Math.sqrt(x));
	}
}