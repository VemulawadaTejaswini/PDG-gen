
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if ((n | m) == 0)
				break;
			int[] num = new int[n + 1];
			for (int i = 1; i <= n; i++)
				num[i] = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i <= n; i++)
				for (int j = i; j <= n; j++)
					if (num[i] + num[j] <= m)
						list.add(num[i] + num[j]);
			Collections.sort(list);
			int ans = list.get(0) + list.get(list.size() - 1);
			int i = 1;
			int j = list.size() - 1;

			boolean flag = true;
			while (i < j) {
				int l = i;
				int r = j;
				while (l <= r) {
					int mid = (l + r) / 2;
					int ret = list.get(flag ? j : i) + list.get(mid);
					if (ret <= m) {
						ans = Math.max(ans, ret);
						l = mid + 1;
					} else {
						r = mid - 1;
					}
				}
				if (flag)
					i = l;
				else
					j = r;
				flag = !flag;

			}
			System.out.println(ans);

		}
	}
}