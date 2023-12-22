import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Arrays.parallelSort(a);

		int ans = 0;
		int cnt0 = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int base = a[0];
		int baseIdx = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == base) {
				cnt0++;
			} else if (a[i] == base + 1) {
				cnt1++;
			} else if (a[i] == base + 2) {
				cnt2++;
			} else {
				int sum = cnt0 + cnt1 + cnt2;
				ans = Math.max(ans, sum);
				baseIdx += cnt0;
				base = a[baseIdx];
				cnt0 = cnt1;
				cnt1 = cnt2;
				cnt2 = 0;
				i--;
			}
			if (i == n - 1) {
				int sum = cnt0 + cnt1 + cnt2;
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
	}
}
