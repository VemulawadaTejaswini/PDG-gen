import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 宣言
		double money = 100000;
		final double rate = 1.05;
		int amari = 0;

		// 文字列の入力
		 BufferedReader input = new BufferedReader(new
		 InputStreamReader(System.in), 1);
		 int week = Integer.parseInt(input.readLine());

		for (int i = 1; i <= week; i++) {
			// 5%の利子を加算
			money = money * rate;
			//1000円で割ってあまりがあれば千を切り上げ、余りは引いて端数を無くす
			amari = (int) money % 1000;
			if (amari != 0) {
				money = money + 1000;
				money = money - amari;
			}
		}
		System.out.println((int)money);
	}
}