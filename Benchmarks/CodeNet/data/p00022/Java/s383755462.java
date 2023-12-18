import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 1;
		while ((n = sc.nextInt()) != 0) {
			long[][] a = new long[2][5000];
			for (int j = 0 ; j < n ; j++) {
				a[1][j] = a[0][j] = sc.nextLong();
			}

			long max = Long.MIN_VALUE;
			for (int i = 1 ; i < n ; i++) {
				for (int j = 0 ; j < n-i ; j++) {
					long l = a[1][j] += a[0][i+j];
					max = Math.max(max, l);
				}
			}
			System.out.println(max);

		}


	}
}