import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int k = Integer.parseInt(str[0]);
			for (int j = 1; j <= k; j++) {
				list.get(i).add(Integer.parseInt(str[j]) - 1);
			}
		}

		str = br.readLine().split(" ");

		int p[] = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = Integer.parseInt(str[i]);
		}

		int ans = 0;
		for (int i = 0; i < (1 << n); i++) {
			int swi[] = new int[m];
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					for (int k = 0; k < m; k++) {
						if (list.get(k).contains(j)) {
							swi[k]++;
						}
					}
				}
			}

			boolean flag = false;
			for (int j = 0; j < m; j++) {
				if (swi[j] % 2 != p[j]) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}