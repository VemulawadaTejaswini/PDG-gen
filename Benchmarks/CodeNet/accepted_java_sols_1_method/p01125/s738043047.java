import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			boolean matrix[][] = new boolean[21][21];

			for (int i = 0; i < n; i++) {
				String str[] = br.readLine().split(" ");
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);
				matrix[y][x] = true;
			}

			int x = 10;
			int y = 10;
			int ans = 0;

			int m = Integer.parseInt(br.readLine());

			for (int i = 0; i < m; i++) {
				String str[] = br.readLine().split(" ");
				int dist = Integer.parseInt(str[1]);
				int dx = 0;
				int dy = 0;
				if (str[0].equals("N")) {
					dy = 1;
				} else if (str[0].equals("S")) {
					dy = -1;
				} else if (str[0].equals("E")) {
					dx = 1;
				} else if (str[0].equals("W")) {
					dx = -1;
				}
				for (int j = 0; j < dist; j++) {
					x += dx;
					y += dy;
					if (matrix[y][x])
						ans++;
					matrix[y][x] = false;
				}
			}
			if (ans == n)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
