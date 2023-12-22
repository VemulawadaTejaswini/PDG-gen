import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[n];
		Integer[] b = new Integer[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(b, Comparator.reverseOrder());
		int ans = Integer.MAX_VALUE;
		for(int i = 0 ; i <= n ; i++) {
			if(i != 0) h -= b[i - 1];
			int cnt = 0;
			if(h > 0) {
				cnt = (h + a[n - 1] - 1) / a[n - 1];
			}
			ans = Math.min(ans, cnt + i);
		}
		System.out.println(ans);
	}

}
