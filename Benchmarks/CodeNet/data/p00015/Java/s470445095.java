import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[] = new int[80];
		int b[] = new int[80];
		int c[] = new int[80];
		String st1, st2;

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 80; j++) {
				a[j] = 0;
				b[j] = 0;
				c[j] = 0;
			}
			st1 = sc.next();
			st2 = sc.next();
			if (80 < st1.length() || 80 < st2.length()) {
				System.out.println("overflow");
				continue;
			}
			for (int j = st1.length() - 1; 0 <= j; j--) {
				a[80 - st1.length() + j] = st1.charAt(j) - '0';
			}
			for (int j = st2.length() - 1; 0 <= j; j--) {
				b[80 - st2.length() + j] = st2.charAt(j) - '0';
			}

			f(a, b, c, 79);
			if (9 < c[0]) {
				System.out.println("overflow");
			} else {
				for (int j = 0; j < 80; j++) {
					if (c[j] != 0) {
						for (int k = j; k < 80; k++) {
							System.out.print(c[k]);
						}
						break;
					}
					if (j == 79 && a[j] == 0) {
						System.out.println("0");
					}
				}
				System.out.println();
			}
		}
	}

	public static void f(int a[], int b[], int c[], int k) {
		if (k < 0) {
			return ;
		}
		c[k] += (a[k] + b[k]);
		if (10 <= c[k]) {
			if (0 < k) {
				c[k] %= 10;
				c[k - 1]++;
			}
		}
		f(a, b, c, k - 1);
	}
}