import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		int x = 1;
		int i = 0;

		//xが0のとき、終了
		while(true) {
			x = sc.nextInt();
			i++;
			if(x == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + x);
		}
	}

}

