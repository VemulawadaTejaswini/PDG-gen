import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static boolean ok(int x, int y, int z, int n){
		if(x < 0 || x >= n || y < 0 || y >= n || z < 0 || z >= n){
			return false;
		}
		
		return true;
	}
	
	public static boolean check_dir(int x, int y, int z, int color, int n, int m, int dx, int dy, int dz, int board[][][]){
		if(!ok(x, y, z, n) || board[z][y][x] != color){
			return false;
		}
		
		for(int i = 0; i < m - 1; i++){
			x += dx;
			y += dy;
			z += dz;
			
			if(!ok(x, y, z, n) || board[z][y][x] != color){
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean check(int color, int n, int m, int[][][] board){
		for(int z = 0; z < n; z++){
			for(int y = 0; y < n; y++){
				for(int x = 0; x < n; x++){
					if(board[z][y][x] != color){
						continue;
					}
					
					for(int dz = -1; dz <= 1; dz++){
						for(int dy = -1; dy <= 1; dy++){
							for(int dx = -1; dx <= 1; dx++){
								if(dx == 0 && dy == 0 && dz == 0){
									continue;
								}
								
								if(check_dir(x, y, z, color, n, m, dx, dy, dz, board)){
									return true;
								}
							}
						}
					}
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int p = sc.nextInt();
			
			if(n == 0 && m == 0 && p == 0){
				break;
			}
			 
			int[][][] board = new int[n][n][n];
			int win_color = 0;
			int count = 1;
			
			for(int i = 0; i < p; i++){
				final int x = sc.nextInt() - 1;
				final int y = sc.nextInt() - 1;
				
				if(win_color != 0){
					continue;
				}
				
				final int color = i % 2 == 0 ? 1 : -1;
				
				boolean flag = false;
				for(int z = n - 1; z >= 0; z--){
					if(board[z][y][x] != 0){
						board[z+1][y][x] = color;
						flag = true;
						break;
					}
				}
				if(!flag){
					board[0][y][x] = color;
				}
				
				if(check(color, n, m, board)){
					win_color = color;
				}else{
					count++;
				}
			}
			
			if(win_color == 0){
				System.out.println("Draw");
			}else{
				System.out.println((win_color == 1 ? "Black" : "White") + " " + count);
			}
		}
	}

}