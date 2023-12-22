import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		Double r = sc.nextDouble();

		if (r > 0 && r < 10000) {
			double length = 2 * r * Math.PI;
			double area = r * r * Math.PI;

			System.out.printf("%.5f %.5f", area, length);
		}

	}
}
