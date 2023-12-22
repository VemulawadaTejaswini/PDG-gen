import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1, a2, a3, b1, b2, b3;
		int[][] grid = new int[3][3];
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		String res = "No";
		for (a1=0; a1<=grid[0][0]; a1++) {
			b1 = grid[0][0] - a1;
			b2 = grid[0][1] - a1;
			b3 = grid[0][2] - a1;
			a2 = grid[1][0] - b1;
			a3 = grid[2][0] - b1;
			if (a2+b2 == grid[1][1]
					&& a2+b3 == grid[1][2]
					&& a3+b2 == grid[2][1]
					&& a3+b3 == grid[2][2]) res = "Yes"; 
		}
		System.out.println(res);
	}
}
