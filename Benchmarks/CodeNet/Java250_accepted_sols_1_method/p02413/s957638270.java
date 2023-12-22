import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();
		int c = scan.nextInt();

		int[][] table = new int[r][c + 1];

		for(int i = 0; i < r; i++) {
			int sum = 0;
			for(int j = 0; j < c; j++) {
				table[i][j] = scan.nextInt();
				sum += table[i][j];
				System.out.printf(table[i][j] + " ");
			}
			table[i][c] = sum;
			System.out.println(sum);
		}

		for(int i = 0; i < c + 1; i++) {
			int sum = 0;
			for(int j = 0; j < r; j++) {
				sum += table[j][i];
			}
			if(i != 0) {
				System.out.printf(" ");
			}
			System.out.printf(sum + "");
		}
		
		System.out.println();

		scan.close();
	}
}
