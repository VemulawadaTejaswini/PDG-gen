import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static final int MAX = 5;
	
	public static boolean check(final int x, final int y, final int n, boolean[][] field){
		for(int cur_x = x; cur_x < n; cur_x++){
			if(field[y][cur_x]){
				return false;
			}
		}
		
		for(int cur_y = y + 1; cur_y < n; cur_y++){
			for(int cur_x = 0; cur_x < n; cur_x++){
				if(field[cur_y][cur_x]){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int dfs(final int x, final int y, final int n, boolean[][] field, final int flips, final int limit){
		final int next_x = x == n - 1 ? 0 : x + 1;
		final int next_y = x == n - 1 ? y + 1 : y;
		
		//System.out.println(x + " " + y + " " + flips + " " + limit);
		if(x == n - 1 && y == n - 1){
			return field[y][x] ? 1 : 0;
		}else if(check(x, y, n, field)){
			return 0;
		}else if(!field[y][x]){
			return dfs(next_x, next_y, n, field, flips, limit);
		}
		
		int ret = limit;
		
		for(int lim_y = n - 1; lim_y >= y; lim_y--){
			for(int lim_x = n - 1; lim_x >= x; lim_x--){		
				if(flips >= ret){
					break;
				}
				
				for(int cur_y = y; cur_y <= lim_y; cur_y++){
					for(int cur_x = x; cur_x <= lim_x; cur_x++){
						field[cur_y][cur_x] = !field[cur_y][cur_x];
					}
				}
				
				ret = Math.min(ret, dfs(next_x, next_y, n, field, flips + 1, ret));
				
				for(int cur_y = y; cur_y <= lim_y; cur_y++){
					for(int cur_x = x; cur_x <= lim_x; cur_x++){
						field[cur_y][cur_x] = !field[cur_y][cur_x];
					}
				}
			}
		}
		
		return ret + 1;
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		boolean[][] field = new boolean[MAX][MAX];
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					field[i][j] = sc.nextInt() == 1;
				}
			}
			
			final int ret = dfs(0, 0, n, field, 0, 25);
			
			for(int i = 0; i < ret; i++){
				System.out.print("myon");
			}
			System.out.println();
		}
	}

}