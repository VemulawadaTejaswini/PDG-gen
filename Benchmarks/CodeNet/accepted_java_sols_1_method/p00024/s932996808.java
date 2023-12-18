import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a;
		int n;

		while (sc.hasNext()) {
			a = sc.nextDouble();

			n = 1;
			while (true) {
				if (a <= Math.sqrt(9.8 * 9.8 * (5 * n - 5) / 4.9)) {
					System.out.println(n);
					break;
				}
				n++;
			}
		}
	}
}