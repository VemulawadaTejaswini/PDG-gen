import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		
		int[][] cell = new int[r][c];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				cell[i][j] = scanner.nextInt();
		}
		
		int[] csum = new int[c];
		
		for (int i = 0; i < r; i++) {
			int rsum = 0;
			for (int j = 0; j < c; j++) {
				rsum += cell[i][j];
				csum[j] += cell[i][j];
				System.out.print(cell[i][j] + " ");
			}
			System.out.println(rsum);
		}
		int sum = 0;
		for (int i = 0; i < c; i++) {
			sum += csum[i];
			System.out.print(csum[i] + " ");
		}
		System.out.println(sum);

	}

}

