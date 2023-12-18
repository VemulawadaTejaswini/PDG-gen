import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()) {

			double v = sc.nextDouble();
			double y = (v * v) / (2 * 9.8);
			int n = 0;

			for (int i = 0;; i++) {
				if (y < (5 * i - 5)) {
					n = i;
					break;
				}
			}
			System.out.println(n);
		}
	}
}