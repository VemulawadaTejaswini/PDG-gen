import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (a + b > c * 2) {
			if (x - y > 0) {
				if (a > c * 2) {
					System.out.println(c * x * 2);
				} else {
					System.out.println(c * y * 2 + a * (x-y));
				}
			} else {
				if (b > c * 2) {
					System.out.println(c * y * 2);
				} else {
					System.out.println(c * x * 2 + b * (y-x));
				}
			}
		} else {
			System.out.println(a * x + b * y);
		}
	}
}
