import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int i;
			int j;

			int array1[][] = new int[3][10];
			int array2[][] = new int[3][10];
			int array3[][] = new int[3][10];
			int array4[][] = new int[3][10];

			for(i = 0; i < 3; i++) {
				for(j = 0; j < 10; j++) {
					array1[i][j] = 0;
					array2[i][j] = 0;
					array3[i][j] = 0;
					array4[i][j] = 0;
				}
			}

			int n = sc.nextInt();
			for(i = 0; i < n; i++) {

				int b = sc.nextInt();
				int f = sc.nextInt();
				int r = sc.nextInt();
				int v = sc.nextInt();

				if(b == 1) {
					array1[f - 1][r - 1] += v;

					if(array1[f - 1][r - 1] < 0) {
						array1[f - 1][r - 1] = 0;
					}

					if(array1[f - 1][r - 1] > 9) {
						array1[f - 1][r - 1] = 9;
					}
				}

				if(b == 2) {
					array2[f - 1][r - 1] += v;

					if(array2[f - 1][r - 1] < 0) {
						array2[f - 1][r - 1] = 0;
					}

					if(array2[f - 1][r - 1] > 9) {
						array2[f - 1][r - 1] = 9;
					}
				}

				if(b == 3) {
					array3[f - 1][r - 1] += v;

					if(array3[f - 1][r - 1] < 0) {
						array3[f - 1][r - 1] = 0;
					}

					if(array3[f - 1][r - 1] > 9) {
						array3[f - 1][r - 1] = 9;
					}
				}

				if(b == 4) {
					array4[f - 1][r - 1] += v;

					if(array4[f - 1][r - 1] < 0) {
						array4[f - 1][r - 1] = 0;
					}

					if(array4[f - 1][r - 1] > 9) {
						array4[f - 1][r - 1] = 9;
					}
				}

			}

			for(i = 0; i < 3; i++) {
				for(j = 0; j < 10; j++) {
					System.out.print(" " + array1[i][j]);
				}
				System.out.println();
			}
			System.out.println("####################");

			for(i = 0; i < 3; i++) {
				for(j = 0; j < 10; j++) {
					System.out.print(" " + array2[i][j]);
				}
				System.out.println();
			}
			System.out.println("####################");

			for(i = 0; i < 3; i++) {
				for(j = 0; j < 10; j++) {
					System.out.print(" " + array3[i][j]);
				}
				System.out.println();
			}
			System.out.println("####################");

			for(i = 0; i < 3; i++) {
				for(j = 0; j < 10; j++) {
					System.out.print(" " + array4[i][j]);
				}
				System.out.println();
			}

	}
}