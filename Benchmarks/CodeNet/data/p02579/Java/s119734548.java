import java.util.*;

class main {
	
	int[] dx = {0, 0, 1, -1, -2, -2, -2, -2, -2, 2, 2, 2, 2, 2};
	int[] dy = {1, -1, 0, 0, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2};
	int flag = 0;
	int min = Integer.MAX_VALUE;
	
	void dfs(int i, int j, int[][] visited, int di, int dj, char[][] arr, int h, int w, int ct) {
		if (visited[i][j] == 1) return;
		if (i==di && j==dj) {
			flag=1;
			//System.out.println("Ct : " + di + " " + dj);
			if (ct < min) {
				min = ct;
			}
			visited[i][j] = 1;
			return;
		}
		visited[i][j] = 1;
		
		for (int k=0;k<14;k++) {
			int newi = i + dx[k]; 
			int newj = j + dy[k];
			if (newi>=0 && newj>=0 && newi<h && newj<w && visited[newi][newj]==0 && arr[newi][newj] == '.') {
				if (newi==-2 || newi==2 || newj==-2 || newj==2) {
					dfs(newi, newj, visited, di, dj, arr, h, w, ct+1);
				} else {
					dfs(newi, newj, visited, di, dj, arr, h, w, ct);
				}
			}
		}
		visited[i][j] = 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 main c = new main();
	
		int h,w;
		int ch,cw;
		int dh, dw;
		h = sc.nextInt();
		w = sc.nextInt();
		ch = sc.nextInt();
		cw = sc.nextInt();
		dh = sc.nextInt();
		dw = sc.nextInt();
		ch--;
		cw--;
		dh--;
		dw--;
		
		char[][] arr = new char[h][w];
		for (int i=0;i<h;i++) {
				String str = sc.next();
				arr[i] = str.toCharArray();
		}
		
		if (arr[ch][cw] == '#' || arr[dh][dw] == '#') {
			System.out.println("-1");
		} else {
			int[][] visited = new int[h][w];
			c.dfs(ch, cw, visited, dh, dw, arr, h, w, 0);
			if (c.flag == 0) {
				System.out.println(-1);	
			} else {
				System.out.println(c.min);
			}
		}
	}
}
