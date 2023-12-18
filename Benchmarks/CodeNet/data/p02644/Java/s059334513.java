import java.util.*;

public class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int x1 = sc.nextInt()-1;
		int y1 = sc.nextInt()-1;
		int x2 = sc.nextInt()-1;
		int y2 = sc.nextInt()-1;
		char[][] arr = new char[h][w];
		int[][] dp = new int[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(x1*w+y1);
		dp[x1][y1] = 1;
		while (!q.isEmpty()) {
			int x = q.poll();
			int a = x/w;
			int b = x%w;
			for (int i = 0; i < 4; i++) {
				for (int j = 1; j <= k; j++) {
					if (a+j*dx[i] < 0 || a+j*dx[i] >= h || b+j*dy[i] < 0 || b+j*dy[i] >= w || arr[a+j*dx[i]][b+j*dy[i]] == '@') {
						break;
					}
					if (dp[a+j*dx[i]][b+j*dy[i]] == 0) {
						dp[a+j*dx[i]][b+j*dy[i]] = dp[a][b]+1;
						q.add(w*(a+j*dx[i])+b+j*dy[i]);
					}
				}
			}
		}
		System.out.println(dp[x2][y2]-1);
	}

}
