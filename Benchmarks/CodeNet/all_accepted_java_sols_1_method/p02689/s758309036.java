import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		int[] max = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			max[i] = 0;
		}
		int ans = 0;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			max[a - 1] = Math.max(max[a - 1], h[b - 1]);
			max[b - 1] = Math.max(max[b - 1], h[a - 1]);
		}
		for (int i = 0; i < n; i++) {
			if (h[i] > max[i]) {
				ans++;
			}
		}
		sc.close();
		System.out.println(ans);
	}

}