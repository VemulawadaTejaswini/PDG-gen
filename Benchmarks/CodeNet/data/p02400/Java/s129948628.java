import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		double ans1 = (double)a * (double)a * Math.PI;
		double ans2 = ((double)a + (double)a) * Math.PI;
		System.out.printf("%.6f ", ans1);
		System.out.printf("%.6f", ans2);
	}
}