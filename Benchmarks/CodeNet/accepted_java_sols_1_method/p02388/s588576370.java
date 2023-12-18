import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//入力
		int x = sc.nextInt();

		//処理
		int ans = 0;
		ans = x * x * x;

		//出力
		System.out.println(ans);

	}

}

