import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int all = 0;
		int box[][] = new int[r + 2][c + 2];
		for (int i = 0; i < r; i++) {
			int totalc = 0;
			for (int j = 0; j < c; j++) {
				int d = scanner.nextInt();
				box[i][j] = d;
				totalc = totalc + d;
			}
			box[i][c] = totalc;
			all = totalc + all;

		}
		box[r][c] = all;
		for (int i = 0; i < c; i++) {
			int totalr = 0;
			for (int j = 0; j < r; j++) {
				totalr = box[j][i] + totalr;
			}
			box[r][i] = totalr;
		}
		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				System.out.print(box[i][j]);
				if(j!=c) {
					System.out.print(" ");
				}else {
					System.out.println();
				}
			}
			
		}

	}
}

