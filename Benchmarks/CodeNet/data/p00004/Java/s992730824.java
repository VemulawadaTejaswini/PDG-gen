import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double a1 = sc.nextDouble();
			double b1 = sc.nextDouble();
			double e1 = sc.nextDouble();
			double a2 = sc.nextDouble();
			double b2 = sc.nextDouble();
			double e2 = sc.nextDouble();
			double x = (e1 * b2 - b1 * e2) / (a1 * b2 - b1 * a2);
			double y = (e2 * a1 - e1 * a2) / (a1 * b2 - b1 * a2);
			if (x == 0) x = 0;
			if (y == 0) y = 0;
			System.out.printf("%.3f %.3f\n",  x, y);
		}


	}

}