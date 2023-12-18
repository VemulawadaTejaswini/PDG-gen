import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 2];
		a[0] = 0;
		int ans = 0, total = 0;
		for (int i = 1; i <= n; ++i) {
			a[i] = sc.nextInt();
			total += Math.abs(a[i] - a[i - 1]);
		}
		a[n + 1] = 0;
		total += Math.abs(a[n + 1] - a[n]);
		sc.close();
		int tmp = 0;
		for (int i = 1; i <= n; ++i) {
			tmp = Math.abs(a[i] - a[i - 1]) + Math.abs(a[i + 1] - a[i]);
			ans = total - tmp;
			tmp = Math.abs(a[i + 1] - a[i - 1]);
			ans += tmp;
			System.out.println(ans);
		}
	}

}
