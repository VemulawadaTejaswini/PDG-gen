import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//入力
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		//処理
		int max_W = W - r;
		int max_H = H - r;
		if(r <= x && x <= max_W && r <= y && y <= max_H) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

