import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(); //長方形X軸
		int H = sc.nextInt(); //長方形Y軸
		int x = sc.nextInt(); //円の中心X軸
		int y = sc.nextInt(); //円の中心Y軸
		int r = sc.nextInt(); //円の半径

		if ((r * 2) > W || (r * 2) > H) {//半径の倍≦辺
			System.out.println("No");

		} else if ((0 >= x || x > W) || (0 >= y || y > H)) {//円の中心が正の値
			System.out.println("No");

		} else if (((x + r) > W) || ((y + r) > H)) {//円の中心＋半径＜辺
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}

