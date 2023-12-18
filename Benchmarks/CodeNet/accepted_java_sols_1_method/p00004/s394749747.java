

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {

			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			double d = scanner.nextDouble();
			double e = scanner.nextDouble();
			double f = scanner.nextDouble();

			double x = (c*e - f*b)/ (a*e - b*d);
	        double y = (c - a*x)/b;

			if (x == -0) {
				x = 0;
			}
			if (y == -0) {
				y = 0;
			}
			//System.out.println(list);
			System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y) );
		}
		scanner.close();

	}
}

