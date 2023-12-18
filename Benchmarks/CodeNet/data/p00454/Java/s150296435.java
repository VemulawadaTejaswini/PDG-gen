import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static final int MAX_N = 1000;
	public static final int MAX_SIZE = MAX_N * 2;
	
	public static final int[][] move_dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static boolean is_ok(int x, int y, int w, int h){
		if(x < 0 || x >= w || y < 0 || y >= h){
			return false;
		}else{
			return true;
		}
	}
	
	public static void dfs(int x, int y, final int w, final int h, short[][] masked, boolean[][] visited){
		if(visited[y][x]){
			return;
		}
		
		visited[y][x] = true;
		for(int[] move : move_dir){
			final int nx = x + move[0];
			final int ny = y + move[1];
			
			if(!is_ok(nx, ny, w, h)){
				continue;
			}else if(masked[ny][nx] > 0){
				continue;
			}else if(visited[ny][nx]){
				continue;
			}
			
			dfs(nx, ny, w, h, masked, visited);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		short[][] masked = new short[MAX_SIZE + 1][MAX_SIZE + 1];
		boolean[][] visited = new boolean[MAX_SIZE][MAX_SIZE];
		
		TreeSet<Integer> x_set = new TreeSet<Integer>();
		TreeSet<Integer> y_set = new TreeSet<Integer>();
		ArrayList<Integer> x_list = new ArrayList<Integer>();
		ArrayList<Integer> y_list = new ArrayList<Integer>();
		
		int[][] data = new int[MAX_N][4];
		
		while (true) {
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			final int n = sc.nextInt();
			
			x_set.clear();
			y_set.clear();
			x_list.clear();
			y_list.clear();
			
			for(int i = 0; i < n; i++){
				final int x1 = sc.nextInt();
				final int y1 = sc.nextInt();
				final int x2 = sc.nextInt();
				final int y2 = sc.nextInt();
				
				data[i][0] = x1;
				data[i][1] = y1;
				data[i][2] = x2;
				data[i][3] = y2;
				
				x_set.add(x1);
				x_set.add(x2);
				y_set.add(y1);
				y_set.add(y2);
			}
			
			x_list.addAll(x_set);
			y_list.addAll(y_set);
			
			final int w_c = x_list.size();
			final int h_c = y_list.size();
			
			for(int i = 0; i <= h_c; i++){
				for(int j = 0; j <= w_c; j++){
					masked[i][j] = 0;
				}
			}
			
			for(int i = 0; i < n; i++){
				final int x1 = Collections.binarySearch(x_list, data[i][0]);
				final int y1 = Collections.binarySearch(y_list, data[i][1]);
				final int x2 = Collections.binarySearch(x_list, data[i][2]);
				final int y2 = Collections.binarySearch(y_list, data[i][3]);
				
				masked[y1][x1]++;
				masked[y1][x2 + 1]--;
				masked[y2 + 1][x2]--;
				masked[y2 + 1][x2 + 1]++;
			}
			
			for(int i = 0; i < h_c; i++){
				for(int j = 1; j < w_c; j++){
					masked[i][j] += masked[i][j-1];
				}
			}
			
			for(int j = 0; j < w_c; j++){
				for(int i = 1; i < h_c; i++){
					masked[i][j] += masked[i-1][j];
				}
			}
			
			/*
			for(int i = 0; i < h_c; i++){
				for(int j = 0; j < w_c; j++){
					System.out.print(masked[i][j] + " ");
				}
				System.out.println();
			}
			*/
			
			for(int i = 0; i < h_c; i++){
				for(int j = 0; j < w_c; j++){
					visited[i][j] = false;
				}
			}
			
			int count = 0;
			for(int i = 0; i < h_c; i++){
				for(int j = 0; j < w_c; j++){
					if(masked[i][j] > 0){
						continue;
					}else if(visited[i][j]){
						continue;
					}
					
					dfs(j, i, w_c, h_c, masked, visited);
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}