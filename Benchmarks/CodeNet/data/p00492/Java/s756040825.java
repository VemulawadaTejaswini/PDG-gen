import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static boolean is_ok(int x, int y, int H, int W){
		if(x < 0 || x >= W || y < 0 || y >= H){
			return false;
		}else{
			return true;
		}
	}
	
	public static int[][][] move_dir = new int[][][]{{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, -1}, {1, 1}}, {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {-1, 1}, {-1, -1}}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int W = sc.nextInt();
		final int H = sc.nextInt();
		
		boolean[][] is_wall = new boolean[H][W];
		boolean[][] visited = new boolean[H][W];
		
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				is_wall[i][j] = sc.nextInt() == 1;
			}
		}
		
		LinkedList<Integer> x_queue = new LinkedList<Integer>();
		LinkedList<Integer> y_queue = new LinkedList<Integer>();
		
		int wall_count = 0;
		
		if(is_wall[0][0]){
			wall_count += 3;
		}else{
			x_queue.add(0);
			y_queue.add(0);
			visited[0][0] = true;
		}
		
		if(is_wall[0][W-1]){
			wall_count += 4;
		}else{
			x_queue.add(0);
			y_queue.add(W-1);
			visited[0][W-1] = true;
		}
		
		if(is_wall[H-1][0]){
			wall_count += 4;
		}else{
			x_queue.add(0);
			y_queue.add(H-1);
			visited[H-1][0] = true;
		}
		
		if(is_wall[H-1][W-1]){
			wall_count += 3;
		}else{
			x_queue.add(W-1);
			y_queue.add(H-1);
			visited[H-1][W-1] = true;
		}
		
		for(int x = 1; x < W - 1; x++){
			if(is_wall[0][x]){
				wall_count += 2;
			}else{
				x_queue.add(x);
				y_queue.add(0);
				visited[0][x] = true;
			}
			
			if(is_wall[H-1][x]){
				wall_count += 2;
			}else{
				x_queue.add(x);
				y_queue.add(H-1);
				visited[H-1][x] = true;
			}
		}
		
		for(int y = 1; y < H - 1; y++){
			if(is_wall[y][0]){
				wall_count += y % 2 == 0 ? 1 : 3;
			}else{
				x_queue.add(0);
				y_queue.add(y);
				visited[y][0] = true;
			}
			
			if(is_wall[y][W-1]){
				wall_count += y % 2 == 0 ? 3 : 1;
			}else{
				x_queue.add(W-1);
				y_queue.add(y);
				visited[y][W-1] = true;
			}
		}
		
		//System.out.println(wall_count);
		
		while(!x_queue.isEmpty()){
			final int x = x_queue.poll();
			final int y = y_queue.poll();
			
			
			for(int[] move : move_dir[y % 2]){
				final int nx = x + move[0];
				final int ny = y + move[1];
				
				if(!is_ok(nx, ny, H, W)){
					continue;
				}else if(visited[ny][nx]){
					continue;
				}else if(is_wall[ny][nx]){
					wall_count++;
					//System.out.println((x + 1) + " " + (y + 1) + " " + (nx + 1) + " " + (ny + 1));
					continue;
				}
				
				x_queue.add(nx);
				y_queue.add(ny);
				visited[ny][nx] = true; 				
			}
		}
		
		System.out.println(wall_count);
	}

}