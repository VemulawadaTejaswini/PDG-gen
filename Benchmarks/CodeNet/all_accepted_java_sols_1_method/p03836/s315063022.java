import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		//1度目の往復 正方形を描くように移動する
		for (int i = 0; i < tx - sx; i++) {
			System.out.print("R");
		}
		for (int i = 0; i < ty - sy; i++) {
			System.out.print("U");
		}
		for (int i = 0; i < tx - sx; i++) {
			System.out.print("L");
		}
		for (int i = 0; i < ty - sy; i++) {
			System.out.print("D");
		}

		//2度目の往復 一度外側に移動して、1度目の正方形を囲むように移動する
			System.out.print("D");

		for (int i = 0; i < tx - sx + 1; i++) {
			System.out.print("R");
		}
		for (int i = 0; i < ty - sy + 1; i++) {
			System.out.print("U");
		}

			System.out.print("L");
			System.out.print("U");

		for (int i = 0; i < tx - sx + 1; i++) {
			System.out.print("L");
		}
		for (int i = 0; i < ty - sy + 1; i++) {
			System.out.print("D");
		}

			System.out.print("R");
	}
}