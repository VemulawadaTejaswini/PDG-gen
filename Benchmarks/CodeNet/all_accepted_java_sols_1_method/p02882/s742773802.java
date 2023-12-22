import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		if (a * a * b / 2 >= x) {
			double y = (double) 2 * x / (double) (a * b * b);
			double ans = Math.atan(y);
			ans = 180 * ans / Math.PI;
			ans = 90 - ans;
			System.out.println(ans);
		} else {

			double y = (double) 2 * x / (double) (a * a);
			y = 2 * (double) b - y;

			y = y / (double) a;
			double ans = Math.atan(y);
			ans = 180 * ans / Math.PI;

			System.out.println(ans);
		}
	}
}