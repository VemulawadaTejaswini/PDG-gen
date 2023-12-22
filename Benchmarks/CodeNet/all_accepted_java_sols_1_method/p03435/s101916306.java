
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] grid = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		for(int i = 1; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				grid[i][j] -= grid[0][j];
			}
		}
		boolean ans = false;
		if(grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2] && grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2])
			ans = true;
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
