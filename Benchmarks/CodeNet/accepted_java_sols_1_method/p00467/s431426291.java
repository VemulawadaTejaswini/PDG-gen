import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int map[], xi;
		int a;
		int count;

		n = sc.nextInt();
		m = sc.nextInt();
		while (n + m != 0) {
			count = 0;
			a = 0;
			map = new int[n];
			for (int i = 0; i < n; i++) {
				map[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				xi = sc.nextInt();
				if (a < n - 1) {
					count++;
				}
				a += xi;
				if (a < n - 1) {
					a += map[a];
				}
			}
			System.out.println(count);
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}