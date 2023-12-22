import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[100002];
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt() + 1;
			a[x - 1]++;
			a[x]++;
			a[x + 1]++;
			if (ans < a[x - 1]) {
				ans = a[x - 1];
			}
			if (ans < a[x]) {
				ans = a[x];
			}
			if (ans < a[x + 1]) {
				ans = a[x + 1];
			}
		}
		
		
		System.out.println(ans);

		sc.close();
	}
}