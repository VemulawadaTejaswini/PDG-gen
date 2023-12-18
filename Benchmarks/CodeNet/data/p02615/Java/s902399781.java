import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = a[n-1], cnt = n - 2;
		for (int i = n-2; i >= 0; i--) {
			if (cnt > 0) {
				ans += a[i];
				cnt--;
			}
			if (cnt > 0) {
				ans += a[i];
				cnt--;
			}
		}
		System.out.println(ans);
	}

}

