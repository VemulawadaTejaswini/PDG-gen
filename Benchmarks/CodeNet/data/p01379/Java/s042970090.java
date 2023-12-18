import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static final int MAX = 16;
	
	public static final int DIRS  = 4;
	public static final int LEFT  = 0;
	public static final int DOWN  = 1;
	public static final int UP    = 2;
	public static final int RIGHT = 3;
	
	public static final int[][] move_dir = new int[][]{{-1, 0}, {0, 1}, {0, -1}, {1, 0}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int h = sc.nextInt();
		final int w = sc.nextInt();
		
		boolean[][][][] is_visited = new boolean[h][w][DIRS][MAX];
		
		char[][] map = new char[h][];
		for(int i = 0; i < h; i++){
			map[i] = sc.next().toCharArray();
		}
		
		LinkedList<Integer> x_queue = new LinkedList<Integer>();
		LinkedList<Integer> y_queue = new LinkedList<Integer>();
		LinkedList<Integer> memory_queue = new LinkedList<Integer>();
		LinkedList<Integer> dir_queue = new LinkedList<Integer>();
		
		is_visited[0][0][0][RIGHT] = true;
		x_queue.add(0);
		y_queue.add(0);
		memory_queue.add(0);
		dir_queue.add(RIGHT);
		
		boolean flag = false;
		while(!dir_queue.isEmpty()){
			int x = x_queue.poll();
			int y = y_queue.poll();
			int memory = memory_queue.poll();
			int dir = dir_queue.poll();
			
			//System.out.println(x + " " + y + " " + memory  +"  " + dir);
			
			if(map[y][x] == '@'){
				flag = true;
				break;
			}
			
			if(map[y][x] == '^'){
				dir = UP;
			}else if(map[y][x] == 'v'){
				dir = DOWN;
			}else if(map[y][x] == '<'){
				dir = LEFT;
			}else if(map[y][x] == '>'){
				dir = RIGHT;
			}else if(map[y][x] == '_'){
				dir = memory == 0 ? RIGHT : LEFT;
			}else if(map[y][x] == '|'){
				dir = memory == 0 ? DOWN : UP;
			}else if('0' <= map[y][x] && map[y][x] <= '9'){
				memory = map[y][x] -  '0';
			}else if(map[y][x] == '+'){
				memory = (memory + 1) % MAX;
			}else if(map[y][x] == '-'){
				memory = (memory + MAX - 1) % MAX;
			}
			
			
			if(map[y][x] == '?'){
				for(int i = 0; i < DIRS; i++){
					final int nx = (x + move_dir[i][0] + w) % w;
					final int ny = (y + move_dir[i][1] + h) % h;
			
					if(!is_visited[ny][nx][i][memory]){
						is_visited[ny][nx][i][memory] = true;
						x_queue.add(nx);
						y_queue.add(ny);
						memory_queue.add(memory);
						dir_queue.add(i);
					}
				}
			}else{
				final int nx = (x + move_dir[dir][0] + w) % w;
				final int ny = (y + move_dir[dir][1] + h) % h;
			
				if(!is_visited[ny][nx][dir][memory]){
					is_visited[ny][nx][dir][memory] = true;
					x_queue.add(nx);
					y_queue.add(ny);
					memory_queue.add(memory);
					dir_queue.add(dir);
				}
			}
		}
		
		System.out.println(flag ? "YES" : "NO");

	}

}