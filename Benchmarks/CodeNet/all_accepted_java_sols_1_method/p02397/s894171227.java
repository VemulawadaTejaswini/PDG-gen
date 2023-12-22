import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//入力される整数

		for (int i = 0; i < 3000; i++) {//データセットの個数
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x == 0 && y == 0) {
				break;
			} else if (x <= y) {
				System.out.println(x + " " + y);
			} else if (x > y) {
				System.out.println(y + " " + x);

			}

		}

	}

}

