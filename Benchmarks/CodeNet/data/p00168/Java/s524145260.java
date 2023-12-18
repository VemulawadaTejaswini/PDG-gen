import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			if (n <= 3) {
				System.out.println(1);
			} else {
				a = new int[n + 1];
				a[1] = 1;
				a[2] = 2;
				a[3] = 4;
				for (int i = 4; i <= n; i++) {
					a[i] = a[i - 1] + a[i - 2] + a[i - 3];
				}
				int day = a[n] / 10;
				if (a[n] % 10 != 0) {
					day++;
				}
				System.out.println(((day - 1) / 365) + 1);
			}
		}
	}
}