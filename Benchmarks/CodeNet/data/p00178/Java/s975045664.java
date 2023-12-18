import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
	
	public static int MAX = 5 * 1000 + 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[][] data = new int[n][3];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 3; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
			boolean[][] map = new boolean[MAX+1][5];
			
			int height_ceil = 0;
			for(int i = 0; i < n; i++){
				final int dir = data[i][0];
				final int w_lenght = dir == 1 ? data[i][1] : 1;
				final int h_lenght = dir == 2 ? data[i][1] : 1;
				final int pos = data[i][2] - 1;
				
				int y = 0;
				LOOP:
				for(int h = height_ceil - 1; h >= 0; h--){
					for(int j = 0; j < w_lenght; j++){
						if(map[h][pos+j]){
							y = h + 1;
							break LOOP;
						}
					}
				}
				
				for(int j = 0; j < h_lenght; j++){
					for(int k = 0; k < w_lenght; k++){
						map[y+j][pos+k] = true;
					}
				}
				height_ceil = Math.max(height_ceil, y + h_lenght);
				
				for(int h = 0; h < height_ceil; h++){
					boolean flag = true;
					for(int j = 0; j < 5; j++){
						if(!map[h][j]){
							flag = false;
							break;
						}
					}
					
					if(flag){
						for(int h_2 = h; h_2 < height_ceil; h_2++){
							for(int j = 0; j < 5; j++){
								map[h_2][j] = map[h_2+1][j];
							}
						}
						h--;
						height_ceil--;
					}
				}
				/*
				for(int h = height_ceil - 1; h >= 0; h--){
					for(int j = 0; j < 5; j++){
						System.out.print(map[h][j] ? "■" : " ");
					}
					System.out.println();
				}
				System.out.println("------");
				*/
			}
			
			int count = 0;
			for(boolean[] inner : map){
				for(boolean in : inner){
					//System.out.print(in ? "■" : " ");
					if(in){
						count++;
					}
				}
				//System.out.println();
			}
			
			
			System.out.println(count);
		}

	}
}