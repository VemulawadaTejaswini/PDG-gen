import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


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
		MapLine[]	map = null;
		while((map = parseMap()) != null) {
			solve(map);
		}
	}

	private static MapLine[] parseMap() {
		MapLine[]	map = null;
		int			len = parseLen();
	
		if (len > 0) {
			map = new MapLine[len];
			for (int y = 0; y < len; y++) {
				String	strin = null;
		        if ((strin = parseStdin()) != null) {
		        	map[y]   = new MapLine();
		        	map[y].d = new MapDot[len];
		        	for (int x = 0; x < strin.length(); x++) {
		        		char	c = strin.charAt(x);

		        		map[y].d[x]   = new MapDot();
		        		map[y].d[x].s = (c == (char)'.') ? 1 : 0;

		        		if (x > 0 && c == (char)'.' && map[y].d[x-1].s == 1) {
		        			map[y].d[x].w = map[y].d[x-1].w;
		        			map[y].d[x].w[0]++;
		        		} else {
		        			map[y].d[x].w    = new int[2];
		        			if (c == (char)'.') {
		        				map[y].d[x].w[0] = 1;
		        			} else {
		        				map[y].s.push(x);
		        			}
	        				map[y].d[x].w[1] = x;
		        		}

		        		if (y > 0 && c == (char)'.' && map[y-1].d[x].s == 1) {
		        			map[y].d[x].h = map[y-1].d[x].h;
		        			map[y].d[x].h[0]++;
		        		} else {
		        			map[y].d[x].h    = new int[2];
		        			map[y].d[x].h[0] = (c == (char)'.') ? 1 : 0;
	        				map[y].d[x].h[1] = y;
		        		}
		        	}
		        }
			}
		}

		return map;
	}

	private static void solve(MapLine[] map) {
		int	sqrlen = 0;

		if (map != null) {
			for (int y = 0; y + sqrlen < map.length; y++) {
	        	for (int x = 0; x + sqrlen < map.length; x++) {
	        		if (map[y].d[x].s == 1) {
	        			int	w   = map[y].d[x].w[0] - (x - map[y].d[x].w[1]);
	        			int	h   = map[y].d[x].h[0] - (y - map[y].d[x].h[1]);
		        		int tmp = Math.min(w,h);

		        		if (y + tmp - 1 < map.length && x + tmp - 1 < map.length) {
		        			int	fb = -1;
			        		for(int l = 0; l < tmp && fb == -1; l++) {
			        			fb = map[y+l].getFirstBlock(x, x + tmp - 1);
			        		}
			        		if (fb == -1) {
			        			if (sqrlen < tmp) {
			        				sqrlen = tmp;
			        			}
			        		}
		        		}
	        		}
		        }
			}
		}

		System.out.println(sqrlen);
	}

	private static int parseLen() {
		int		params = 0;
        String	strin  = null;

        if ((strin = parseStdin()) != null) {
        	params = Integer.parseInt(strin);
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

class MapDot{
	public	int		s;
	public	int[]	w;
	public	int[]	h;

	public	MapDot() {
		s = 0;
		w = null;
		h = null;
	}
}

class MapLine {
	public	MapDot[]		d;
	public	Stack<Integer>	s;

	public	MapLine() {
		d = null;
		s = new Stack<Integer>();
	}

	public	int	getFirstBlock(int head, int tail) {
		int block = -1;

		for (int l = 0; l < s.size(); l++) {
			int	b = s.get(l);
			if (b > tail) {
				break;
			} if (head <= b && b <= tail) {
				block = b;
				break;
			}
		}

		return block;
	}
}