import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int c[] = new int[k];
		int n = 0;
		for (int x = 1; x <= k; x++) {
			if (k % x == 0) {
				c[n++] = x;
			}
		}
		int m = 0;
		for (m = 0; m < n; m++)
			if (c[m] >= i) {
				break;
			}
		int l;
		for (l = n - 1; l >= 0; l--)
			if (c[l] <= j) {
				break;
			}
		System.out.printf("%d\n", l - m + 1);
		sc.close();
	}
}