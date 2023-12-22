import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			String dot = sc.next();
			for (int j = 0; j < w; j++) {
				map[i][j] = dot.charAt(j);
			}
		}
		int result = 0;
		for (int i = 0; i < (1 << h); i++) {
			for (int j = 0; j < (1 << w); j++) {
				int count = 0;
				for (int l = 0; l < h; l++) {
					for (int m = 0; m < w; m++) {
						if ((((i >> l) & 1)== 1)) {
							continue;
						}
						if ((((j >> m) & 1)== 1)) {
							continue;
						}
						if (map[l][m] == '#') {
							count++;
						}
					}
				}
				if (count == k) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
