public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int[][] matrix = new  int[r+1][c+1];
			
			for (int i = 0; i < matrix.length; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < matrix[i].length; j++) {
					if (i < r) {
						if (j < c) {
							matrix[i][j] = sc.nextInt();
							matrix[i][c] += matrix[i][j];
						}
						matrix[r][j] += matrix[i][j];
					}
					sb.append(matrix[i][j] + " ");
				}
				System.out.println(sb.toString().trim());
			}
			
		}
	}
}
