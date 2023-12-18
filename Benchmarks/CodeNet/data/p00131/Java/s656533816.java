import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
  
public class Main {
	private static			BufferedReader	br = null;
	private static			Cmp				cr = null;
	private	static	final	int[]			SV = {  0, -1,  0,  1, 0 };
	private	static	final	int[]			SH = { -1,  0,  1,  0, 0 };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		cr = new Cmp();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map[]	map = new Map[100];
		int		cnt = 0;

		initMap(map);
		Arrays.sort(map, cr);
		solveMap(map);

		cnt = parseCnt();
		while (cnt-- > 0) {
			long[]	ans = new long[2];

			for (int i = 0; i < 10; i++) {
				String	line = parseStdin().replaceAll(" ", "");
				for (int j = 0; j < 10; j++) {
					if (line.charAt(j) == '1') {
						ans[0] ^= map[i*10+j].b[0];
						ans[1] ^= map[i*10+j].b[1];
					}
				}
			}

			dumpAns(ans);
		}
	}

	private static void dumpAns(long ans[]) {
		for (int i = 0; i < 10; i++) {
			String sz = "";
			for (int j = 0; j < 10; j++) {
				int	k = (i*10+j);
				int	y = k/50;
				int	x = k%50;
				int	n = ((ans[y] & (1L<<(49-x))) != 0L) ? 1 : 0;
				sz += (j == 0) ? ""+n : " "+n;
			}
			System.out.println(sz);
		}
	}

	private static void initMap(Map map[]) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int	y = (i*10+j);
				int	x = y/50;
				int	r = y%50;
				map[y] = new Map();
				map[y].b[x] |= 1L << (49-r);
				for (int k = 0; k < SV.length; k++) {
					int	ni  = i + SV[k];
					int	nj  = j + SH[k];
					if (0 <= ni && ni < 10 && 0 <= nj && nj < 10) {
						int	ny = (ni*10+nj);
						int	nx = ny/50;
						int	nr = ny%50;
						map[y].b[2+nx] |= 1L << (49-nr);
					}
				}
			}
		}
	}
 
	private static void solveMap(Map map[]) {
		for (int i = 0; i < map.length; i++) {
			int	x = i/50;
			int	r = i%50;
			for (int j = i+1; j < map.length; j++) {
				if ((map[j].b[2+x] & (1L<<(49-r))) != 0L) {
					map[j].b[0] ^= map[i].b[0];
					map[j].b[1] ^= map[i].b[1];
					map[j].b[2] ^= map[i].b[2];
					map[j].b[3] ^= map[i].b[3];
				}
			}
			Arrays.sort(map, i+1, map.length, cr);
		}

		for (int i = 99; i >= 0; i--) {
			int	x = i/50;
			int	r = i%50;
			for (int j = i-1; j >= 0; j--) {
				if ((map[j].b[2+x] & (1L<<(49-r))) != 0L) {
					map[j].b[0] ^= map[i].b[0];
					map[j].b[1] ^= map[i].b[1];
					map[j].b[2] ^= map[i].b[2];
					map[j].b[3] ^= map[i].b[3];
				}
			}
		}
	}
 
	private static int parseCnt() {
		int     cnt = 0;
		String  str = null;

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

class Map {
	public	long[]	b = new long[4];
}

class Cmp implements Comparator<Map> {
	public int compare(Map it1, Map it2) {
		int	ret = (it2.b[2] == it1.b[2]) ? 0 : (it2.b[2] > it1.b[2]) ? 1 : -1;

		if (ret == 0) {
			ret = (it2.b[3] == it1.b[3]) ? 0 : (it2.b[3] > it1.b[3]) ? 1 : -1;
		}

		return ret;
	}
}