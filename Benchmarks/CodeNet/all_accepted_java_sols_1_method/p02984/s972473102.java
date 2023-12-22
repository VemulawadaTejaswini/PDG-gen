import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] ans = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if (i % 2 == 0) {
				sum += a[i];
			} else {
				sum -= a[i];
			}
		}
		ans[0] = sum;
		for (int i = 1; i < n; i++) {
			ans[i] = 2 * a[i - 1] - ans[i - 1];
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println(ans[n - 1]);
	}
}