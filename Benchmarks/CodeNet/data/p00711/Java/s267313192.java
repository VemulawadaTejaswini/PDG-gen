import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			if (W == 0 && H == 0) {
				break;
			}
			
			char[][] tile = new char[W][H];
			boolean[][] visited = new boolean[W][H];
			
			int sx = 0;
			int sy = 0;
			for(int i = 0; i < H; i++) {
				String line = sc.next();
				for(int j = 0; j < W; j++) {
					tile[j][i] = line.charAt(j);
					
					if(tile[j][i] == '@') {
						sx = j;
						sy = i;
					}
				}
			}
			LinkedList<XY> queue = new LinkedList<XY>();
			
			// init 
			int count = 0;
			queue.offer(new XY(sx, sy));
			
			while(queue.size() > 0) {
				bfs(W, H, queue, tile, visited);
				count++;
			}
			System.out.println(count);
		}
	}
	
	public static void bfs(int W, int H, LinkedList<XY> queue, char[][] tile, boolean[][] visited) {
		XY current = queue.poll();
		int cx = current.x;
		int cy = current.y;
		
		int[] dx = new int[]{0, 1, 0, -1};
		int[] dy = new int[]{1, 0, -1, 0};
		for(int i = 0; i < dx.length; i++) {
			int x = cx + dx[i];
			int y = cy + dy[i];
			if (x >= 0 && x < W && y >= 0 && y < H && !visited[x][y] && tile[x][y] == '.') {
				queue.offer(new XY(x, y));
				visited[x][y] = true;
			}
		}
	}
}

class XY {
	int x;
	int y;
	XY(int x, int y) { 
		this.x = x;
		this.y = y;
	}
}