import java.util.Scanner;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		if (n < 1 || n > 200) {
			return;
		}
		double[] a = new double[(int) n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
			if (n < 1 || n > 1000000000) {
				return;
			}
		}
		int two = 0;
		all: while (two < 100000) {
			for (int i = 0; i < n; i++) {
				if (a[i] % Math.pow(2, two + 1) != 0) {
					break all;
				}
			}
			two++;
		}
		System.out.println(two);
	}
}
