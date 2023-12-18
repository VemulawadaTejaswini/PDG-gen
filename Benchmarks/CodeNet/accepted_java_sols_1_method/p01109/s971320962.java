import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				System.exit(0);
			}
			int[] a = new int[n];
			double ave = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				ave += a[i];
			}
			ave /= n;
			Arrays.sort(a);
			int ok = 0;
			int ng = n;
			while (Math.abs(ok - ng) > 1) {
				int mid = (ok + ng) / 2;
				if (a[mid] <= ave) {
					ok = mid;
				} else {
					ng = mid;
				}
			}
			System.out.println(ok + 1);
		}
	}
}


