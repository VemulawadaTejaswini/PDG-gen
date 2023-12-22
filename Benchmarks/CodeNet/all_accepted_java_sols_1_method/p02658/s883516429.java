import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		long max = 1000000000000000000L;
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextLong();
		    if (arr[i] == 0) {
		        System.out.println(0);
		        return;
		    }
		}
		for (int i = 0; i < n; i++) {
		    long x = arr[i];
		    if (max / ans < x) {
		        System.out.println(-1);
		        return;
		    }
		    ans *= x;
		}
		if (ans > max) {
		    System.out.println(-1);
		} else {
		    System.out.println(ans);
		}
	}
}
