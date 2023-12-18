import java.util.Scanner;

public class Main {
	
	public static final int MAX = 8;
	
	public static boolean ok(int x, int y){
		if(x < 0 || x >= MAX || y < 0 || y >= MAX){
			return false;
		}
		
		return true;
	}
	
	public static int check_dir(int x, int y, int color, int dx, int dy, int[][] board){
		if(board[y][x] != color){
			return Integer.MIN_VALUE;
		}
		
		int count = 0;
		while(true){
			x += dx;
			y += dy;
			
			if(!ok(x, y)){
				return Integer.MIN_VALUE;
			}else if(board[y][x] == color){
				return count;
			}else if(board[y][x] == 0){
				return Integer.MIN_VALUE;
			}
			
			count++;
		}
	}
	
	public static void do_dir(int x, int y, int color, int dx, int dy, int[][] board){
		if(board[y][x] != color){
			return;
		}
		
		while(true){
			x += dx;
			y += dy;
			
			if(!ok(x, y)){
				return;
			}else if(board[y][x] == color){
				return;
			}else if(board[y][x] == 0){
				return;
			}
			
			board[y][x] = color;
		}
	}
	
	public static boolean do_it(int color, int[][] board){
		int max = 0;
		int m_x = -1, m_y = -1;
		
		for(int y = 0; y < MAX; y++){
			for(int x = 0; x < MAX; x++){
				if(board[y][x] != 0){
					continue;
				}
				
				board[y][x] = color;
				int sum = 0;
				
				for(int dy = -1; dy <= 1; dy++){
					for(int dx = -1; dx <= 1; dx++){
						if(dy == 0 && dx == 0){
							continue;
						}
						
						final int cur = check_dir(x, y, color, dx, dy, board);
						if(cur > 0){
							sum += cur;
						}
					}
				}
				
				if(color == 1){
					if(max < sum){
						max = sum;
						m_x = x;
						m_y = y;
					}
				}else if(sum > 0){
					if(max <= sum){
						max = sum;
						m_x = x;
						m_y = y;
					}
				}
				
				board[y][x] = 0;
			}
		}
		
		if(m_x != -1 && m_y != -1){
			board[m_y][m_x] = color;
			
			for(int dy = -1; dy <= 1; dy++){
				for(int dx = -1; dx <= 1; dx++){
					if(dy == 0 && dx == 0){
						continue;
					}
					
					if(check_dir(m_x, m_y, color, dx, dy, board) > 0){
						do_dir(m_x, m_y, color, dx, dy, board);
					}
				}
			}
			
			return true;
		}else{
			return false;
		}
	}
	
	public static void draw(int[][] board){
		for(int i = 0; i < MAX; i++){
			for(int j = 0; j < MAX; j++){
				System.out.print(board[i][j] == 1 ? 'o' : board[i][j] == -1 ? 'x' : '.');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		int[][] board = new int[MAX][MAX];
		
		for(int i = 0; i < MAX; i++){
			char[] input = sc.next().toCharArray();
			
			for(int j = 0; j < MAX; j++){
				if(input[j] == 'o'){
					board[i][j] = 1;
				}else if(input[j] == 'x'){
					board[i][j] = -1;
				}else{
					board[i][j] = 0;
				}
			}
		}
		
		int turn = 1;
		boolean before_skip = false;
		while(true){
			if(!do_it(turn, board)){
				if(before_skip){
					break;
				}else{
					before_skip = true;
				}
			}else{
				before_skip = false;
			}
			
			turn = -turn;
			//draw(board);
			//System.out.println("--------");
		}
		
		draw(board);
	}

}