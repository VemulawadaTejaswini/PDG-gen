import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://atcoder.jp/contests/abc157/tasks/abc157_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean flag = true;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (map.containsKey(s)) {
				if (map.get(s) != c) {
					flag = false;
				}
			} else {
				if (s == 1 && c == 0 && N >= 2) {
					flag = false;
				} else {
					map.put(s, c);
				}
			}
		}
		sc.close();

		Integer[] ans = { -1, -1, -1 };
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ans[entry.getKey() - 1] = entry.getValue();
		}

		if (flag) {
			for (int i = 0; i < N; i++) {
				if (ans[i] >= 0) {
					System.out.print(ans[i]);
				} else {
					if (i == 0) {
						if (N == 1) {
							System.out.print("0");
						} else {
							System.out.print("1");
						}
					} else {
						System.out.print("0");
					}
				}
			}
//			System.out.println();

		} else {
			System.out.println(-1);
		}
	}
}