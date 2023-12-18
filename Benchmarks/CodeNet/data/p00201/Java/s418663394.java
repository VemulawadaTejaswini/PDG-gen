import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			int n = sc.nextInt();

			if (n == 0) {
				break;
			}
			HashMap<String, Integer> value = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				value.put(sc.next(), sc.nextInt());
			}
			int m = sc.nextInt();
			String[][] memo = new String[m][];
			for (int i = 0; i < m; i++) {
				String S = sc.next();
				int l = sc.nextInt();
				memo[i] = new String[l + 1];
				for (int j = 1; j <= l; j++) {
					memo[i][j] = sc.next();
				}
				memo[i][0] = S;
			}
			String t = sc.next();
			boolean f = true;
			while (f) {
				f = false;
				for (int i = 0; i < m; i++) {
					int num = 0;
					for (int j = 1; j < memo[i].length; j++) {
						num += value.get(memo[i][j]);
					}
					if (num < value.get(memo[i][0])) {
						f = true;
						value.put(memo[i][0], num);
					}
				}
			}
			ans = value.get(t);
			System.out.println(ans);
		}

	}
}
