import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int i;
			int j;

			int n = sc.nextInt();
			int m = sc.nextInt();

			int A[][] = new int[n][m];
			int b[] = new int[m];
			int c[] = new int[n];

			for(i = 0; i < n; i++) {
				for(j = 0; j < m; j++) {
					int a_ij = sc.nextInt();
					A[i][j] = a_ij;
				}
			}

			for(i = 0; i < m; i++) {
				int b_i = sc.nextInt();
				b[i] = b_i;
			}

			for(i = 0; i < n; i++) {
				for(j = 0; j < m; j++) {
					c[i] = c[i] + A[i][j] * b[j];
				}
				System.out.println(c[i]);
			}

	}
}