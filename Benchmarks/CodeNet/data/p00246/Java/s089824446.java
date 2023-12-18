
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] a = new int[10];
			for (int i = 0; i < n; i++) {
				int b = scanner.nextInt();
				a[b]++;
			}
			int sum = 0;
			for (int i = 1; i < 5; i++) {
				int c = Math.min(a[i], a[10 - i]);
				sum += c;
				a[i] -= c;
				a[10 - i] -= c;
			}
			sum += a[5] / 2;
			a[5] %= 2;
			if(a[1]<2)
				a[8] =0;
			a[9] = 0;
			ans = 0;
			dfs(1, 0, a, 0);
			System.out.println(sum + ans);
		}

	}

	int ans;

	private void dfs(int i, int sum, int[] a, int now) {
		int rem = sum;
		int max = 0;
		for (int j = 1; j < 10; j++) {
			rem += a[j] * j;
			if(a[j]!=0)
				max=j;
		}
		if (now + rem / 10 <= ans)
			return;
		ans = Math.max(ans, now);
		if (sum == 10) {
			dfs(1, 0, a, now + 1);
			return;
		}
		if (i > max)
			return;
		dfs(i + 1, sum, a, now);
		if (a[i] > 0 && sum + i <= 10) {
			a[i]--;
			dfs(i, sum + i, a, now);
			a[i]++;
		}
	}
}