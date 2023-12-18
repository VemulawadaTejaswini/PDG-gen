import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long total = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		long a = 0;
		long min = Long.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			a += arr[i];
			min = Math.min(min, Math.abs(total - 2 * a));
		}
		System.out.println(min);
		
	}
}
