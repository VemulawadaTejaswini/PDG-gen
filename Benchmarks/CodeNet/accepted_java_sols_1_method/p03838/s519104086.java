import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans;
		if (a >= 0 && b >= 0) {
			if (b >= a) {
				ans = b - a;
			} else {
				ans = a - b + 2;
				if (b == 0) {
					ans--;
				}
			}
		} else if (a < 0 && b > 0) {
			if (b >= -a) {
				ans = b + a + 1;
			} else {
				ans = -(b + a) + 1;
			}
		} else if (a < 0 && b == 0) {
			ans = -a;
		} else if (a >= 0 && b < 0) {
			if (-b >= a) {
				ans = -b - a + 1;
			} else {
				ans = a + b + 1;
			}
		} else {
			if (-b > -a) {
				ans = - b + a + 2;
			} else {
				ans = b - a;
			}
		}
		System.out.println(ans);
	}
}
