import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int ans = Integer.MAX_VALUE;
		for (int l = 0; l <= n - k; l++) {
			int r = l + k - 1;
			int x = Math.abs(a[l]) + Math.abs(a[r] - a[l]);
			int y = Math.abs(a[r]) + Math.abs(a[r] - a[l]);
			ans = Math.min(ans, x);
			ans = Math.min(ans, y);
		}

		System.out.println(ans);
	}
}
