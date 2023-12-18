import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int[][] a = new int[h][w];
		for (int i = 0; i < a.length; i++) {
			Arrays.fill(a[i], -1);
		}
		for (int i = 0; i < h; i++) {
			String string = scanner.next();
			for (int j = 0; j < w; j++) {
				if (string.charAt(j) == 'c') {
					a[i][j] = 0;
					for (int k = j + 1, l = 1; k < w; k++, l++) {
						a[i][k] = l;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
				if (j != a[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}

