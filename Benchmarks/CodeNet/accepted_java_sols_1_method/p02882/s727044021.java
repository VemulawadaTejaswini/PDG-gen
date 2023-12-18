import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		sc.close();

		double d = 0;
		if (a * a * b / 2.0 >= x) {
			d = Math.atan(a * b * b / 2.0 / x) * 360.0 / (2.0 * Math.PI);
		} else {
			d = Math.atan(2.0 * (a * a * b - x) / a / a / a) * 360.0 / (2.0 * Math.PI);
		}
		System.out.println(d);
	}
}
