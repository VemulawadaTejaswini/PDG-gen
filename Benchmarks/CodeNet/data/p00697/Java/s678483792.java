import java.util.Arrays; 
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 3;
	public static final int SIZE = MAX * MAX;
	
	public static int[][] move_dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	public static int[] use = new int[]{0, 1, 2, 3};
	public static int[] ref = new int[]{2, 3, 0, 1};
	
	public static boolean is_sat(int x, int y, char[] piece, char[][][] press){
		for(int dir = 0; dir < move_dir.length; dir++){
			final int nx = x + move_dir[dir][0];
			final int ny = y + move_dir[dir][1];
			
			if(!is_ok(nx, ny)){
				continue;
			}else if(press[ny][nx][0] == '?'){
				continue;
			}
			
			if((piece[use[dir]] ^ press[ny][nx][ref[dir]]) != ('a' ^ 'A')){
				//System.out.println(piece[use[dir]] + " " + press[ny][nx][ref[dir]]);
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean is_ok(int x, int y){
		if(x < 0 || y < 0 || x >= MAX || y >= MAX){
			return false;
		}else{
			return true;
		}
	}
	
	public static final int dfs(final int x, final int y, boolean[] using, char[][] pieces, char[][][] press){
		final int next_x = x == MAX - 1 ? 0 : x + 1;
		final int next_y = x == MAX - 1 ? y + 1 : y;
		
		if(y == MAX && x == 0){
			/*
			for(int i = 0; i < MAX; i++){
				for(int j = 0; j < MAX; j++){
					System.out.println(Arrays.toString(press[i][j]));
				}
			}
			System.out.println();
			*/
			return 1;
		}
		
		//System.out.println(x + " " + y);
		
		int sum = 0;
		
		for(int use_piece = 0; use_piece < SIZE; use_piece++){
			if(using[use_piece]){
				continue;
			}
			using[use_piece] = true;
			
			for(int rotate = 0; rotate < 4; rotate++){
				//System.out.println(Arrays.toString(pieces[use_piece]));
				char tmp = pieces[use_piece][0];
				for(int i = 0; i < 3; i++){
					pieces[use_piece][i] = pieces[use_piece][i + 1];
				}
				pieces[use_piece][3] = tmp;
				//System.out.println("rotate :" + Arrays.toString(pieces[use_piece]));
				
				if(is_sat(x, y, pieces[use_piece], press)){
					for(int i = 0; i < 4; i++){
						press[y][x][i] = pieces[use_piece][i];
					}
					
					sum += dfs(next_x, next_y, using, pieces, press);
					
					for(int i = 0; i < 4; i++){
						press[y][x][i] = '?';
					}
				}
			}
			
			using[use_piece] = false;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int T = sc.nextInt();
		
		char[][] pieces = new char[SIZE][4];
		char[][][] press  = new char[MAX][MAX][4];
		boolean[] using = new boolean[SIZE];
		
		for(int tt = 0; tt < T; tt++){
			for(int i = 0; i < SIZE; i++){
				pieces[i] = sc.next().toCharArray();
			}
			
			for(int i = 0; i < MAX; i++){
				for(int j = 0; j < MAX; j++){
					Arrays.fill(press[i][j], '?');
				}
			}
			Arrays.fill(using, false);
			
			System.out.println(dfs(0, 0, using, pieces, press));
		}
		
		sc.close();
	}
}