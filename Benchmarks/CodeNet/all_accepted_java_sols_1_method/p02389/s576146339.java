import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		//処理
		int menseki = 0;
		int syuu = 0;

		menseki = a * b;
		syuu = (a + b) * 2;

		//出力
		System.out.println(menseki +" "+ syuu);

	}

}

