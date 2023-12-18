import java.util.Arrays;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int kindOfProblem = sc.nextInt();
			if(n == 0 && kindOfProblem == 0) break;
			int[][] in = new int[n][4];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 4; j++) {
					in[i][j] = sc.nextInt();
				}
			}
			Sheet s = new Sheet(max(in)+1);
			for(int[] row: in) {
				s.addSheet(row[0], row[1], row[2], row[3]);
			}
			switch(kindOfProblem){
				case 1:
					System.out.println(s.countTrue());
					break;
				case 2:
					System.out.println(s.countTrue());
					System.out.println(s.calcLength());
			}
		}
		sc.close();
	}
	
	static int max(int[][] array) {
		int result = 0;
		for(int[] row: array) {
			for(int i : row) if(i > result) result = i;
		}
		return result;
	}
}

class Sheet{
	boolean[][] grid;
	
	Sheet(int size){
		this.grid = new boolean[size][size];
		for(boolean[] row: grid) {
			Arrays.fill(row, false);
		}
	}
	
	void addSheet(int x1, int y1, int x2, int y2) {
		for(int i = y1; i < y2; i++){
			for(int j = x1; j < x2; j++) {
				this.grid[i][j] = true;
			}
		}
	}
	
	int countTrue() {
		int result = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j]) result++;
			}
		}
		return result;
	}
	
	int calcLength() {
		int result = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j]) {
					if(!check(i, j-1)) result++;
					if(!check(i-1, j)) result++;
					if(!check(i+1, j)) result++;
					if(!check(i, j+1)) result++;
				}
			}
		}
		return result;
	}
	
	boolean check(int x, int y) {
		if(0 <= x && x < grid[0].length && 0 <= y && y < grid.length) return grid[x][y];
		else return false;
	}
}