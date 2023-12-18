import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();
			if (n == 0) return;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int m = 0, mi = 0;
			for (int i = min-1; i < max; i++) {
				if (a[i]-a[i+1] >= m) {
					m = a[i] - a[i+1];
					mi = i + 1;
				}
			}

			System.out.println(mi);
		}
	}
}
