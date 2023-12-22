public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		String[] data = sc.nextLine().split(" ");
		int n = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);

		int[][] A = new int[n][m];
		int[] v = new int[m];

		for (int i=0; i<n; i++) {
			data = sc.nextLine().split(" ");

			for (int j=0; j<m; j++) {
				A[i][j] = Integer.parseInt(data[j]);
			}
		}

		for (int i=0; i<m; i++) {
			v[i] = sc.nextInt();
		}

		for (int i=0; i<n; i++) {

			int sum = 0;
			for (int j=0; j<m; j++) {
				sum += A[i][j] * v[j];
			}

			System.out.println(sum);

		}
	}

}