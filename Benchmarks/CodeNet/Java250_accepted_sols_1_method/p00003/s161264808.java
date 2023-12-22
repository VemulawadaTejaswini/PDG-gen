
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, n, temp;
		Boolean is_changed = true;
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			while (is_changed == true) {
				is_changed = false;
				if (a > b) {
					temp = a;
					a = b;
					b = temp;
					is_changed = true;
				}
				if (b > c) {
					temp = b;
					b = c;
					c = temp;
					is_changed = true;
				}
			}
			if (a * a + b * b - c * c == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			is_changed = true;
		}
	}
}