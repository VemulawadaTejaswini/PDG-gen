import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[][][] man_num;
		man_num = new int[4][3][10];

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();

			man_num[b - 1][f - 1][r - 1] = man_num[b - 1][f - 1][r - 1] + v;
		}
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" "+man_num[0][i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" "+man_num[1][i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" "+man_num[2][i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" "+man_num[3][i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}