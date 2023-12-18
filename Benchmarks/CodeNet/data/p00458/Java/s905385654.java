import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static boolean ok(int x, int y, int w, int h){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}
		return true;
	}
	
	public static int dps(int x, int y, int w, int h, boolean[][] map, boolean[][] visited){
		if(!ok(x, y, w, h) || !map[y][x] || visited[y][x]){
			return 0;
		}
		
		visited[y][x] = true;
		int max = 0;
		for(int[] move : move_dir){
			final int nx = x + move[0];
			final int ny = y + move[1];
			
			if(!ok(nx, ny, w, h)){
				continue;
			}else if(!map[ny][nx]){
				continue;
			}else if(visited[ny][nx]){
				continue;
			}
			
			max = Math.max(max, dps(nx, ny, w, h, map, visited));
		}
		visited[y][x] = false;
		
		return max + 1;
	}
	
	public static int check(int w, int h, boolean[][] map){
		int max = 0;
		
		boolean[][] visited = new boolean[h][w];
		for(int y = 0; y < h; y++){
			for(int x = 0; x < w; x++){
				if(!map[y][x]){
					continue;
				}
				
				max = Math.max(max, dps(x, y, w, h, map, visited));	
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int m = sc.nextInt();
			final int n = sc.nextInt();
			
			if(m == 0 && n == 0){
				break;
			}
			
			boolean[][] map = new boolean[n][m];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					map[i][j] = sc.nextInt() == 1;
				}
			}
			
			System.out.println(check(m, n, map));
		}
	}

}