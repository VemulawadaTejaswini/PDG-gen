import java.util.Scanner;

public class Main {
	int[] a, tmp;

	void shuffle(int p, int c) {
		for (int i = 0; i < p - 1; i++) {
			tmp[i] = a[i];
		}
		for (int i = 0; i < c; i++) {
			a[i] = a[p - 1 + i];
		}
		for (int i = 0; i < p - 1; i++) {
			a[c + i] = tmp[i];
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if ((n | r) == 0) {
				break;
			}
			a = new int[n];
			tmp = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = n - i;
			}
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				shuffle(p, c);
			}
			System.out.println(a[0]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}