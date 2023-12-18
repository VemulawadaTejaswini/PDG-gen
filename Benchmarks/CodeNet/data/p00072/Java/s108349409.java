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
		int	point = 0;
		String	a = null;
		String	b = "";

		while ((a = parseStdin()) != null) {
			b += a;
		}
		Integer.parseInt(b);

		while ((point = parseNum()) != 0) {
			int[][]	map     = new int[point][point];
			int		route   = parseNum();
			int		lantern = 0;
			for (int i = 0; i < point; i++) {
				for (int j = 0; j < point; j++) {
					map[i][j] = -1;
				}
			}

			for (int n = 0; n < route; n++) {
				int[]	dist = parseDist();
				map[dist[0]][dist[1]] = dist[2];
				map[dist[1]][dist[0]] = dist[2];
			}

			for (int n = 0; n < point; n++) {
				int	tmp = solve(1 << n, n, map);
				lantern = (lantern == 0) ? tmp : Math.min(tmp, lantern);
			}
			System.out.println(lantern);
		}
	}

	private static int solve(int cbit, int start, int[][] map) {
		int		fbit    = 0;
		int		lantern = 0;
		int		rest    = 0;
		boolean	comp    = true;

		for (int n = 0; n < map.length; n++) {
			if ((cbit & 1 << n) == 0) {
				if (map[start][n] != -1) {
					fbit |= 1 << n;
					lantern += map[start][n];
				}
				else {
					comp = false;
				}
			}
		}

		if (!comp) {
			for (int n = 0; n < map.length; n++) {
				if (map[start][n] != -1 && (fbit & 1 << n) != 0) {
					int	tmp = solve(cbit | fbit, n, map);
					if (tmp != 0) {
						rest = (rest == 0) ? tmp : Math.min(tmp, rest);
					}
				}
			}
		}

		return lantern + rest;
	}

	private static int[] parseDist() {
		int[]	dist  = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	split = strIn.split(",");
			dist    = new int[3];
			dist[0] = Integer.parseInt(split[0]); 
			dist[1] = Integer.parseInt(split[1]); 
			dist[2] = Integer.parseInt(split[2]) / 100 - 1; 
		}
		
		return dist;
	}

	private static int parseNum() {
		int		num   = 0;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			num = Integer.parseInt(strIn); 
		}
		
		return num;
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