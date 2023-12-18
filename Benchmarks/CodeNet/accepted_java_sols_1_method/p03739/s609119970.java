import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		int diff = 0;
		long c = 0;
		for (int i = 0; i < n; i++) {
			diff += a[i];
			if (i % 2 == 0) {
				if (diff <= 0) {
					c += -diff + 1;
					diff = 1;
				}
			}
			else {
				if (diff >= 0) {
					c += diff + 1;
					diff = -1;
				}
			}
		}
		long ans = c;
		c = 0;
		diff = 0;
		for (int i = 0; i < n; i++) {
			diff += a[i];
			if (i % 2 != 0) {
				if (diff <= 0) {
					c += -diff + 1;
					diff = 1;
				}
			}
			else {
				if (diff >= 0) {
					c += diff + 1;
					diff = -1;
				}
			}
		}
		ans = Math.min(ans, c);
		System.out.println(ans);
	}
}