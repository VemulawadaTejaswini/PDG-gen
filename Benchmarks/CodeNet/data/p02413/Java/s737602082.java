import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c + 1];

		// ????????????
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// ????¨?
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][c] += arr[i][j];
			}
		}

		// ????????????
		for (int i = 0; i < r; i++) {
			for (int j = 0; j <= c; j++) {
				if (j != c) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.println(arr[i][j]);
				}
			}
		}

	}

}