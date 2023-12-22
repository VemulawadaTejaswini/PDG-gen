import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int arr[][] = new int[300][2];
		int i = 0, j = 0, count = 0;
		for (i = 0; i < 300; i++) {
			arr[i][0] = stdin.nextInt();
			arr[i][1] = stdin.nextInt();
			if (arr[i][0] == 0 && arr[i][1] == 0) {
				count = i;
				break;
			}
		}
		for (int k = 0; k < count; k++) {
			int row = arr[k][0];
			int col = arr[k][1];
			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}