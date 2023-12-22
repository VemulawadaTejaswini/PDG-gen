import static java.lang.Math.*;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		scan.close();

		System.out.printf("%f %f",PI*pow(r,2),2*PI*r);
	}

}