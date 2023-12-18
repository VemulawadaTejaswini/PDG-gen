import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		HashMap<String, Integer> cost = new HashMap<String, Integer>();
		String alc[];
		String list[][];

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				cost.put(sc.next(), sc.nextInt());
			}
			m = sc.nextInt();
			alc = new String[m];
			list = new String[m][];
			for (int i = 0; i < m; i++) {
				alc[i] = sc.next();
				if (!cost.containsKey(alc[i])) {
					cost.put(alc[i], Integer.MAX_VALUE);
				}
				int k = sc.nextInt();
				list[i] = new String[k];
				for (int j = 0; j < k; j++) {
					list[i][j] = sc.next();
				}
			}

			boolean flag = true;
			while (flag) {
				flag = false;
				for (int i = 0; i < m; i++) {
					int ncost = 0;
					for (int j = 0; j < list[i].length; j++) {
						ncost += cost.get(list[i][j]);
					}
					if (cost.get(alc[i]) == null) {
						cost.put(alc[i], ncost);
						flag = true;
					} else if (ncost < cost.get(alc[i])) {
						cost.put(alc[i], ncost);
						flag = true;
					}
				}
			}
			System.out.println(cost.get(sc.next()));
		}
	}
}