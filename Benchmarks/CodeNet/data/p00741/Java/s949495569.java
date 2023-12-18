import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt(), h = scan.nextInt();

		while (w != 0 || h != 0){
			int grid[][] = new int[h + 2][w + 2];
			int count = 0;

			for (int i = 0; i < h + 2; i++){
				for (int j = 0; j < w + 2; j++){
					if (i == 0 || i == h + 1 || j == 0 || j == w + 1){
						grid[i][j] = -1;
					} else {
						grid[i][j] = scan.nextInt();
					}
				}
			}


			for (int i = 1; i <= h; i++){
				for (int j = 1; j <= w; j++){
					if (grid[i][j] == 1){
						search(grid, i, j);
						count++;
					}
				}
			}

			System.out.println(count);

			w = scan.nextInt();
			h = scan.nextInt();
		}
	}

	public static void search(int[][] grid, int i, int j) {
		grid[i][j] = -1;

		if (grid[i + 1][j] == 1){
			search(grid, i + 1, j);
		}
		if (grid[i - 1][j] == 1){
			search(grid, i - 1, j);
		}
		if (grid[i][j + 1] == 1){
			search(grid, i, j + 1);
		}
		if (grid[i][j - 1] == 1){
			search(grid, i, j - 1);
		}
		if (grid[i + 1][j + 1] == 1){
			search(grid, i + 1, j + 1);
		}
		if (grid[i - 1][j + 1] == 1){
			search(grid, i - 1, j + 1);
		}
		if (grid[i + 1][j - 1] == 1){
			search(grid, i + 1, j);
		}
		if (grid[i - 1][j - 1] == 1){
			search(grid, i - 1, j);
		}
	}
}