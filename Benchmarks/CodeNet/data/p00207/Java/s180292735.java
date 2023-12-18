import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static class Walk{
		int x,y;
		
		public Walk(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int[][] map = new int[h][w];
			
			final int sx = sc.nextInt() - 1;
			final int sy = sc.nextInt() - 1;
			
			final int gx = sc.nextInt() - 1;
			final int gy = sc.nextInt() - 1;
			
			final int n = sc.nextInt();
			
			for(int i = 0; i < n; i++){
				final int color = sc.nextInt();
				final int d = sc.nextInt();
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				
				for(int j = 0; j < (d == 0 ? 2 : 4); j++){
					for(int k = 0; k < (d == 0 ? 4 : 2); k++){
						map[y + j][x + k] = color;
					}
				}
			}
			
//			for(int j = 0; j < h; j++){
//				for(int k = 0; k < w; k++){
//					System.out.print(map[j][k] + " ");
//				}
//				System.out.println();
//			}
			
			boolean[][] is_visited = new boolean[h][w];
			LinkedList<Walk> queue = new LinkedList<Walk>();
			//int color = map[sy][sx];
			
			if(map[sy][sx] != map[gy][gx]){
				System.out.println("NG");
				continue;
			}
			
			queue.add(new Walk(sx,sy));
			while(!queue.isEmpty()){
				Walk k = queue.poll();
				
				if(is_visited[k.y][k.x]){
					continue;
				}else if(k.x == gx && k.y == gy){
					is_visited[k.y][k.x] = true;
					break;
				}else{
					is_visited[k.y][k.x] = true;
				}
				
				if(k.x != 0 && !is_visited[k.y][k.x - 1] && map[k.y][k.x] == map[k.y][k.x - 1]){
					queue.add(new Walk(k.x - 1, k.y));
				}
				
				if(k.x != w - 1 && !is_visited[k.y][k.x + 1] && map[k.y][k.x] == map[k.y][k.x + 1]){
					queue.add(new Walk(k.x + 1, k.y));
				}
				
				if(k.y != 0 && !is_visited[k.y - 1][k.x] && map[k.y][k.x] == map[k.y - 1][k.x]){
					queue.add(new Walk(k.x, k.y - 1));
				}
				
				if(k.y != h - 1 && !is_visited[k.y + 1][k.x] && map[k.y][k.x] == map[k.y + 1][k.x]){
					queue.add(new Walk(k.x, k.y + 1));
				}
			}
		
			if(is_visited[gy][gx]){
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}

	}

}