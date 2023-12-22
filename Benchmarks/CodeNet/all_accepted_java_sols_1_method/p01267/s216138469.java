import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a, b, c;
		int x, y[];

		while (true) {
			n = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			x = sc.nextInt();
			if ((n | a | b | c | x) == 0) {
				break;
			}
			y = new int[n];
			for (int i = 0; i < n; i++) {
				y[i] = sc.nextInt();
			}

			int cnt = 0;
			int l = 0;
			boolean f = false;
			while (true) {
				if (10000 < cnt) {
					f = false;
					break;
				}
				if (y[l] == x) {
					l++;
				}
				x = (a * x + b) % c;
				if (l == n) {
					f = true;
					break;
				}
				cnt++;
			}

			if (f) {
				System.out.println(cnt);
			} else {
				System.out.println("-1");
			}
		}
	}
}