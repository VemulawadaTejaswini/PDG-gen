import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			int[][] matrixA = new  int[n][m];
			int[][] matrixB = new  int[m][l];

			IntStream.range(0, n).forEachOrdered(i -> {
				IntStream.range(0, m).forEachOrdered(j -> matrixA[i][j] = sc.nextInt());
			});
			IntStream.range(0, m).forEachOrdered(i -> {
				IntStream.range(0, l).forEachOrdered(j -> matrixB[i][j] = sc.nextInt());
			});
			
			for (int i = 0; i < n; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < l; j++) {
					long sum = 0;
					for (int k = 0; k < m;k++) {
						sum += matrixA[i][k] * matrixB[k][j];
					}
					sb.append(sum + " ");
				}
				System.out.println(sb.toString().trim());
			}
			
		}
	}
}
