package icpc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();
		double a =  x1-x2;
		double b =  y1-y2;
		System.out.printf(Math.sqrt(a*a + b*b));
	}
}

