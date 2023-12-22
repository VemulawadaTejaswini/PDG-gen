import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] t = new long[n];
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextLong();
			a[i] = sc.nextLong();
		}
		for (int i = 1; i < n; i++) {
			long kake = Math.max((t[i - 1] + a[i - 1] + t[i] + a[i] - 1) / (t[i] + a[i]), Math.max((t[i - 1] + t[i] - 1) / t[i], (a[i - 1] + a[i] - 1) / a[i]));
			t[i] *= kake;
			a[i] *= kake;
		}
		System.out.println(t[n - 1] + a[n - 1]);
	}
}