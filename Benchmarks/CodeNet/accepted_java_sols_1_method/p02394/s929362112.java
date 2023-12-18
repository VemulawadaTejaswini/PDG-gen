import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int W = sc.nextInt(); // 円のx座標
		int H = sc.nextInt(); // 円のy座標
		int x = sc.nextInt(); // 右上のx座標
		int y = sc.nextInt(); // 右上のy座標
		int r = sc.nextInt(); // 円の半径

        if (x - r >= 0 && y - r >=0 && x + r <= W && y + r <= H) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
