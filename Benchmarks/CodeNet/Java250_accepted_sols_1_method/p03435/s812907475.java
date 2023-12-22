
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] c1 = sc.nextLine().split(" ");
		String[] c2 = sc.nextLine().split(" ");
		String[] c3 = sc.nextLine().split(" ");
		int[][] grid = new int[][] { { Integer.valueOf(c1[0]), Integer.valueOf(c2[0]), Integer.valueOf(c3[0]) },
				{ Integer.valueOf(c1[1]), Integer.valueOf(c2[1]), Integer.valueOf(c3[1]) },
				{ Integer.valueOf(c1[2]), Integer.valueOf(c2[2]), Integer.valueOf(c3[2]) } };
		int[] x = new int[3];
		int[] y = new int[3];
		x[0] = 0;
		for (int i = 0; i < 3; i++)
			y[i] = grid[0][i] - x[0];
		for (int i = 0; i < 3; i++)
			x[i] = grid[i][0] - y[0];
		String ans = "Yes";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (x[i] + y[j] != grid[i][j])
					ans = "No";
			}
		}
		System.out.println(ans);
		sc.close();
	}
}