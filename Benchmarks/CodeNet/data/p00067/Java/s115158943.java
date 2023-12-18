
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int n = 12;
		int l = 12;
		while (scanner.hasNext()) {
			
			boolean[][] map = new boolean[l][n];
			for (int i = 0; i < l; i++) {
				String strs = scanner.nextLine();
				for (int j = 0; j < n; j++) {
					if (strs.charAt(j) == '1') {
						map[i][j] = true;
					}
				}
			}
			int count = 0;
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j]) {
						count++;
						dfs(i, j, map, n, l);
					}
				}
			}
			System.out.println(count);
			if(scanner.nextLine().isEmpty()){
				continue;
			}
		}
	}

	private static void dfs(int y, int x, boolean[][] map, int n, int l) {
		int[] dx = { -1, 0, 0, 1 };
		int[] dy = { 0, 1, -1, 0 };
		Deque<int[]> deque = new ArrayDeque<int[]>();
		deque.push(new int[] { y, x });

		while (!deque.isEmpty()) {
			int[] a = deque.pop();
			int ny = a[0];
			int nx = a[1];
			map[ny][nx] = false;
			for (int i = 0; i < 4; i++) {
				int py = ny + dy[i];
				int px = nx + dx[i];
				if (0 <= px && px < n && 0 <= py && py < l && map[py][px]) {
					deque.push(new int[] { py, px });
				}
			}
		}
	}
}