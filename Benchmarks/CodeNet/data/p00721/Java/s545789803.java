import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static final int WIDTH = 20;
	public static final int HEIGHT = 20;
	public static final int MAX_BIT = (1 << 10) - 1;
	
	public static final int[][] move_dir = new int[][]{{1, 0}, {-1, 0},{0, 1}, {0, -1}};
	public static boolean is_ok(int x, int y, int w, int h){
		return 0 <= x && x < w && 0 <= y && y < h;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		boolean[][] is_wall = new boolean[HEIGHT][WIDTH];
		int[][] is_dirty = new int[HEIGHT][WIDTH];
		boolean[][][] visited = new boolean[HEIGHT][WIDTH][MAX_BIT];
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
					
			if(w == 0 && h == 0){
				break;
			}
		
			int start_x = -1;
			int start_y = -1;
			int dirty_id = 0;
			
			for(int i = 0; i < h; i++){
				char[] input = sc.next().toCharArray();
				
				//System.out.println(Arrays.toString(input));
				
				for(int j = 0; j < w; j++){
					final char in = input[j];
					
					for(int k = 0; k < MAX_BIT; k++){
						visited[i][j][k] = false;
					}
					
					if(in == '.'){
						is_wall[i][j] = false;
						is_dirty[i][j] = -1;
					}else if(in == '*'){
						is_wall[i][j] = false;
						is_dirty[i][j] = dirty_id;
						dirty_id++;
					}else if(in == 'x'){
						is_wall[i][j] = true;
						is_dirty[i][j] = -1;
					}else if(in == 'o'){
						is_wall[i][j] = false;
						is_dirty[i][j] = -1;
						start_x = j;
						start_y = i;
					}
				}
			}
			
			final int all_dirty = (1 << dirty_id) - 1;
			
			LinkedList<Integer> x_queue = new LinkedList<Integer>();
			LinkedList<Integer> y_queue = new LinkedList<Integer>();
			LinkedList<Integer> time_queue = new LinkedList<Integer>();
			LinkedList<Integer> dirty_queue = new LinkedList<Integer>();
			x_queue.add(start_x);
			y_queue.add(start_y);
			time_queue.add(0);
			dirty_queue.add(0);
			visited[start_y][start_x][0] = true;
			
			boolean flag = false;
			while(!time_queue.isEmpty()){
				final int x = x_queue.poll();
				final int y = y_queue.poll();
				final int time = time_queue.poll();
				final int dirty_bit = dirty_queue.poll();
				
				if(dirty_bit == all_dirty){
					flag = true;
					System.out.println(time);
					break;
				}
				
				for(int[] move : move_dir){
					final int nx = x + move[0];
					final int ny = y + move[1];
					final int ntime = time + 1;
					
					if(!is_ok(nx, ny, w, h)){
						continue;
					}else if(is_wall[ny][nx]){
						continue;
					}
					//System.out.println(nx + " " + ny);
					int next_dirty = dirty_bit;
					if(is_dirty[ny][nx] >= 0){
						next_dirty |= 1 << is_dirty[ny][nx];
					}
					
					if(visited[ny][nx][next_dirty]){
						continue;
					}
					visited[ny][nx][next_dirty] = true;
					
					x_queue.add(nx);
					y_queue.add(ny);
					time_queue.add(ntime);
					dirty_queue.add(next_dirty);
				}
			}
			
			if(!flag){
				System.out.println("-1");
			}
		}
	}
	
}