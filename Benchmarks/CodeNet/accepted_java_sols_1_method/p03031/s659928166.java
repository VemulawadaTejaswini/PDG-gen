import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s[][] = new int[m][n];
		int p[] = new int[m];

		for (int i = 0; i < m; i++) {
			Arrays.fill(s[i], 0);
		}

		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				s[i][sc.nextInt() - 1] = 1;
			}
		}

		for (int i = 0; i < m; i++) p[i] = sc.nextInt();

		int ans = 0;
		for (int i = 0; i < (1 << n); i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) == 1) {
					list.add(j);
				}
			}
			boolean can = true;
			for (int j = 0; j < m; j++) {
				int cnt = 0;
				for (int x : list) {
					if (s[j][x] == 1) cnt++;
				}
				if (cnt % 2 != p[j]) can = false;
			}
			if (can) ans++;
		}

		System.out.println(ans);

		sc.close();

	}

}
