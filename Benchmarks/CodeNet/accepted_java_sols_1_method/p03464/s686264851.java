import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long[] arr = new long[k];
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		long max = 2;
		long min = 2;
		for (int i = k - 1; i >= 0; i--) {
			long x = arr[i];
			long mod = max % x;
			if (max - mod < min) {
				System.out.println(-1);
				return;
			}
			max = (max / x) * x + x - 1;
			min = ((min + x - 1) / x) * x;
		}
		System.out.println(min + " " + max);
	}
}
