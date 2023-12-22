import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] grid = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		int[] x12 = new int[3];
		int[] x13 = new int[3];
		int[] x23 = new int[3];
		int[] y12 = new int[3];
		int[] y13 = new int[3];
		int[] y23 = new int[3];
		
		for (int i = 0; i < 3; i++) {
			x12[i] = grid[i][0] - grid[i][1];
			x13[i] = grid[i][0] - grid[i][2];
			x23[i] = grid[i][1] - grid[i][2];
			y12[i] = grid[0][i] - grid[1][i];
			y13[i] = grid[0][i] - grid[2][i];
			y23[i] = grid[1][i] - grid[2][i];
		}
		boolean flag = true;
		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (x12[i] != x12[j]) {
					flag = false;
					break;
				}
				if (x13[i] != x13[j]) {
					flag = false;
					break;
				}
				if (x23[i] != x23[j]) {
					flag = false;
					break;
				}
				if (y12[i] != y12[j]) {
					flag = false;
					break;
				}
				if (y13[i] != y13[j]) {
					flag = false;
					break;
				}
				if (y23[i] != y23[j]) {
					flag = false;
					break;
				}
			}
			if (!flag) {
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
