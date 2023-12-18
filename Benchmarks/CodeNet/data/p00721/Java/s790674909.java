
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	final int CLEAN = 0;
	final int DIRTY = 1;
	final int OBJECT = 2;
	final int START = 3;
	
	int startX, startY;
	int h, w;
	int[][] map;
	int[][] cost;
	
	int[] dirtyX, dirtyY;
	int dirtynum;
	int answer;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private void readFromStdin() {
		try {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			w = Integer.valueOf(st.nextToken());
			h = Integer.valueOf(st.nextToken());
			map = new int[h+2][w+2];
			cost = new int[h+2][w+2];
			dirtynum = 0;
			dirtyX = new int[10]; dirtyY = new int[10];
			answer = 0;

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = OBJECT;
				}
			}
			for (int i = 1; i <= h; i++) {
				str = br.readLine();
				for (int j = 1; j <= w; j++) {
					char c = str.charAt(j-1);
					map[i][j] = (c == '.') ? CLEAN:
								(c == '*') ? DIRTY:
								(c == 'b') ? OBJECT:
								(c == 'a') ? START: OBJECT;
					if (c == 'a') {
						startX = j;
						startY = i;
					}
					if (c == '*') {
						dirtyX[dirtynum] = j;
						dirtyY[dirtynum] = i;
						dirtynum++;
					}
				}
			}
		} catch (IOException e) {
			
		}
	}
	
	private void dijkstra(int x, int y) {
		if (map[y][x] == OBJECT) {
			cost[y][x] = -1;
			return;
		}
		
		if (cost[y][x] + 1 < cost[y+1][x]) {
			cost[y+1][x] = cost[y][x] + 1;
			dijkstra(x, y+1);
		}
		if (cost[y][x] + 1 < cost[y-1][x]) {
			cost[y-1][x] = cost[y][x] + 1;
			dijkstra(x, y-1);
		}
		if (cost[y][x] + 1 < cost[y][x+1]) {
			cost[y][x+1] = cost[y][x] + 1;
			dijkstra(x+1, y);
		}
		if (cost[y][x] + 1 < cost[y][x-1]) {
			cost[y][x-1] = cost[y][x] + 1;
			dijkstra(x-1, y);
		}
	}
	
	private void initCost() {
		for (int i = 0; i < cost.length; i++) {
			for (int j = 0; j < cost[i].length; j++) {
				cost[i][j] = Integer.MAX_VALUE;
			}
		}
		cost[startY][startX] = 0;
	}
	
	public Main() {
		while (true) {
			readFromStdin();
			if (w == 0 && h == 0) break;
			while (isNotAllClean()) {
				initCost();
				dijkstra(startX, startY);
				//printMap(cost);
				if (changeStart()) {
					answer = -1;
					break;
				}
			}
			System.out.println(answer);
		}
	}
	
	private boolean isNotAllClean() {
		for (int i = 0; i < dirtynum; i++) {
			if (dirtyY[i] == -1 && dirtyX[i] == -1) continue;
			return true;
		}
		return false;
	}

	private boolean changeStart() {
		int minCost = Integer.MAX_VALUE;
		int index = -1;
		
		map[startY][startX] = CLEAN;
		for (int i = 0; i < dirtynum; i++) {
			if (dirtyY[i] == -1 && dirtyX[i] == -1) continue;
			int tempCost = cost[dirtyY[i]][dirtyX[i]];
			if (minCost > tempCost) {
				minCost = tempCost;
				index = i;
			}
		}
		if (minCost == Integer.MAX_VALUE) return true;
		answer += minCost;
		startX = dirtyX[index]; startY = dirtyY[index];
		dirtyX[index] = -1; dirtyY[index] = -1;
		return false;
	}
	
	private void printMap(int[][] map) {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main robot = new Main();
	}

}