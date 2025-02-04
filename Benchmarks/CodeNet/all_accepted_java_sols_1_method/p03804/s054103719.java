import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		char[][] a = new char[n][n];
		char[][] b = new char[m][m];
		
		for (int i = 0; i < n; i++) {
			a[i] = in.next().toCharArray();
		}
		for (int i = 0; i < m; i++) {
			b[i] = in.next().toCharArray();
		}
		
		boolean isFound = false;
		
		for (int i = 0; i <= n - m && !isFound; i++) {
			for (int j = 0; j <= n - m && !isFound; j++) {
				boolean shouldContinue = true;
				for (int x = 0; x < m && shouldContinue; x++) {
					for (int y = 0; y < m && shouldContinue; y++) {
						shouldContinue = a[i + x][j + y] == b[x][y];
					}
				}
				if (shouldContinue) {
					isFound = true;
				}
			}
		}
		
		System.out.println(isFound ? "Yes" : "No");
	}
}