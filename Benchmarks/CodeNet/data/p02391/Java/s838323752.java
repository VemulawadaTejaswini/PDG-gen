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
		if(a < b) {
			System.out.println("a < b");
		}else if(a > b) {
			System.out.println("a > b");
		}else {
			// a = b のとき
			System.out.println("a == b");
		}

	}

}

