
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		long ans = 0;
		int tmp = Math.min(x, y);
		x -= tmp;
		y -= tmp;
		if(a + b < 2 * c) {
			ans += tmp * (a + b);
		} else {
			ans += tmp * 2 * c;
		}
		if(x % 2 == 1) {
			if(a < 2 * c) {
				ans += a;
			} else {
				ans += 2 * c;
			}
			x--;
		}
		if(a < 2 * c) {
			ans += a * x;
		} else {
			ans += 2 * c * x;
		}
		if(y % 2 == 1) {
			if(b < 2 * c) {
				ans += b;
			} else {
				ans += 2 * c;
			}
			y--;
		}
		if(b < 2 * c) {
			ans += b * y;
		} else {
			ans += 2 * c * y;
		}
		System.out.println(ans);
	}

}
