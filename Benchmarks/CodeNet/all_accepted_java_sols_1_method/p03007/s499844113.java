import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long sum1 = a[n - 1];
		long sum2 = a[0];
		int i = 1;
		while (a[i] <= 0 && i < n - 1) {
			sum1 -= a[i];
			i++;
		}
		while (i < n - 1) {
			sum2 -= a[i];
			i++;
		}
		System.out.println(sum1 - sum2);
		sum1 = a[n - 1];
		sum2 = a[0];
		i = 1;
		while (a[i] <= 0 && i < n - 1) {
			System.out.println(sum1 + " " + a[i]);
			sum1 -= a[i];
			i++;
		}
		while (i < n - 1) {
			System.out.println(sum2 + " " + a[i]);
			sum2 -= a[i];
			i++;
		}
		System.out.println(sum1 + " " + sum2);
	}
}

