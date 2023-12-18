import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Main {
	private	static			BufferedReader	br = null;
	private	static	final	int				DN = 0;
	private	static	final	int				DR = 1;
	private	static	final	int				DK = 2;
	private	static	final	int				DM = 3;
	private	static	final	int[]			SV = { 1, -1, 0, 0  };
	private	static	final	int[]			SH = { 0, 0,  1, -1 };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] map = null;
		Task	tsk = new Task();

		while((map = parseMap()) != null) {
			int	cnt = 0;

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					int	dst = map[i][j];
					if (dst != DN) {
						int[]	tmp = { i, j };
						tsk.add(tmp);
						while (!tsk.isEmpty()) {
							visit(map, tsk, dst);
						}
						cnt++;
					}
                }
            }

			System.out.println(cnt);
		}
	}

	public static void visit(int[][] map, Task tsk, int dst) {
		int[]	tmp = tsk.remove(0);

		if (map[tmp[0]][tmp[1]] == dst) {
			map[tmp[0]][tmp[1]] = DN;

			// next choices
			for (int i = 0; i < 4; i++) {
				int	y = tmp[0] +  SV[i];
				int	x = tmp[1] +  SH[i];

				if (0 <= y && y < map.length && 0 <= x && x < map[0].length) {
					if (map[y][x] == dst) {
						int[]	src = { y, x };
						tsk.add(src);
					}
				}
			}
		}
	}

	private static int[][] parseMap() {
		int[][]	map = null;
		int[]	len = parseLen();

		if (len != null) {
			map = new int[len[0]][len[1]];

			for (int y = 0; y < len[0]; y++) {
				String	strin = null;
				if ((strin = parseStdin()) != null) {
					for (int x = len[1]-1; x >= 0; x--) {
						switch(strin.charAt(x)) {
						case	'@':
							map[y][x] = DR;
							break;
						case	'#':
							map[y][x] = DK;
							break;
						case	'*':
							map[y][x] = DM;
							break;
						}
					}
				}
			}
		}

		return map;
	}

	private static int[] parseLen() {
		int[]	params = null;
		String	stdin  = null;

		if ((stdin = parseStdin()) != null) {
			if (!stdin.equals("0 0")) {
				String[]	lines = stdin.split(" ");

				params    = new int[2]; 
				params[0] = Integer.parseInt(lines[0]);
				params[1] = Integer.parseInt(lines[1]);
			}
		}

		return params;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (!tmp.isEmpty()) stdin = tmp;
		}
		catch (IOException e) {}

		return stdin;
	}
}

class Task extends ArrayList<int[]> {
}