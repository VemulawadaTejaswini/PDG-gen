import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;

		int[] b = new int[m];
		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				for (int j = 0; j < m; j++) {
					b[j] = sc.nextInt();
				}
			}
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			int calc = 0;
			for (int j = 0; j < m; j++) {
				calc += b[j] * a[i][j];
			}
			if (calc + c > 0) {
				count++;
			}


		}



		System.out.println(count);


	}

}
