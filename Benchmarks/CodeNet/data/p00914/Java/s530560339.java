import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int n, k, s, cnt, use_cnt;

	void run() {
		for (;;) {
			n = sc.nextInt(); // less than or equal n
			k = sc.nextInt(); // num of elements
			s = sc.nextInt(); // sum of integer
			if ((n | k | s) == 0) {
				break;
			}
			cnt = 0;
			dfs(0, 1, 0);
			System.out.println(cnt);
		}
	}

	void dfs(int use_cnt, int num, int sum) {
		if (num - 1 > n) {
			return;
		}
		if (use_cnt == k) {
			if (sum == s) {
				cnt++;
			}
			return;
		} else {
			dfs(use_cnt + 1, num + 1, sum + num); // use num
			dfs(use_cnt, num + 1, sum); // not use num
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}