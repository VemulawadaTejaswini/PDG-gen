package aoj;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x;
		final double pi = 3.141592653589;
		x = scanner.nextInt();
		System.out.printf("%5.5f %5.5f", pi*x*x, pi*2*x);
		scanner.close();
	}
}