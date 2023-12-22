import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();

		double ans1 = r * r * Math.PI;
		double ans2 = 2 * r * Math.PI;
		System.out.printf("%.6f ", ans1);
		System.out.printf("%.6f", ans2);
	}
}