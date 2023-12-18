import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static final int SIZE = 5;

	public static final int[][] move_dir = new int[][] { { 0, 1 }, { 0, -1 },
			{ 1, 0 }, { -1, 0 } };

	public static boolean is_ok(int x, int y, int size) {
		if (x < 0 || x >= size || y < 0 || y >= size) {
			return false;
		} else {
			return true;
		}
	}

	public static void fall(char[][] map) {
		for (int x = 0; x < 5; x++) {
			while (true) {
				boolean found = false;

				for (int y = 4; y >= 1; y--) {
					if (map[y][x] == 0 && map[y - 1][x] != 0) {
						found = true;

						map[y][x] = map[y - 1][x];
						map[y - 1][x] = 0;
					}
				}

				if (!found) {
					break;
				}
			}
		}
	}

	public static int erase(char[][] map, int[] score){
		boolean[][] delete = new boolean[5][5];
		
		int cur = 0;
		int bonus = 1;
		while(true){
			boolean updated = false;
			
			for (int y = 0; y < 5; y++) {
				for (int x = 0; x < 5; x++) {
					if(map[y][x] == 0){
						continue;
					}
					
					// x
					int x_len = 1;
					while (true) {
						if (!is_ok(x + x_len, y, 5)) {
							break;
						} else if (map[y][x] == map[y][x + x_len]) {
							x_len++;
						} else {
							break;
						}
					}

					if (x_len >= 3) {
						for (int add = 0; add < x_len; add++) {
							delete[y][x + add] = true;
							updated = true;
						}
					}

					int y_len = 1;
					while (true) {
						if (!is_ok(x, y + y_len, 5)) {
							break;
						} else if (map[y][x] == map[y + y_len][x]) {
							y_len++;
						} else {
							break;
						}
					}

					if (y_len >= 3) {
						for (int add = 0; add < y_len; add++) {
							delete[y + add][x] = true;
							updated = true;
						}
					}
				}
			}
		
			if(!updated){
				break;
			}
			
			for(int y = 0; y < 5; y++){
				for(int x = 0; x < 5; x++){
					if(!delete[y][x]){
						continue;
					}
					cur += score[map[y][x] - 1] * bonus;
					//System.out.println(cur);
					
					map[y][x] = 0;
				}
			}
			//disp(map);
			
			fall(map);
			
			//disp(map);
			
			for(int y = 0; y < 5; y++){
				for(int x = 0; x < 5; x++){
					delete[y][x] = false;
				}
			}
			
			bonus++;
		}
		
		return cur;
	}
	
	public static void disp(char[][] map){
		for(int y = 0; y < 5; y++){
			for(int x = 0; x < 5; x++){
				System.out.print((int)(map[y][x]) + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");
	}
	
	public static char[][] copy(char[][] map){
		char[][] tmp = new char[5][5];
		
		for(int y = 0; y < 5; y++){
			for(int x = 0; x < 5; x++){
				tmp[y][x] = map[y][x];
			}
		}
		
		return tmp;
	}
	
	public static int dfs(int deep, final int n, char[][] map, int[] score, int x, int y,
			int prev_x, int prev_y) {
		if (deep == n) {
			return erase(copy(map), score);
		} else {
			int max = erase(copy(map), score);

			for (int[] dir : move_dir) {
				final int nx = x + dir[0];
				final int ny = y + dir[1];

				if (!is_ok(nx, ny, 5)) {
					continue;
				} else if (nx == prev_x && ny == prev_y) {
					continue;
				}

				char swap = map[y][x];
				map[y][x] = map[ny][nx];
				map[ny][nx] = swap;

				max = Math.max(max, dfs(deep + 1, n, map, score, nx, ny, x, y));

				swap = map[y][x];
				map[y][x] = map[ny][nx];
				map[ny][nx] = swap;
			}

			return max;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();

			if (n < 0) {
				break;
			}

			char[][] map = new char[5][5];
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					map[i][j] = (char) (sc.nextInt());
				}
			}

			int[] score = new int[5];
			for (int i = 0; i < 5; i++) {
				score[i] = sc.nextInt();
			}
			
			int max = Integer.MIN_VALUE;
			for(int y = 0; y < 5; y++){
				for(int x = 0; x < 5; x++){
					max = Math.max(max, dfs(0, n, map, score, x, y, -1, -1));
				}
			}
			
			System.out.println(max);
		}
	}

}