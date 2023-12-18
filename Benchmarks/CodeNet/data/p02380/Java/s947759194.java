import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			//２点間の距離
			double s = (a * b / 2 * Math.sin(Math.toRadians(c)));
				System.out.println(s);
			double l = (a + b +Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b
					* Math.cos(Math.toRadians(c))));
				System.out.println(l);
			double h = (b * Math.sin(Math.toRadians(c)));
				System.out.println(h);
		}
	}
}
