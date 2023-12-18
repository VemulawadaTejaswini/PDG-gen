import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long ans = 0;
		long x, y;
		long xm, ym;

		if(Math.abs(a) > Math.abs(b)) {
			x = a;
			xm = b;
		}else {
			x = b;
			xm = a;
		}

		if(Math.abs(c) > Math.abs(d)) {
			y = c;
			ym = d;
		}else {
			y = d;
			ym = c;
		}

		if(x < 0 && y < 0) {
			ans = x * y;
		}else if(x > 0 && y > 0) {
			ans = x * y;
		}else {
			if(x == 0 || y == 0) {
				ans = 0;
			}else if(x > 0) {
				ans = xm * ym;
			}else {
				ans = xm * ym;
			}
		}

		System.out.print(ans);
		sc.close();
	}
}