
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	
	public static final int MAX = 20;
	
	public static boolean is_ok(int x, int y, int H, int W){
		if(x < 0 || y < 0 || x >= W || y >= H){
			return false;
		}else{
			return true;
		}
	}
	
	public static final int[][] move_dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		boolean[][] can_enter = new boolean[MAX][MAX];
		boolean[][] visited = new boolean[MAX][MAX];
		
		while(true){
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			
			int s_x = -1, s_y = -1;
			
			for(int i = 0; i < H; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < W; j++){
					if(input[j] == '#'){
						can_enter[i][j] = false;
					}else{
						can_enter[i][j] = true;
					}
					
					if(input[j] == '@'){
						s_x = j;
						s_y = i;
					}
					
					visited[i][j] = false;
				}
			}
			
			LinkedList<Integer> x_queue = new LinkedList<Integer>();
			LinkedList<Integer> y_queue = new LinkedList<Integer>();
			visited[s_y][s_x] = true;
			x_queue.add(s_x);
			y_queue.add(s_y);
			
			int count = 0;
			while(!x_queue.isEmpty()){
				final int x = x_queue.poll();
				final int y = y_queue.poll();
				
				count++;
				
				for(int[] move : move_dir){
					final int nx = x + move[0];
					final int ny = y + move[1];
					
					if(!is_ok(nx, ny, H, W)){
						continue;
					}else if(!can_enter[ny][nx]){
						continue;
					}else if(visited[ny][nx]){
						continue;
					}
					
					visited[ny][nx] = true;
					x_queue.add(nx);
					y_queue.add(ny);
				}
			}
			
			System.out.println(count);
		}
		
	}
}