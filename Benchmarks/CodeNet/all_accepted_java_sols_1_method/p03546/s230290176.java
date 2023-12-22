import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		int[][] c = new int[10][];

		for (int i = 0; i < 10; i++) {
			c[i] = new int[10];
			for (int j = 0; j < 10; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		int[][] a = new int[h][];

		for (int i = 0; i < h; i++) {
			a[i] = new int[w];
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (c[i][j] > c[i][k] + c[k][j]) {
						c[i][j] = c[i][k] + c[k][j];
					}
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] >= 0) {
					sum += c[a[i][j]][1];
				}
			}
		}
		System.out.println(sum);
	}

}
