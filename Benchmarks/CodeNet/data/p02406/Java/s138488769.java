import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//入力
		int x = sc.nextInt();

		//処理
		for(int i=1; i<=x; i++) {
			String str_i = String.valueOf(i);
			String serch_num = "3";
			if(str_i.indexOf(serch_num) != -1) {
				//3のつく数字を表示(数値を文字列化し、文字検索を行う)
				System.out.print(" " + i);
			}else if(i%3==0) {
				//3の倍数のみを表示
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}
}

