import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			// 繰り返し(初期値; 終了条件; 増分)

				//i=i/10;

			if (i % 3 == 0 || i % 10 == 3 || i/10==3) {
				// 3で割り切れる数、もしくは一桁目が3であるとき

				int[] data = { i };
				// iがdataに格納
				for (int data1 : data) {
					System.out.print(" " + data1);
					// data1を出力
				}
				// i = i / 10;
			}
		}
	}
	 System.out.println("");
}
