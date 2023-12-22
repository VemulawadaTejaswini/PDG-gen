import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i, j;
		int[] sum = new int[n];
		int[] product = new int[m];
		int[][] A = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[i].length; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for (j = 0; j < b.length; j++) {
			b[j] = sc.nextInt();
		}
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[i].length; j++) {
				product[j] = A[i][j] * b[j];
				sum[i] += product[j];
			}
			c[i] = sum[i];
		}
		for (i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		sc.close();
	}
}
