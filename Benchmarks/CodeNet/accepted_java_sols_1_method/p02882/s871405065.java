import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		double s = (double) x / a;

		if (s < a * b / 2) {
			double h = (double) s / b * 2;
			double atan = b / h;
			double ans = Math.atan(atan);


			ans = Math.toDegrees(ans);

			System.out.println(ans);

		} else {
			double remain = a * b - s;
			double h = (double) remain / a * 2;
			double atan = h / a;

			double ans = Math.atan(atan);

			ans = Math.toDegrees(ans);

			System.out.println(ans);

		}

	}

}