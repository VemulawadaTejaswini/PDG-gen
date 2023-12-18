import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		double hDegree = 360.0 * (h + m / 60.0) / 12;
		double mDegree = 360.0 * m / 60;
		double theta = Math.toRadians(Math.max(hDegree, mDegree) - Math.min(hDegree, mDegree));
		double ans = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(theta));
		System.out.printf("%.12f", ans);
	}

}
