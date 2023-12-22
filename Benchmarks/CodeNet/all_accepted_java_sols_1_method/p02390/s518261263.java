import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//入力
		int S = sc.nextInt();

		//処理
		int h = 0;
		int m = 0;
		int s = 0;
		int amr = 0;

		h = S / (60 * 60);
		amr = S % (60 * 60);
		m = amr / 60;
		s = amr % 60;

		//出力
		System.out.println(h + ":" + m + ":" + s);

	}

}

