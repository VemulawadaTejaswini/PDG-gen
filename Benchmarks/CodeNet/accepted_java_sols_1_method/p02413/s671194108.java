import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int table[][] = new int[r+1][c+1];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				table[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				sum += table[i][j];
			}
			table[i][c] = sum;
		}

		for (int i = 0; i < c + 1; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {
				sum += table[j][i];
			}
			table[r][i] = sum;
		}
		
		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				System.out.print(table[i][j]);
				if (j != c) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		scan.close();
	}

}