//Scannerクラスをimport
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		//標準入力はSystemクラスのinフィールドから取得できる
		Scanner sc = new Scanner(System.in);

		//nextIntにて整数を取得
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + b/2);
	}

}
