import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (; sc.hasNext();) {

			int n = sc.nextInt();
			int x = sc.nextInt();

			//	          int n = Integer.parseInt(args[in]);
			//	          int x = Integer.parseInt(args[in+1]);

			if (n == 0 && x == 0) {
				break;
			}
			int count = 0;

			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					for (int k = j + 1; k <= n; k++) {
						if (i + j + k == x) { //異なる3種類の数字が入力値を満たしたらカウント
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}

	}

}

