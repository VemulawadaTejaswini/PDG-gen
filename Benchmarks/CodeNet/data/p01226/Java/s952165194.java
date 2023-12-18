import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

/**
 * Battle Town
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int t = parseInt(br.readLine());
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int h = parseInt(line.substring(0, line.indexOf(' ')));
			int w = parseInt(line.substring(line.indexOf(' ') + 1));

			char map[][] = new char[h + 2][w + 2];
			Tank tank = null;

			for (int i = 0; i < h + 2; i++) {
				Arrays.fill(map[i], 'x');
			}

			for (int i = 1; i < h + 1; i++) {
				line = br.readLine();
				for (int j = 0; j < w; j++) {
					map[i][j + 1] = line.charAt(j);
					if ("^v<>".indexOf(map[i][j + 1]) > -1) {
						// init tank.
						tank = new Tank(map[i][j + 1], map, new int[]{i, j + 1});
						map[i][j + 1] = '.';
					}
				}
			}

			// sim
			br.readLine();
			line = br.readLine();
			for (char c : line.toCharArray()) tank.command(c);
			tank.finish();
			t--;

			// solve
			for (int i = 1; i < h + 1; i++) {
				for (int j = 1; j < w + 1; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			if (t > 0) {
				System.out.println();
			}

		} //end while
	} //end main
}

class Tank {

	static HashMap<Character, Character> cmds = new HashMap<Character, Character>() {
		{
			put('U', '^');
			put('D', 'v');
			put('L', '<');
			put('R', '>');
		}
	};
	static HashMap<Character, int[]> dirs = new HashMap<Character, int[]>() {
		{
			put('^', new int[]{-1, 0});
			put('v', new int[]{1, 0});
			put('<', new int[]{0, -1});
			put('>', new int[]{0, 1});
		}
	};

	private char dir;
	private char[][] map;
	private int[] pos;

	Tank(char dir, char[][] map, int[] pos) {
		this.dir = dir;
		this.map = map;
		this.pos = pos;
	}

	void command(char cmd) {
		if (cmd != 'S') {
			move(cmd);
		} else {
			shoot();
		}
	}

	private void move(char cmd) {
		this.dir = cmds.get(cmd);
		int[] next = new int[]{this.pos[0], this.pos[1]};
		next[0] += dirs.get(this.dir)[0];
		next[1] += dirs.get(this.dir)[1];
		if (map[next[0]][next[1]] == '.') {
			this.pos[0] = next[0];
			this.pos[1] = next[1];
		}
	}

	private void shoot() {
		int[] shell = new int[]{this.pos[0], this.pos[1]};
		while (true) {
			shell[0] += dirs.get(this.dir)[0];
			shell[1] += dirs.get(this.dir)[1];
			switch (map[shell[0]][shell[1]]) {
				case '.':
				case '-':
					continue;
				case '*':
					map[shell[0]][shell[1]] = '.';
				case '#':
				case 'x':
			}
			break;
		}
	}

	void finish() {
		map[this.pos[0]][this.pos[1]] = this.dir;
	}

}