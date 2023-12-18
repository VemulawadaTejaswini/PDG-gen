import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			List<Integer> list2 = new ArrayList<Integer>();
			for (int j = 0; j < k; j++) {
				list2.add(sc.nextInt() - 1);
			}
			list.add(list2);
		}
		int[] p = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		int end = (int) Math.pow(2, n);
		for (int i = 0; i < end; i++) {
			boolean flg = true;
			for (int k = 0; k < m; k++) {
				List<Integer> list2 = list.get(k);
				int cnt = 0;
				for (int j = 0; j < n; j++) {
					if ((i >> j) % 2 == 1 && list2.contains(j)) {
						cnt++;
					}
				}
				if (cnt % 2 != p[k]) {
					flg = false;
					break;
				}
			}
			if (flg) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
