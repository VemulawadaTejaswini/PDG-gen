import java.io.*;
import java.util.*;

class Main {

	public static int JosephsPotato (int n, int m) {

		int cnt = 0;
		int move = m;
		int mod = n + 1;
		int[] player = new int[n + 1];
		boolean[] isLose = new boolean[n + 1];

		// 初期化処理
		for (int i = 1; i < player.length; i++) {
			player[i] = i;
			isLose[i] = false;
		}

		int point = 0; // 開始地点の設定（= 1）

		while (true) {

			int j = 1;
			int p = 0;
			int index = 0;
			while (true) {
				if ((point + j) % mod == 0) {
					j++;
					continue;
				}
				if (isLose[(point + j) % mod] == false) {
					p++;
					if (p == move) {
						index = (point + j) % mod;
						break;
					}
				}
				j++;
			}
			isLose[index] = true; // 輪から抜ける
			cnt++;
			point = index;
			if (cnt == n - 1) break;

		}

		// 唯一抜けていないプレイヤーが勝者
		for (int i = 1; i < player.length; i++) {
			if (!isLose[i]) return i;
		}

		return -1;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> ans = new ArrayList<Integer>();

		while (true) {

			StringTokenizer st = new StringTokenizer(br.readLine()," ");

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if (n == 0 && m == 0) break;
			ans.add(JosephsPotato(n, m));

		}

		for (int a : ans)
			System.out.println(a);

	}

}