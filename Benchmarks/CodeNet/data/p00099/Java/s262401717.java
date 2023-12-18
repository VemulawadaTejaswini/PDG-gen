import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private	static			BufferedReader	br      = null;
	private	static	final	int				MAP_ID  = 0;
	private	static	final	int				MAP_NUM = 1;
	private	static	final	int				MAP_MAX = 2;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	head = parseData();

		if (head != null) {
			if (head[0] > 0) {
				int		tl  = 1;
				int[][]	map = null;

				while (tl < head[0]) {
					tl*=2;
				}

				map = new int[MAP_MAX][tl*2+1];
				Arrays.fill(map[MAP_NUM], Integer.MIN_VALUE);

				for(int l = 0; l < map.length; l++) {
					map[MAP_ID][tl+l]  = l+1;
					map[MAP_NUM][tl+l] = 0;
				}

				for (int q = 0; q < head[1]; q++) {
					int[]	node = parseData();

					map[MAP_NUM][tl+node[0]-1] += node[1];
					updateTree((tl+node[0]-1)>>1, map);
					System.out.println(map[MAP_ID][1] + " " + map[MAP_NUM][1]);
				}
			}
		}
	}

	private static void updateTree(int i, int[][] map) {
		for (; i > 0; i = i>>1) {
			int	L = 2*i;
			int	R = 2*i+1;
			if(map[MAP_NUM][L]==map[MAP_NUM][R]){
				map[MAP_NUM][i] = map[MAP_NUM][L]; map[MAP_ID][i] = Math.min(map[MAP_ID][L], map[MAP_ID][R]);
			}
			else if(map[MAP_NUM][L] < map[MAP_NUM][R]){
				map[MAP_NUM][i] = map[MAP_NUM][R]; map[MAP_ID][i] = map[MAP_ID][R];
			}
			else{
				map[MAP_NUM][i] = map[MAP_NUM][L]; map[MAP_ID][i] = map[MAP_ID][L];
			}
		}
	}

	private static int[] parseData() {
		int[]	data = null;
		String	str  = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split(" ");

			if (lines.length > 0) {
				data = new int[lines.length];
				data[0] = Integer.parseInt(lines[0]);
				data[1] = Integer.parseInt(lines[1]);
			}
		}

		return data;
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