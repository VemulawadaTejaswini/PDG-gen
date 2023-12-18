import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//変数宣言
		int a = 0;
		String op = "";
		int b = 0;
		int ans = 0;

		while(true) {
			//値入力
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();

			//opが？の時に処理を終了する
			if(op.equals("?")) {
				break;
			}

			//opの値による条件分岐
			switch(op) {
			case "+":
				ans = a + b;
				break;
			case "-":
				ans = a - b;
				break;
			case "*":
				ans = a * b;
				break;
			case "/":
				if(b != 0) {
					ans = a/ b;
				}
				break;
			}

			//出力
			System.out.println(ans);
		}



	}

}

