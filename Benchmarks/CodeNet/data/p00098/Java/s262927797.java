import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[][]	map = null;
		long		max = Integer.MIN_VALUE;

		if ((map = parseMap()) != null) {
			for (int y = 1; y < map.length; y++) {
				for (int x = 1; x < map[y].length; x++) {
					for (int i = y; i < map.length; i++) {
						for (int j = x; j < map[y].length; j++) {
							max = Math.max(max, map[i][j] - map[y-1][j] - map[i][x-1] + map[y-1][x-1]);
						}
					}
				}
			}

			System.out.println(max);
		}
	}

	private static long[][] parseMap() {
		int			len = parseNum();
		long[][]	map = null;
		String		str = null;

		if (len > 0) {
			map = new long[len+1][len+1];

			for (int y = 1; y <= len; y++) {
				if ((str = parseStdin()) != null) {
					String[]	lines = str.split(" ");
					for (int x = 1; x <= lines.length; x++) {
						map[y][x] = map[y-1][x] + map[y][x-1] - map[y-1][x-1] + (long)Integer.parseInt(lines[x-1]);
					}
				}
			}
		}
 
		return map;
	}

	private static int parseNum() {
		int		param = 0;
		String	strin = null;

		if ((strin = parseStdin()) != null) {
			param = Integer.parseInt(strin);
		}
 
		return param;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) {
            		stdin = tmp;
            	}
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}