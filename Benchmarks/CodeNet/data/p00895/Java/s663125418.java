import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SorcerersDonut {
	Scanner in = new Scanner(System.in);
	int h, w;
	char[][] map;
	boolean[][] visited;
	int[] dirx = {-1, 0, 1, -1, 1, -1, 0, 1};
	int[] diry = {-1, -1, -1, 0, 0, 1, 1, 1};
	HashSet<String> hash;
	String ans;
	int x, y;
	
	public void run() {
		while (true) {
			h = in.nextInt();
			w = in.nextInt();
			if ((h|w) == 0) break;
			map = new char[h][w];
			hash = new HashSet<String>(0);
			ans = "";
			for (int i = 0; i < h; i++) {
				String s = in.next();
				for (int j = 0; j < w; j++) {
					map[i][j] = s.charAt(j);
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					for (int k = 0; k < 8; k++) {
						x = j; y = i;
						StringBuilder sb = new StringBuilder(map[y][x]);
						for ( ; ; ) {
							x = (x + dirx[k] + w) % w;
							y = (y + diry[k] + h) % h;
							sb.append(map[y][x]);
							if (hash.contains(sb.toString())) {
								if (sb.length() > ans.length() || (sb.length() == ans.length() && ans.compareTo(sb.toString()) > 0)) {
									ans = sb.toString();
								}
							} else if (sb.toString().length() >= Math.max(2, ans.length())) {
								hash.add(sb.toString());
							}
							if (x == j && y == i) break;
						}
						
					}
				}
			}
			
			if (ans.length() < 2)
				System.out.println(0);
			else
				System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new SorcerersDonut().run();
	}

}