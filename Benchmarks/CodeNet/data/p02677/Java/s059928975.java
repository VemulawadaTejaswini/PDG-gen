import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextInt();
		var b = sc.nextInt();
		var h = sc.nextInt();
		var m = sc.nextInt();
		sc.close();

		var min = h * 60 + m;
		var d1 = (min % 720) / 720.0 * 360;
		var d2 = (min % 60) / 60.0 * 360;
		var d = (d1 - d2 + 360) % 360;
		d = Math.min(360 - d, d);

		var result = 0.0;
		if (d == 0) {
			result = Math.abs(a - b);
		} else if (d == 180) {
			result = a + b;
		} else if (d == 90) {
			result = calc(a,  b);
		} else if (d < 90) {
			var r = d / 180.0 * Math.PI;
			result = calc(a * Math.sin(r), (b - a * Math.cos(r)));
		} else {
			var r = (180 - d) / 180.0 * Math.PI;
			result = calc(a * Math.sin(r), (b + a * Math.cos(r)));
		}

		System.out.println(result);
	}

	private static double calc(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}
}