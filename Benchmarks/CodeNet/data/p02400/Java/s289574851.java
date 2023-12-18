import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		double r = sc.nextInt();
		double Pi = Math.PI;
		double menseki = r * r * Pi;
		double syuu = 2 * r * Pi;

		//出力
		System.out.println(menseki +" "+ syuu);

	}

}

