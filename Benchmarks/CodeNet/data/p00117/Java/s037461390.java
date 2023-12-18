import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
 
public class Main {
	private static  BufferedReader	br  = null;
	private	static	int[][]			map = null;
	private	static	int				stp = 0;
	private	static	int				edp = 0;
	private	static	int				mon = 0;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parseParam();
		System.out.println(mon - dijkstra(stp, edp) - dijkstra(edp, stp));
	}

	private static int dijkstra(int start, int end) {
		int[]       cost = new int[map.length];
		boolean[]   used = new boolean[map.length];
 
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[start] = 0;
 
		while(true) {
			int cur = -1;
			for (int n = 0; n < map.length; n++) {
				if (!used[n] && (cur == -1 || cost[n] < cost[cur])) {
					cur = n;
				}
			}

			if (cur == -1) {
				break;
			}
			used[cur]  = true;

			for (int n = 0; n < map.length; n++) {
				if (map[cur][n] != -1) {
					int	cc = (cost[cur] == Integer.MAX_VALUE) ? cost[cur] : cost[cur] + map[cur][n];
					cost[n] = Math.min(cost[n], cc);
				}
			}
		}
 
		return cost[end];
	}
 
	private static void parseParam() {
		int	l = parseNum();

		if (l > 0) {
			int	p = parseNum();

			map = new int[l][l];
			for (int i = 0; i < l; i++) {
				Arrays.fill(map[i], -1);
			}

			while (p-- >= 0) {
				String		stdin = parseStdin();
				String[]	lines = stdin.split(",");
				int[]		datas = {
					Integer.parseInt(lines[0]),
					Integer.parseInt(lines[1]),
					Integer.parseInt(lines[2]),
					Integer.parseInt(lines[3]),
				};

				if (p >= 0) {
					map[datas[0]-1][datas[1]-1] = datas[2];
					map[datas[1]-1][datas[0]-1] = datas[3];
				} else {
					stp = datas[0] - 1;
					edp = datas[1] - 1;
					mon = datas[2] - datas[3];
				}
			}
		}
	}

    private static int parseNum() {
        int     num   = 0;
        String  strIn = null;
 
        if ((strIn = parseStdin()) != null) {
            num = Integer.parseInt(strIn);
        }
         
        return num;
    }
 
    private static String parseStdin() {
        String  strNum = null;
 
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