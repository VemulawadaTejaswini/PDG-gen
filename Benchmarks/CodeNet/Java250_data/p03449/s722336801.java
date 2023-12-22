import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[][] grid;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		grid = new int[2][n];
		for(int i =0; i <2; i++){
			for(int j =0; j < n; j++){
				grid[i][j] = sc.nextInt();
			}
		}
		memoGrid = new int[2][n];
		Arrays.fill(memoGrid[0], 0);
		Arrays.fill(memoGrid[1], 0);
		move(0,0,0);
		System.out.println(memoGrid[1][n-1]);

	}
	private static int[][] memoGrid;

	private static void move(int i, int j, int score){
		int length = memoGrid[0].length;
		score += grid[i][j];
		if(score < memoGrid[i][j]) return;
		memoGrid[i][j] = score;
		boolean canDown = i == 0;
		boolean canRight = j < length-1;
		if(canDown){
			if(canRight) move(i+1,j+1,score);
			move(i+1,j,score);
		}
		if(canRight) move(i, j+1, score);
	}
}