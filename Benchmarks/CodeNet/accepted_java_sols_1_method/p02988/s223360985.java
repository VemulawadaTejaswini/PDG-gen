import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i <= n - 3; i++) {
			if (a[i] < a[i + 1] && a[i + 1] < a[i + 2]) {
				ans++;
			}

			if (a[i] > a[i + 1] && a[i + 1] > a[i + 2]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}