import java.util.*;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		if (x <= 0) {
			for (long i = 0; i <= k; i++) {
				if (x <= 0) {
					x += d;
				} else {
					x -= d;
				}
			}
		} else {
			for (long i = 0; i <= k; i++) {
				if (x <= 0) {
					x += d;
				} else {
					x -= d;
				}
			}
		}
		System.out.println(Math.abs(x));

	}
}