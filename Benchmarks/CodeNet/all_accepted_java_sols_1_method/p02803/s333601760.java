import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] S = new char[H][W];
		for(int i = 0; i < H; i++)
			S[i] = sc.next().toCharArray();
		int ans = 0;
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i][j] == '#')
					continue;
				Queue<Integer> q = new ArrayDeque<>();
				q.add(i);
				q.add(j);
				boolean[][] used = new boolean[H][W];
				int[][] dist = new int[H][W];
				int max = 0;
				while(!q.isEmpty()) {
					int x = q.poll();
					int y = q.poll();
					if(used[x][y])
						continue;
					used[x][y] = true;
					for(int k = 0; k < 4; k++) {
						int xx = x + dx[k];
						int yy = y + dy[k];
						if(xx >= H || xx < 0 || yy >= W || yy < 0)
							continue;
						if(S[xx][yy]  == '#' || used[xx][yy])
							continue;
						q.add(xx);
						q.add(yy);
						dist[xx][yy] = dist[x][y] + 1;
						max = Math.max(dist[xx][yy], max);
					}
				}
				ans = Math.max(ans, max);
			}
		}
		System.out.println(ans);

	}

}
