
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		long ans = 0;
		for (int i = 0; i < n - 1; i++) {
			int sum = a[i] + a[i + 1];
			if (sum > x) {
				int diff = sum - x;
				ans += diff;
				a[i + 1] = a[i + 1] < diff ? 0 : a[i + 1] - diff;
			}
		}
		System.out.println(ans);
		in.close();
	}
}