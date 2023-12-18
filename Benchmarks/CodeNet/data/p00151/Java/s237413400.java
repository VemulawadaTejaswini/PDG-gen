import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		while (n != 0) {
			int grid[][] = new int[n + 2][n + 2];
			int maxLen = 0;
			
			for(int i = 1; i <= n; i++) {
				String s = scanner.nextLine();
				for(int j = 1; j <= n; j++) {
					grid[j][i] = Integer.parseInt(s.substring(j - 1, j));
				}
			}
			
			for(int x = 1; x <= n; x++) {
				for(int y = 1; y <= n; y++) {
					if (n - x + 1 <= maxLen && n - y + 1 <= maxLen) {
						break;
					}
					
					int len = 0;
					for(int px = x; px <= n; px++) {
						if (grid[px][y] == 0) {
							break;
						}
						len++;
					}
					if (len > maxLen) {maxLen = len;}

					len = 0;
					for(int py = y; py <= n; py++) {
						if (grid[x][py] == 0) {
							break;
						}
						len++;
					}
					if (len > maxLen) {maxLen = len;}

					len = 0;
					for(int px = x; px >= 1; px--) {
						if (grid[px][y + (x - px)] == 0) {
							break;
						}
						len++;
					}
					if (len > maxLen) {maxLen = len;}

					len = 0;
					for(int px = x; px <= n; px++) {
						if (grid[px][y + (px - x)] == 0) {
							break;
						}
						len++;
					}
					if (len > maxLen) {maxLen = len;}
				}
			}
			System.out.println(maxLen);
			n = Integer.parseInt(scanner.nextLine());
		}
	}

}