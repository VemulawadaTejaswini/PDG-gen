import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long ans = 0;
		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {

		} else {
			if (a >= b && a >= c) {
				ans = (a / 2 + 1) * b * c - b * c * (a / 2);
			} else if (b >= a && b >= c) {
				ans = (b / 2 + 1) * a * c - a * c * (b / 2);
			} else if (c >= a && c >= b) {
				ans = (c / 2 + 1) * a * b - a * b * (c / 2);
			}
		}
		System.out.println(ans);
	}
}
