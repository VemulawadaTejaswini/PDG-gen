
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力データを変数で受け取る
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		//入力データを処理して、結果を出力
		int x = a * b;
		int y = c * d;

		if(x >= y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}

	}
}

