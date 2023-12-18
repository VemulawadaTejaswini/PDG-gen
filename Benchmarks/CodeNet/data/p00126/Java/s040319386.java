import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		int		cnt = parseCnt();
		int[][]	map = new int[9][9];
		int[]	chk = new int[9*9*2];

		for (int l = 0; l < cnt; l++) {
			parseMap(map, chk);

			if (l > 0) {
				System.out.println();
			}

			for (int i = 0; i < map.length; i++) {
				String	out = "";
				for (int j = 0; j < map[i].length; j++) {
					int	num = map[i][j];
					if (chk[i*9+num-1] > 1 || chk[81+j*9+num-1] > 1) {
						out += "*"+num;
					} else {
						out += " "+num;
					}
				}
				System.out.println(out);
			}
		}
	}

	private static void parseMap(int[][] map, int[] chk) {
		String	stdin = null;

		Arrays.fill(chk, 0);
		for (int i = 0; i < map.length; i++) {
			stdin = parseStdin().replaceAll(" ", "");
			for (int j = 0; j < map[i].length; j++) {
				int	num = stdin.charAt(j)-'0';
				map[i][j] = num;
				chk[i*9+num-1]++;
				chk[81+j*9+num-1]++;
			}
		}
	}

	private static int parseCnt() {
		int		cnt = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}