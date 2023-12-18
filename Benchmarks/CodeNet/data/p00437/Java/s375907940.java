
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int n3 = scanner.nextInt();
			if ((n1 | n2 | n3) == 0)
				break;
			int n = scanner.nextInt();
			int[] ans = new int[n1 + n2 + n3];
			Arrays.fill(ans, 2);
			List<int[]> list = new ArrayList<int[]>();
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				int c = scanner.nextInt() - 1;
				int d = scanner.nextInt();
				if (d == 1)
					ans[a] = ans[b] = ans[c] = 1;
				else
					list.add(new int[] { a, b, c });
			}
			for (int[] abc : list) {
				int count = 0;
				for (int a : abc)
					count += ans[a] == 1 ? 1 : 0;
				if (count != 2)
					continue;
				for (int a : abc)
					if (ans[a] == 2)
						ans[a] = 0;
			}
			for (int a : ans)
				System.out.println(a);
		}
	}

}