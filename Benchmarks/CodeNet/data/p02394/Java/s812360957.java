import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		// 標準入力からデータを読み込む準備
		Scanner sc = new Scanner(System.in);
		// 2つの文字の固まりをそれぞれ整数値と想定して読み込む
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		if (x >= r && y >= r && x + r <= W && y + r <= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
