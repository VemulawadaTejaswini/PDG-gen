import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			int n = sc.nextInt();

			double c = a / b;

			double kei = 0;

			int ans = 0;

			for (int i = 0; i <= n; i++) {
				kei = c * (Math.pow(10, i)) % 10;
				ans = ans + (int) kei;
			}
			System.out.println(ans);
		}

	}

}