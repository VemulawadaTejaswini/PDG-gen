import java.util.Scanner;

public class Main {

	// 106-A
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int totalArea = a * b;
		int verticalPathArea = a * 1;
		int horizontalPathArea = 1 * b;

		// 全体面積から縦の道と横の道の面積を引き、重複分(1*1)の面積を追加する
		System.out.println(totalArea - verticalPathArea - horizontalPathArea + 1);

		sc.close();
	}
}