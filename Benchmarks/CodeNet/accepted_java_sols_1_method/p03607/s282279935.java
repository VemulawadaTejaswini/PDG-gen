import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int a[] = new int[N];
		int ans = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		HashMap<Integer, Integer> c = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			if (c.containsKey(a[i])) {
				int d = c.get(a[i]);
				c.put(a[i], d + 1);
			} else {
				c.put(a[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : c.entrySet()) {
			int e = entry.getValue();
			if (e % 2 == 1) {
				ans += 1;
			}
		}
		// 出力
		System.out.println(ans);
	}
}
