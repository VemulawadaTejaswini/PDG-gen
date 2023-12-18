import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			boolean[][] is_visited = new boolean[N][N];
			boolean[][] tmp = new boolean[N][N];
			
			int[][] x_pos = new int[N][N];
			int[][] y_pos = new int[N][N];
			
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					x_pos[i][j] = sc.nextInt();
					y_pos[i][j] = sc.nextInt();
				}
			}
			
			int count = 0;
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					if(is_visited[i][j]){
						continue;
					}
					
					int x_p = j;
					int y_p = i;
					
					while(!is_visited[y_p][x_p] && !tmp[y_p][x_p]){
						tmp[y_p][x_p] = true;
						int x_o = x_p, y_o = y_p;
						
						x_p = x_pos[y_o][x_o];
						y_p = y_pos[y_o][x_o];
					}
					
					if (!is_visited[y_p][x_p]) {
						count++;
					}
					
					for (int k = 0; k < N; k++) {
						for (int l = 0; l < N; l++) {
							if (tmp[k][l]) {
								is_visited[k][l] = true;
								tmp[k][l] = false;
							}
						}
					}

				}
			}
			
			System.out.println(count);
			
		}
	}

}