import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int a, b;
		while ((a = in.nextInt()) + (b = in.nextInt()) > 0) {
			int[][] point = new int[a + 1][b + 1];
			int n = in.nextInt();
			Set<Integer> koji = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				koji.add((x << 8) + y);
			}
			point[0][1] = 1;
			for (int x = 1; x <= a; x++) {
				for (int y = 1; y <= b; y++) {
					if (!koji.contains((x << 8) + y)) {
						point[x][y] = point[x][y - 1] + point[x - 1][y];
					} else {
					}
				}
			}
			System.out.println(point[a][b]);
		}
		in.close();
	}
}