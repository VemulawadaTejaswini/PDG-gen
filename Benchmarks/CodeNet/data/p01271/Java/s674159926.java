import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int[][] move_dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static final int MAX = 50;
	
	public static boolean is_ok(int x, int y, int h, int w){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}else{
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[][][][] is_visited = new boolean[MAX][MAX][MAX][MAX];
		boolean[][][] can_enter = new boolean[2][MAX][MAX];
		int[][] start_pos = new int[2][2];
		int[][] goal_pos  = new int[2][2];
		
		while(true){
			final int W = sc.nextInt();
			final int H = sc.nextInt();
			
			if(W == 0 && H == 0){
				break;
			}
			System.gc();
			
			for(int i = 0; i < H; i++){
				for(int type = 0; type < 2; type++){
					char[] input = sc.next().toCharArray();
					for(int j = 0; j < W; j++){
						if(input[j] == '#'){
							can_enter[type][i][j] = false;
						}else{
							can_enter[type][i][j] = true;
							
							if(input[j] == '%'){
								goal_pos[type][0] = j;
								goal_pos[type][1] = i;
							}else if(input[j] == 'L' || input[j] == 'R'){
								start_pos[type][0] = j;
								start_pos[type][1] = i;
							}
						}
					}
				}
			}
			
			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					for(int k = 0; k < H; k++){
						for(int l = 0; l < W; l++){
							is_visited[i][j][k][l] = false;
						}
					}
				}
			}
			
			LinkedList<Integer> len_x_queue = new LinkedList<Integer>();
			LinkedList<Integer> len_y_queue = new LinkedList<Integer>();
			LinkedList<Integer> rin_x_queue = new LinkedList<Integer>();
			LinkedList<Integer> rin_y_queue = new LinkedList<Integer>();
			//LinkedList<Integer> time_queue  = new LinkedList<Integer>();
			len_x_queue.add(start_pos[0][0]);
			len_y_queue.add(start_pos[0][1]);
			rin_x_queue.add(start_pos[1][0]);
			rin_y_queue.add(start_pos[1][1]);
			//time_queue.add(0);
			is_visited[start_pos[0][1]][start_pos[0][0]][start_pos[1][1]][start_pos[1][0]] = true;
			
			boolean found = false;
			while(!len_x_queue.isEmpty()){
				final int len_x = len_x_queue.poll();
				final int len_y = len_y_queue.poll();
				final int rin_x = rin_x_queue.poll();
				final int rin_y = rin_y_queue.poll();
				//final int time  = time_queue.poll();
				
				//System.out.println(len_x + " " + len_y + " " + rin_x + " " + rin_y);
				
				if(goal_pos[0][0] == len_x && goal_pos[0][1] == len_y
						&& goal_pos[1][0] == rin_x && goal_pos[1][1] == rin_y){
					System.out.println("Yes");
					found = true;
					break;
				}else if(goal_pos[0][0] == len_x && goal_pos[0][1] == len_y){
					continue;
				}else if(goal_pos[1][0] == rin_x && goal_pos[1][1] == rin_y){
					continue;
				}
				
				for(int[] move : move_dir){
					int n_len_x = len_x + move[0];
					int n_len_y = len_y + move[1];
					int n_rin_x = rin_x - move[0];
					int n_rin_y = rin_y + move[1];
					
					if(!is_ok(n_len_x, n_len_y, H, W) || !can_enter[0][n_len_y][n_len_x]){
						n_len_x = len_x;
						n_len_y = len_y;
					}
					
					if(!is_ok(n_rin_x, n_rin_y, H, W) || !can_enter[1][n_rin_y][n_rin_x]){
						n_rin_x = rin_x;
						n_rin_y = rin_y;
					}
					//System.out.println(n_len_x + " " + n_len_y + " " + n_rin_x + " " + n_rin_y);
					if(is_visited[n_len_y][n_len_x][n_rin_y][n_rin_x]){
						continue;
					}
					
					//
					//System.out.println(is_visited[n_len_y][n_len_x][n_rin_y][n_rin_x]);
					
					is_visited[n_len_y][n_len_x][n_rin_y][n_rin_x] = true;
					len_x_queue.add(n_len_x);
					len_y_queue.add(n_len_y);
					rin_x_queue.add(n_rin_x);
					rin_y_queue.add(n_rin_y);
					//time_queue.add(0);
				}
			}
			
			if(!found){
				System.out.println("No");
			}
		}
	}

}