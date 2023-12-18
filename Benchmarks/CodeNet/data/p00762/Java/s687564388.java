import java.util.Scanner;

public class Main {

	public static class Dice {
		public static int MAX = 5, SIZE = 7;
		public static int TOP    = 0, FRONT  = 1, RIGHT = 2;
		public static int BOTTOM = 5, BACK   = 4, LEFT  = 3;
		
		int[] dice; // 1, 2, 3, 4, 5, 6
		public Dice(int top, int front, int right, int sum){
			dice = new int[MAX + 1];
			dice[TOP] = top;          dice[FRONT] = front;      dice[RIGHT] = right;
			dice[BOTTOM] = sum - top; dice[BACK] = sum - front; dice[LEFT] = sum - right;
		}
		
		public Dice(int top, int front, int right){
			this(top, front, right, SIZE);
		}
		
		public void rotate(final int dir){ rotate_dice(TOP, dir, BOTTOM, MAX - dir); }
		
		public void rotate_dice(int ... args){
			final int tmp = dice[args[args.length - 1]];
			for(int now = args.length - 1; now > 0; now--){
				dice[args[now]] = dice[args[now - 1]];
			}
			dice[args[0]] = tmp;
		}
		
		@Override public String toString(){
			return "front = " + dice[FRONT] + ", top = " + dice[TOP] + ", right = " + dice[RIGHT]; 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] t_f_r = new int[7][7];
		t_f_r[1][3] = 5; t_f_r[1][5] = 4; t_f_r[1][4] = 2; t_f_r[1][2] = 3;
		t_f_r[2][3] = 1; t_f_r[2][1] = 4; t_f_r[2][4] = 6; t_f_r[2][6] = 3;
		t_f_r[3][5] = 1; t_f_r[3][1] = 2; t_f_r[3][2] = 6; t_f_r[3][6] = 5;
		t_f_r[4][5] = 6; t_f_r[4][6] = 2; t_f_r[4][2] = 1; t_f_r[4][1] = 5;
		t_f_r[5][4] = 1; t_f_r[5][1] = 3; t_f_r[5][3] = 6; t_f_r[5][6] = 4;
		t_f_r[6][4] = 5; t_f_r[6][5] = 3; t_f_r[6][3] = 2; t_f_r[6][2] = 4;
		
		int[] dirs = {Dice.LEFT, Dice.RIGHT, Dice.BACK, Dice.FRONT};
		int[] vx  = {-1, 1, 0, 0};
		int[] vy  = {0, 0, -1, 1};
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			final int OFFSET = 200;
			final int SIZE = OFFSET * 2 + 1;
			
			int[][] height_map = new int[SIZE][SIZE];
			int[][] top_map = new int[SIZE][SIZE];
			for(int i = 0; i < SIZE; i++){
				for(int j = 0; j < SIZE; j++){
					top_map[i][j] = -1;
				}
			}
			
			
			for(int i = 0; i < n; i++){
				final int top = sc.nextInt();
				final int front = sc.nextInt();
				
				Dice dice = new Dice(top, front, t_f_r[top][front]);
				int x = OFFSET, y = OFFSET;

				//System.out.println(dice);
				while(true){
					int max_dir = -1;
					int max_die = -1;
					
					for(int dir = 0; dir < 4; dir++){
						if(dice.dice[dirs[dir]] <= 3){ continue; }
						final int nx = x + vx[dir];
						final int ny = y + vy[dir];
						
						if(height_map[y][x] <= height_map[ny][nx]){
							continue;
						}else if(max_die >= dice.dice[dirs[dir]]){
							continue;
						}
						
						max_dir = dir;
						max_die = dice.dice[dirs[dir]];
					}
					
					if(max_dir >= 0){
						x += vx[max_dir];
						y += vy[max_dir];
						dice.rotate(dirs[max_dir]);
						//System.out.println(dice + "  " + dirs[max_dir]);
					}else{
						height_map[y][x]++;
						top_map[y][x] = dice.dice[Dice.TOP];
						break;
					}
				}
				
				/*
				for(int j = -10; j <= 10; j++){
					for(int k = -10; k <= 10; k++){
						System.out.print(top_map[OFFSET + j][OFFSET + k] + " ");
					}
					System.out.println();
				}
				System.out.println("----------------------------------");
				*/
			}
			
			int[] count = new int[7];
			for(int i = 0; i < SIZE; i++){
				for(int j = 0; j < SIZE; j++){
					if(top_map[i][j] <= 0){ continue; }
					count[top_map[i][j]]++;
				}
			}
			
			for(int i = 1; i < 7; i++){
				if(i != 1){ System.out.print(" "); }
				System.out.print(count[i]);
			}
			System.out.println();
			
		}
	}
}