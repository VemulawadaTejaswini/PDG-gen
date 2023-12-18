import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n, s;
	int ans;

	void run() {
		while (sc.hasNext()) {
			n = sc.nextInt();
			s = sc.nextInt();
			ans = 0;
			dfs(0, 0, -1);
			System.out.println(ans);
		}
	}

	void dfs(int num, int sum, int use) {
		if (num == n) {
			if (sum == s) {
				ans++;
			}
		} else {
			for (int i = use + 1; i <= 9; i++) {
				dfs(num + 1, sum + i, i);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}