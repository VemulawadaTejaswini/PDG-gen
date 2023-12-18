import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Misterious Gems
 */
public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {

			int n = parseInt(line);
			Map map = main.new Map(n);

			for (int i = 0; i < n; ++i) {
				map.setGem(br.readLine());
			}

			int m = parseInt(br.readLine());
			for (int i = 0; i < m; ++i) {
				map.command(br.readLine());
			}

			if (map.isComplete()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	class Map {

		final int SIZE = 21;
		final int START = 10;
		final int[] H = { 1, -1, 0, 0 };
		final int[] V = { 0, 0, 1, -1 };
		final int EAST = 0;
		final int WEST = 1;
		final int NORTH = 2;
		final int SOUTH = 3;

		int total, gets = 0;
		boolean[][] map;
		int[] current;

		Map(int n) {
			total = n;
			map = new boolean[SIZE][SIZE];
			current = new int[] { START, START };
		}

		void setGem(String info) {
			StringTokenizer st = new StringTokenizer(info);
			int x, y;
			x = parseInt(st.nextToken());
			y = parseInt(st.nextToken());
			map[x][y] = true;
		}

		void command(String command) {
			int dir, distance;

			switch (command.charAt(0)) {
			case 'N':
				dir = NORTH;
				break;
			case 'E':
				dir = EAST;
				break;
			case 'S':
				dir = SOUTH;
				break;
			case 'W':
				dir = WEST;
				break;
			default:
				dir = 0;
			}

			distance = parseInt(command.substring(2));

			for (int i = 0; i < distance; ++i) {
				current[0] += H[dir];
				current[1] += V[dir];
				if (map[current[0]][current[1]]) {
					++gets;
					map[current[0]][current[1]] = false;
				}
			}
		}

		boolean isComplete() {
			if (total == gets) {
				return true;
			} else {
				return false;
			}
		}

	}

}