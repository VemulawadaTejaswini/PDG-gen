import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = arr[i - 1] + sc.nextLong();
		}
		long total = arr[n];
		long min = Long.MAX_VALUE;
		for (int i = 1; i < n; i++) {
		    min = Math.min(min, Math.abs(arr[i] * 2 - total));
		}
		System.out.println(min);
   }
}

