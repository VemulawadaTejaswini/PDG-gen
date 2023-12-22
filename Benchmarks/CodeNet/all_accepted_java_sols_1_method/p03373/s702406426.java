import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long x = sc.nextInt();
		long y = sc.nextInt();
		long total = a * x + b * y;
		if (x > y) {
			total = Math.min(total, x * 2 * c);
			total = Math.min(total, y * 2 * c + (x - y) * a);
		} else {
			total = Math.min(total, y * 2 * c);
			total = Math.min(total, x * 2 * c + (y - x) * b);
		}
		System.out.println(total);
	}
}
