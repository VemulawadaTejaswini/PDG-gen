import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static final int MAX_HP = 6;
	public static final int MAX = 8;
		
	public static final int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static boolean is_ok(int x, int y, int h, int w){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}else{
			return true;
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		boolean[][] can_enter = new boolean[MAX][MAX];
		boolean[][] on_food = new boolean[MAX][MAX];
		boolean[][][] visited = new boolean[MAX][MAX][MAX_HP + 1];
		
		while (true) {
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int sx = -1, sy = -1, gx = -1, gy = -1;
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					final int num = sc.nextInt();
					
					can_enter[i][j] = num != 0;
					
					if(num == 2){
						sx = j;
						sy = i;
					}else if(num == 3){
						gx = j;
						gy = i;
					}
					
					on_food[i][j] = num == 4;
					
					for(int k = 0; k <= MAX_HP; k++){
						visited[i][j][k] = false;
					}
				}
			}
			
			LinkedList<Integer> x_queue = new LinkedList<Integer>();
			LinkedList<Integer> y_queue = new LinkedList<Integer>();
			LinkedList<Integer> hp_queue = new LinkedList<Integer>();
			LinkedList<Integer> t_queue = new LinkedList<Integer>();
			
			x_queue.add(sx);
			y_queue.add(sy);
			hp_queue.add(MAX_HP);
			t_queue.add(0);
			visited[sy][sx][MAX_HP] = true;
			
			boolean flag = false;
			while(!x_queue.isEmpty()){
				final int x = x_queue.poll();
				final int y = y_queue.poll();
				final int hp = hp_queue.poll();
				final int time = t_queue.poll();
				
				if(hp <= 0){
					continue;
				}
				
				if(gx == x && gy == y){
					System.out.println(time);
					flag = true;
					break;
				}
				
				//System.out.println(x + " " + y + " " + hp + " " + time);
		
				final int next_hp = on_food[y][x] ? MAX_HP - 1 : hp - 1;
				
				if(next_hp <= 0){
					continue;
				}
				
				for(int[] move : move_dir){
					final int nx = x + move[0];
					final int ny = y + move[1];
					
					if(!is_ok(nx, ny, h, w)){
						continue;
					}else if(!can_enter[ny][nx]){
						continue;
					}else if(visited[ny][nx][next_hp]){
						continue;
					}
					
					visited[ny][nx][next_hp] = true;
					x_queue.add(nx);
					y_queue.add(ny);
					hp_queue.add(next_hp);
					t_queue.add(time + 1);
				}
			}
			
			if(!flag){
				System.out.println(-1);
			}
		}
	}

}