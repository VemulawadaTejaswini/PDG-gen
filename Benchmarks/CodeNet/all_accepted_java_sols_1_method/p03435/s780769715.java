import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int [][] grid = new int[3][3];
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		if(grid[1][0]-grid[0][0] != grid[1][1]-grid[0][1]) {
			System.out.println("No");
			return;
		}
		if(grid[1][1]-grid[0][1] != grid[1][2]-grid[0][2]) {
			System.out.println("No");
			return;
		}
		if(grid[2][0]-grid[1][0] != grid[2][1]-grid[1][1]) {
			System.out.println("No");
			return;
		}
		if(grid[2][1]-grid[1][1] != grid[2][2]-grid[1][2]) {
			System.out.println("No");
			return;
		}

		if(grid[0][1]-grid[0][0] != grid[1][1]-grid[1][0]) {
			System.out.println("No");
			return;
		}
		if(grid[1][1]-grid[1][0] != grid[2][1]-grid[2][0]) {
			System.out.println("No");
			return;
		}
		if(grid[0][2]-grid[0][1] != grid[1][2]-grid[1][1]) {
			System.out.println("No");
			return;
		}
		if(grid[1][2]-grid[1][1] != grid[2][2]-grid[2][1]) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}