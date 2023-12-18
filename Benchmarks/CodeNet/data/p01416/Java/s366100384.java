import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		new Main().run();
	}
	
	Scanner scanner = new Scanner(System.in);
	int m;
	int[][][] tile = new int[26][2][2];
	Deque<Integer> que = new ArrayDeque<Integer>();
	boolean[] cantGet =new boolean[26];
	boolean[] check =new boolean[26];
	int score = 0;
	
	void run() {
		
		m = scanner.nextInt();
		scanner.nextInt();
		
		for (int color = 0; color < tile.length; color ++) {
			
			tile[color][0][0] = -1;
			cantGet[color] = false;
			check[color] = false;
		}
		
		for (int y = 0; y < m; y ++) {
			
			char[] line = scanner.next().toCharArray();
			
			for (int x = 0; x < line.length; x ++) {
				
				if(line[x] != '.') {
					
					int color = line[x] - 'A';
					int index = (tile[color][0][0] == -1) ? 0: 1;
					tile[color][index][0] = x;
					tile[color][index][1] = y;
				}
			}
		}
		
		for (int color = 0; color < tile.length; color ++) {
			
			if (tile[color][0][0] != -1
					&& ! tryGet(color) && ! que.isEmpty()) {
				
				bfs();
			}
		}
		
		System.out.println(score * 2);
	}
	
	Collection<Integer> old = new ArrayList<Integer>(que);
	
	void bfs() {
		
		do {
			
			old.clear();
			old.addAll(que);
			int color;
			int last = que.getLast();
			do {
				
				color = que.remove();
				tryGet(color);
				
			} while (color != last);
			
		} while (! que.isEmpty() && ! old.containsAll(que));
		
		if (! que.isEmpty()) {
			
			for (int color : que) {
				
				cantGet[color] = true;
			}
		}
	}
	
	boolean tryGet(int color) {
		
		if (cantGet[color]) {
			
			return false;
		}
		
		if (! check[color]) {
			
			check[color] = true;
			if ((tile[color][0][0] == tile[color][1][0]
					&& Math.abs(tile[color][0][1] - tile[color][1][1]) == 1)
					|| (tile[color][0][1] == tile[color][1][1]
					&& Math.abs(tile[color][0][0] - tile[color][1][0]) == 1)) {
				
				cantGet[color] = true;
				return false;
			}
		}
		
		if((isEmpty(color, 1, tile[color][0][0], tile[color][0][1], tile[color][1][1])
					&& isEmpty(color, 0, tile[color][1][1], tile[color][0][0], tile[color][1][0]))
				|| (isEmpty(color, 1, tile[color][1][0], tile[color][0][1], tile[color][1][1])
					&& isEmpty(color, 0, tile[color][0][1], tile[color][0][0], tile[color][1][0]))) {
			
			tile[color][0][0] = -1;
			score ++;
			return true;
		}
		
		que.add(color);
		return false;
	}
	
	boolean isEmpty(int skip,int axis, int point, int start, int end) {
		
		if (start == end) {
			
			return true;
		}
		
		if (start > end) {
			
			int swap = start;
			start = end;
			end = swap;
		}
		
		boolean isEmpty = true;
		for (int color = 0; color < tile.length; color ++) {
			
			if (color == skip
					|| tile[color][0][0] == -1) {
				
				continue;
			}
			
			for (int index = 0; index < tile[0].length; index ++) {
				
				if (tile[color][index][1 - axis] == point
						&& tile[color][index][axis] >= start
						&& tile[color][index][axis] <= end) {
					
					isEmpty = false;
					if (! que.contains(color)
							&& ! cantGet[color]) {
						
						que.add(color);
					}
					break;
				}
			}
		}
		
		return isEmpty;
	}
}