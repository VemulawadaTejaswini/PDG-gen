import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0067
public class Main {
	static Scanner sc = new Scanner(System.in);
	static boolean[][] iv = new boolean[12][12];
	static char[][] cs = new char[12][12];
	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.next();
			if (s.equals("")) continue;
			
			cs[0] = s.toCharArray();
			for (int i = 1; i < 12; i++) 
				cs[i] = sc.next().toCharArray();
			
			int res = 0;
			for (int i = 0; i < 12; i++) fill(iv[i], false);
			for (int i = 0; i < 12; i++) 
				for (int j = 0; j < 12; j++) 
					if (!iv[i][j] && cs[i][j] == '1') {
						bfs(j, i);
						res++;
					}

			System.out.println(res);
		}
	}
	
	static int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
	static void bfs(int x, int y) {
		if (x < 0 || x >= 12 || y < 0 || y >= 12 || iv[y][x] || cs[y][x] == '0') return;
		iv[y][x] = true;
		for (int k = 0; k < 4; k++) bfs(x + dx[k], y + dy[k]);
	}
}