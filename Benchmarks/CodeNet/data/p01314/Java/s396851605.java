import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		long[] a = new long[1005];
		for (int i = 0; i < 1005; i++) {
			a[i] = i;
		}
		for (int i = 0; i < 1004; i++) {
			a[i + 1] += a[i];
		}
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int ans = 0;
			for (int i = 0; i <= n; i++) {
				for (int j = i + 2; j <= n; j++) {
					if (a[j] - a[i] == n) {
						ans++;
					}
				}
			}
			
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}