package itp01;

import java.util.Scanner;

public class ITP1_04_A {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		int r = stdIn.nextInt();
		
		double l = 2 * Math.PI * r;
		double s = r * r * Math.PI;
		System.out.printf("%.10f %.10f\n", l, s);
	}
}

