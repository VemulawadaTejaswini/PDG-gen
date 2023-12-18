
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		int dataSet = 0;
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 0.0;
		double y2 = 0.0;
		double x3 = 0.0;
		double y3 = 0.0;
		double x4 = 0.0;
		double y4 = 0.0;

		try {
			sc = new Scanner(System.in);
			dataSet = sc.nextInt();
			for (int i = 1; i <= dataSet; i++) {
				x1 = sc.nextDouble();
				y1 = sc.nextDouble();
				x2 = sc.nextDouble();
				y2 = sc.nextDouble();
				x3 = sc.nextDouble();
				y3 = sc.nextDouble();
				x4 = sc.nextDouble();
				y4 = sc.nextDouble();

				if (((y1 - y2) / (x1 - x2)) == ((y3 - y4) / (x3 - x4))) {

					System.out.println("YES");

				} else {
					System.out.println("NO");
				}

			}

		} finally {
			sc.close();
		}

	}

}