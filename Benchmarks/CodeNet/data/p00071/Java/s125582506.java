import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strIn = parseStdin();
		if (strIn != null) {
			int cnt = Integer.parseInt(strIn);
			for (int n = 0; n < cnt; n++) {
				byte[][]	map = solve();
				System.out.println("Data " + (n + 1) + ":");
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						System.out.print(map[i][j]);
					}
					System.out.println("");
				}
			}
		}
	}

	private static byte[][] solve() {
		byte[][]	map = new byte[8][8];

		parseStdin();
		for (int n = 0; n < 8; n++) {
			int	m = 0;
			for (char c : parseStdin().toCharArray()) {
				map[n][m++] = (byte)(c - '0');
			}
		}

		int[]	oPos  = { Integer.parseInt(parseStdin()) - 1, Integer.parseInt(parseStdin()) - 1 };
		if (clear(map, oPos[0], oPos[1]) == (byte)1) {
			bomb(map, oPos);
		}

		return map;
	}

	private static void bomb(byte[][] map, int[] oPos) {
		bombCore(map, oPos, 0);
		bombCore(map, oPos, 1);
		bombCore(map, oPos, 2);
		bombCore(map, oPos, 3);
	}

	private static void bombCore(byte[][] map, int[] oPos, int dir) {
		int[] nPos = new int[2]; 
		for (int n = 1; n <= 3; n++) {
			switch (dir) {
			case 0:
				nPos[0] = oPos[0];
				nPos[1] = oPos[1] - n;
				break;
			case 1:
				nPos[0] = oPos[0];
				nPos[1] = oPos[1] + n;
				break;
			case 2:
				nPos[0] = oPos[0] - n;
				nPos[1] = oPos[1];
				break;
			case 3:
				nPos[0] = oPos[0] + n;
				nPos[1] = oPos[1];
				break;
			}

			if (clear(map, nPos[0], nPos[1]) == (byte)1) {
				bomb(map, nPos);
			}
		}
	}

	private static byte clear(byte[][] map, int x, int y) {
		byte	ret = -1;

		if (0 <= y && y < map.length && 0 <= x && x < map[0].length) {
			ret       = map[y][x];
			map[y][x] = 0;
		}

		return ret;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}