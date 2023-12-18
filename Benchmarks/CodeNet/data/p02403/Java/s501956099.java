import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		// テキスト入力
		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int width = sc.nextInt();

		// #を出す処理
		// 行の数
		for (int h = 0; h < height; h++) {

			// 列の数
			for (int w = 0; w < width; w++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}