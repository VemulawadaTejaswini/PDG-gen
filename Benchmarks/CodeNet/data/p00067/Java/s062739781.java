import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static int solve (char[][] map) {
		int ret = 0;
		int[] moveX = {0,0,-1,1};
		int[] moveY = {-1,1,0,0};
		boolean[][] check = new boolean[map.length][map[0].length];
		Queue<Integer> queueX = new LinkedList<Integer>();
		Queue<Integer> queueY = new LinkedList<Integer>();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == '1' && !check[i][j]) {
					ret++;
					check[i][j] = true;

					queueX.add(j);
					queueY.add(i);

					while (!queueX.isEmpty()) {
						int x = queueX.poll();
						int y = queueY.poll();
						for (int k = 0; k < moveX.length; k++) {
							int nx = x + moveX[k];
							int ny = y + moveY[k];
							if (nx < 0 || nx >= map.length ||
									ny < 0 || ny >= map.length ||
									check[ny][nx]  == true) continue;
							if (map[ny][nx] == '0') continue;
							check[ny][nx] = true;
							queueX.add(nx);
							queueY.add(ny);
						}
					}

				}
			}
		}

		return ret;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		main:while (true) {
			char[][] map = new char[12][12];
			for (int i = 0; i < map.length; i++) {
				String line = br.readLine();
				if (line == null)
					break main;
				else if (line.isEmpty()) continue main;
				char[] c = line.toCharArray();
				for (int j = 0; j < c.length; j++)
					map[i][j] = c[j];
			}
			System.out.println(solve(map));
		}

	}

}