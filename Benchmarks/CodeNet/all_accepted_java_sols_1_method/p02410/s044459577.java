import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] matrix = new int[n][m];
			int[] vector = new int[m];
			int[] product = new int[n];

			IntStream.range(0, n).forEachOrdered(i -> {
				IntStream.range(0, m).forEachOrdered(j -> matrix[i][j] = sc.nextInt());
			});
			IntStream.range(0, m).forEachOrdered(i -> vector[i] = sc.nextInt());

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					product[i] += matrix[i][j] * vector[j];
				}
			}
			IntStream.range(0, n).forEachOrdered(i -> System.out.println(product[i]));
		}
	}
}
