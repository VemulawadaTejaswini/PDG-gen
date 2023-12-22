import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		if (a >= b && a >= c) {
			for (int i = 0; i < k; i++) {
				a *= 2;
			}
		} else if (b >= a && b >= c) {
			for (int i = 0; i < k; i++) {
				b *= 2;
			}
		} else {
			for (int i = 0; i < k; i++) {
				c *= 2;
			}
		}
		
		System.out.println((a + b + c));

		sc.close();
	}
}
