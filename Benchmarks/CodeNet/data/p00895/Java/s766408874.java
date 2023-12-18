import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if ((h | w) == 0)
				break;
			String[] field = new String[h];
//			char[][] field = new char[h][w];
			for (int i = 0; i < h; i++) {
				field[i] = sc.next();
//				for (int j = 0; j < w; j++)
//					field[i][j] = s.charAt(j);
			}
			String result = "";
			Set<String> set = new HashSet<String>(0);
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					String s = "";
					int[] dx = { 1, 1, 0, -1, -1, -1, 0, 1 };
					int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };
					int px = j;
					int py = i;
					for (int k = 0; k < 8; k++) {
						s = "";
						do {
							s += field[py].charAt(px);
							px = (px + dx[k] + w) % w;
							py = (py + dy[k] + h) % h;
							if (s.length() >= Math.max(2, result.length())
									&& !set.add(s)
									&& (result.length() < s.length() || (result
											.length() == s.length() && result
											.compareTo(s) > 0))) {
								result = s;
							}
						} while (!(px == j && py == i));
					}
				}
			if (result.length() < 2)
				System.out.println(0);
			else
				System.out.println(result);
		}
		sc.close();
	}
}