
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] order = new int[n + 1][n + 1];
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n; j++) {
				order[i][j] = sc.nextInt();
			}
		}
		int[] num = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			num[i] = 1;
			order[i][0] = 0;
			order[i][n] = 0;
		}
		int[] cnt = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			cnt[i] = 0;
		}
		int player = 1;
		int change = 0;
		while(true) {
			int enemy = order[player][num[player]];
			if(enemy != 0 && player == order[enemy][num[enemy]]) {
				num[player]++;
				num[enemy]++;
				int max = Math.max(cnt[player], cnt[enemy]);
				max++;
				cnt[player] = max;
				cnt[enemy] = max;
				change = 0;
			} else if(enemy == 0) {
				if(player != n)
					player++;
				else
					player = 1;
				change++;
			} else {
				player = enemy;
				change++;
			}
			if(change > n)
				break;
		}

		boolean flag = true;
		int ans = 0;
		for(int i = 1; i < n + 1; i++) {
			if(num[i] != n) {
				flag = false;
			} else {
				ans = Math.max(ans, cnt[i]);
			}
		}
		if(flag) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}

	}

}
