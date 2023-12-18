
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int n = scanner.nextInt();
			int h = scanner.nextInt();
			if ((n | h) == 0)
				break;
			boolean[][][] map = new boolean[n][n][n];
			while (h-- > 0) {
				String s = scanner.next();
				int a = scanner.nextInt() - 1;
				int b = scanner.nextInt() - 1;
				if (s.equals("xy")) {
					for (int i = 0; i < n; i++)
						map[i][a][b] = true;
				} else if (s.equals("xz")) {
					for (int i = 0; i < n; i++)
						map[b][a][i] = true;
				} else {
					for (int i = 0; i < n; i++)
						map[b][i][a] = true;
				}
			}
			int ans = 0;
			for (boolean[][] map1 : map)
				for (boolean[] map2 : map1)
					for (boolean map3 : map2)
						if (!map3)
							ans++;
			System.out.println(ans);
		}
	}
}