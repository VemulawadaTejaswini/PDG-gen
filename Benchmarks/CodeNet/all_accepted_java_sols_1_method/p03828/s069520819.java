import java.util.Scanner;
public class Main {
	static long k = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n + 1];
		long c = 1;
		for (int i = 2; i <= n; i++) {
			int m = i;
			for (int j = 2; j <= i; j++) {
				while (m % j == 0) {
					m /= j;
					a[j]++;
				}
			}
		}
		for (int i = 2; i <= n; i++)
			c = c * (a[i] + 1) % 1000000007;
		System.out.println(c);
	}
}