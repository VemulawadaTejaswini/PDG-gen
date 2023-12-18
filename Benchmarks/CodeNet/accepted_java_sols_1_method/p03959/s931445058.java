import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mount = new int[n];
		int[] arr = new int[n];
		boolean[] ok = new boolean[n];
		int prev = 0;
		for (int i = 0; i < n; i++) {
			mount[i] = sc.nextInt();
			if (mount[i] > prev) {
				ok[i] = true;
			}
			prev = mount[i];
		}
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		prev = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > prev) {
				if ((ok[i] && arr[i] != mount[i]) || !ok[i] && arr[i] > mount[i]) {
					System.out.println(0);
					return;
				}
				ok[i] = true;
				mount[i] = arr[i];
			} else {
				if (ok[i] && arr[i] < mount[i]) {
					System.out.println(0);
					return;
				}
				mount[i] = Math.min(arr[i], mount[i]);
			}
			prev = arr[i];
		}
		long total = 1;
		for (int i = 0; i < n; i++) {
			if (!ok[i]) {
				total *= mount[i];
				total %= MOD;
			}
		}
		System.out.println(total);
	}
}
