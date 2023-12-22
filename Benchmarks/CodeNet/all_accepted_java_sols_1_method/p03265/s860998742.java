import java.util.Scanner;

public class Main {

	// 108-B
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		// (x1,y1)から(x2,y2)への移動距離を求める
		int mx = x2 - x1;
		int my = y2 - y1;
		// x2,y2を移動距離分移動
		int tmpx = x2 + mx;
		int tmpy = y2 + my;
		// (x2,y2)を中心に90度回転
		int x3 = (int) ((tmpx - x2) * Math.cos(90 * Math.PI / 180)) - (int) ((tmpy - y2) * Math.sin(90 * Math.PI / 180)) + x2;
		int y3 = (int) ((tmpx - x2) * Math.sin(90 * Math.PI / 180)) + (int) ((tmpy - y2) * Math.cos(90 * Math.PI / 180)) + y2;

		// (x1,y1)から(x2,y2)への移動距離を求める
		mx = x3 - x2;
		my = y3 - y2;
		// x3,y3を移動距離分移動
		tmpx = x3 + mx;
		tmpy = y3 + my;
		// (x3,y3)を中心に90度回転
		int x4 = (int) ((tmpx - x3) * Math.cos(90 * Math.PI / 180)) - (int) ((tmpy - y3) * Math.sin(90 * Math.PI / 180)) + x3;
		int y4 = (int) ((tmpx - x3) * Math.sin(90 * Math.PI / 180)) + (int) ((tmpy - y3) * Math.cos(90 * Math.PI / 180)) + y3;

		System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));

		sc.close();
	}
}