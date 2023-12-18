import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int a[];
		int friendA[];
		int friendB[];
		int count;

		n = sc.nextInt();
		m = sc.nextInt();
		while (n + m != 0) {
			a = new int[n];
			a[0] = 1;
			for (int i = 1; i < n; i++) {
				a[i] = 0;
			}
			friendA = new int[m];
			friendB = new int[m];
			for (int i = 0; i < m; i++) {
				friendA[i] = sc.nextInt();
				friendB[i] = sc.nextInt();
				if (friendA[i] == 1) {
					a[friendB[i] - 1] = 2;
				}
			}
			for (int i = 0; i < m; i++) {
				if (a[friendA[i] - 1] == 2 && a[friendB[i] - 1] == 0) {
					a[friendB[i] - 1] = 3;
				} else if (a[friendB[i] - 1] == 2 && a[friendA[i] - 1] == 0) {
					a[friendA[i] - 1] = 3;
				}
			}
			count = -1;
			for (int i = 0; i < n; i++) {
				if (a[i] != 0) {
					count++;
				}
			}
			System.out.println(count);
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}