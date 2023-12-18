
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
			int[] p = new int[n + 1];
			for (int i = 1; i <= n; i++)
				p[i] = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i <= n; i++)
				for (int j = i; j <= n; j++)
					if (p[i] + p[j] <= m)
						list.add(p[i] + p[j]);
			Collections.sort(list);
			int ans = 0;
			int suml = list.size() - 1;
			for (int i = 0; i <= suml; i++) {
				while (list.get(i) + list.get(suml) > m)
					suml--;
				ans = Math.max(ans, list.get(i) + list.get(suml));

			}
			System.out.println(ans);

		}
	}
}