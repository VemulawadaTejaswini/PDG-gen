import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		new Main().run();
		return;
	}
	
	Scanner scanner = new Scanner(System.in);
	int m;
	int[][][] tile = new int[26][2][2];
	int score = 0;
	
	void run() {
		
		m = scanner.nextInt();
		scanner.nextInt();
		
		for (int i = 0; i < 26; i ++) {
			
			for (int j = 0; j < 2; j ++) {
				
				Arrays.fill(tile[i][j], -1);
			}
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
		
		int preScore;
		do {
			
			preScore = score;
			
			for (int color = 0; color < 26; color ++) {
				
				tryGet(color);
			}
			
		} while(preScore != score);
		
		System.out.println(score * 2);
	}
	
	void tryGet(int color) {
		
		if (tile[color][0][0] == -1) {
			
			return;
		}
		
		if ((tile[color][0][0] == tile[color][1][0]
				&& Math.abs(tile[color][0][1] - tile[color][1][1]) == 1)
				|| (tile[color][0][1] == tile[color][1][1]
				&& Math.abs(tile[color][0][0] - tile[color][1][0]) == 1)) {
				
			get(color);
			return;
		}
		
		if((isEmpty(color, 1, tile[color][0][0], tile[color][0][1], tile[color][1][1])
				&& isEmpty(color, 0, tile[color][1][1], tile[color][0][0], tile[color][1][0]))
				|| (isEmpty(color, 1, tile[color][1][0], tile[color][0][1], tile[color][1][1])
						&& isEmpty(color, 0, tile[color][0][1], tile[color][0][0], tile[color][1][0]))) {
			
			get(color);
			score ++;
		}
	}
	
	boolean isEmpty(int skip,int axis, int point, int start, int end) {
		
		if (start > end) {
			
			int swap = start;
			start = end;
			end = swap;
		}
		
		if (start == end) {
			
			return true;
		}
		
		for (int color = 0; color < 26; color ++) {
			
			if (color == skip
					|| tile[color][0][0] == -1) {
				
				continue;
			}
			
			for (int index = 0; index < 2; index ++) {
				
				if (tile[color][index][1 - axis] == point
						&& tile[color][index][axis] >= start
						&& tile[color][index][axis] <= end) {
					
					return false;
				}
			}
		}
		
		return true;
	}
	
	void get(int color) {
		
		for (int index = 0; index < 2; index ++) {
			
			for (int axis = 0; axis < 2; axis ++) {
			
				tile[color][index][axis] = -1;
			}
		}
	}
}