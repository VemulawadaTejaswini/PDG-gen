import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] detA = new int[n][m];
		int[][] detB = new int[m][l];

		for (int i = 0; i < detA.length; i++) {
			for (int j = 0; j < detA[i].length; j++) {
				detA[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < detB.length; i++) {
			for (int j = 0; j < detB[i].length; j++) {
				detB[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				long sum = 0;
				for (int k = 0; k < m; k++) {
					sum += detA[i][k] * detB[k][j];
				}
				System.out.print(sum);
				if (j == l - 1)
					continue;
				System.out.print(" ");
			}
			System.out.println();
		}

		scan.close();
	}
}