import static java.util.Arrays.deepToString;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	final int INF = 100101001;
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int C = sc.nextInt();
			int R = sc.nextInt();
			if (R == 0) break;
			char[][] table = new char[R][C];
			for (int i = 0; i < R; i++) table[i] = sc.next().toCharArray();
			int[][] best = new int[R][C];
			for (int i = 0; i < R; i++) for (int j = 0; j < C; j++) best[i][j] = INF;
			ArrayDeque<Integer> q = new ArrayDeque<Integer>();
			for (int i = 0; i < R; i++) for (int j = 0; j < C; j++) {
				if (i == 0 || j == 0 || i == R - 1 || j == C - 1) {
					best[i][j] = 0;
					q.add(i);
					q.add(j);
				}
			}
			
			int[] dr = {0, -1, 0, 1};
			int[] dc = {1, 0, -1, 0};
			while (!q.isEmpty()) {
				int r = q.pollFirst();
				int c = q.pollFirst();
				if (table[r][c] == '&') {
					System.out.println(best[r][c]);
					break;
				}
				
				for (int i = 0; i < 4; i++) {
					int nr = r + dr[i];
					int nc = c + dc[i];
					if (0 <= nr && nr < R && 0 <= nc && nc < C) {
						boolean heavy = (table[r][c] == '#' && table[nr][nc] == '.');
						int ncost = best[r][c] + (heavy ? 1 : 0);
						if (best[nr][nc] > ncost) {
							best[nr][nc] = ncost;
							if (heavy) {
								q.add(nr);
								q.add(nc);
							} else {
								q.addFirst(nc);
								q.addFirst(nr);
							}
						}
						
						
					}
				}
			}
			
			
		}
	}
}