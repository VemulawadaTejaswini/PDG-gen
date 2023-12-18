import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long ans = 0;
		int sum = 0;
		int r = 0;
		for (int l = 0; l < n; l++) {
			while (r < n) {
				if (sum + a[r] == (sum ^ a[r])) {
					sum += a[r];
					r++;
				} else {
					break;
				}
			}
			ans += r - l;
			sum -= a[l];
		}
		System.out.println(ans);
	}
}
