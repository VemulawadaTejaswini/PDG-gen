import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		
		boolean[][] bool = new boolean[H + 2][W + 2];
		String[] lines = new String[H];
		sc.nextLine();
		for (int i = 0; i < H; i++) {
			lines[i] = sc.nextLine();
		}
		
		String[][] grid = new String[H + 2][W + 2];
		for (int i = 0; i < H; i++){
			String line = lines[i];
			for (int j = 0; j < W; j++) {
				if (j == line.length() - 1) {
					grid[i + 1][j + 1] = line.substring(j);
				} else {
					grid[i + 1][j + 1] = line.substring(j, j + 1);
				}
			}
		}
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				if ("#".equals(grid[i][j])) {
					if ("#".equals(grid[i + 1][j]) || "#".equals(grid[i - 1][j]) || "#".equals(grid[i][j + 1]) || "#".equals(grid[i][j - 1])) {
						bool[i][j] = true;
					}
				}
			}
		}
		boolean existsFalse = false;
		out:for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				if ("#".equals(grid[i][j])) {
					if (!bool[i][j]) {
						existsFalse = true;
						break out;
					}
				}
			}
		}
		if (existsFalse) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
