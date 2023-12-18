import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		int susumi = m / 2;

		int h60 = h * 30;
		int m60 = m * 6;
		int kakudo = Math.abs(h60 - m60);
		kakudo = kakudo + susumi;

		if (kakudo > 180) {
			kakudo = kakudo - 180;
		}

		if (kakudo == 0) {
			System.out.println(b - a);
			sc.close();
			return;
		} else if (kakudo == 180) {
			System.out.println(b + a);
			sc.close();
			return;
		} else {

			double a1 = Math.pow(a, 2) + Math.pow(b, 2);
			double a2 = 2 * a * b * Math.cos(Math.toRadians(kakudo));
			double a4 = Math.sqrt(a1 - a2);
			System.out.println(a4);
		}

		sc.close();
	}
}
