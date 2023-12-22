public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine();

		int[][] mat = new int[r+1][c+1];

		for (int i=0; i < r; i++) {

			String[] data = sc.nextLine().split(" ");

			for (int j=0; j < c; j++) {
				mat[i][j] = Integer.parseInt(data[j]);

				mat[i][c] += mat[i][j];
				mat[r][j] += mat[i][j];
			}
			mat[r][c] += mat[i][c];

		}

		for (int i=0; i<r+1; i++) {

			for (int j=0; j<c; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.print(mat[i][c] + "\n");

		}
	}

}