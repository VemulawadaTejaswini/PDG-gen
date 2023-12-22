import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b;
		a = sc.nextLong();
		b = sc.nextLong();
		long tempa = a;
		long tempb = b;
		int temp[] = new int[64];
		int c[];
		int d[];
		int i = 0;
		if (a == b) {
			System.out.println(a);
			return;
		}
		while (b > 0) {
			temp[i] = (int) (b % 2);
			b = b / 2;
			i++;
		}
		c = new int[i];
		for (int j = 0; j < i; j++) {
			c[j] = temp[j];
		}
		i = 0;
		if (a > 1) {
			a--;
			while (a > 0) {
				temp[i] = (int) (a % 2);
				a = a / 2;
				i++;
			}
			d = new int[i];
			for (int j = 0; j < i; j++) {
				d[j] = temp[j];
			}
			for (i = c.length - 1; i >= 0; i--) {
				if (i > 0 && c[i] == 1 && c[0] == 1) {
					c[i] = 0;
				}
			}
			for (i = d.length - 1; i >= 0; i--) {
				if (i > 0 && d[i] == 1 && d[0] == 1) {
					d[i] = 0;
				}
			}
			for (i = 1; i < d.length; i++) {
				if (c[i] == d[i]) {
					c[i] = 0;
				} else {
					c[i] = 1;
				}
			}
			int t = (int) ((tempb - tempa) % 4);
			if (t == 3) {
				c[0] = 0;
			} else if (t == 2 ) {
				if (c[0] == 0) {
					c[0] = 1;
				} else {
					c[0] = 0;
				}
			} else if (t==1) {
				c[0] =1;
			}
		} else {
			for (i = c.length - 1; i > 0; i--) {
				if (i > 0 && c[i] == 1 && c[0] == 1) {
					c[i] = 0;
				}
			}
			int t = (int) (tempb % 4);
			if (t == 2 || t == 3) {
				if (c[0] == 0) {
					c[0] = 1;
				} else {
					c[0] = 0;
				}
			}
		}
		long result = 0;
		for (i = c.length - 1; i >= 0; i--) {
			result *= 2;
			result += c[i];
		}
		System.out.println(result);
	}
}