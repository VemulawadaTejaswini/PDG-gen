import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (i < n - 1) {
				if (a[i] == a[i + 1]) {
					while (i < n - 1 && a[i] == a[i + 1]) {
						i++;
					}
				}

				if (a[i] > a[i + 1]) {
					while (i < n - 1 && a[i] >= a[i + 1]) {
						i++;
					}
				} else if (a[i] < a[i + 1]) {
					while (i < n - 1 && a[i] <= a[i + 1]) {
						i++;
					}
				}
			}

			cnt++;

		}
		System.out.println(cnt);
	}
}
