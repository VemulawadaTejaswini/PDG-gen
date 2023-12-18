import java.util.Scanner;

public class Main {
	int[] cache = new int[2001];
	Scanner sc = new Scanner(System.in);

	void init() {
		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				cache[i + j]++;
			}
		}

	}

	void run() {
		init();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int ans = 0;
			for (int i = 0; i <= n; i++) {
				ans += cache[n - i] * cache[i];
			}
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}