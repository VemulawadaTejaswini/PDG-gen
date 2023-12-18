import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[][] grid = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = scan.nextInt();
			}
		}
		
		int n = scan.nextInt();
		
		for (int nums = 0; nums < n; nums++) {
			int b = scan.nextInt();
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (grid[i][j] == b) {
						grid[i][j] = 0;
					}
				}
			}
		}
		
		boolean check = false;
		
		for (int i = 0; i < grid.length; i++) {
			int cnt = 0;
			int cntcol = 0;
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0) cnt++;
				if (grid[j][i] == 0) cntcol++;
			}
			if (cnt == 3) check = true;
			if (cntcol == 3) check = true;
		}
		
		if ((grid[0][0] == 0 && grid[1][1] == 0 && grid[2][2] == 0) || (grid[0][2] == 0 && grid[1][1] == 0 && grid[2][0] == 0)) {
			check = true;
		}
		
		if (check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
	}

}