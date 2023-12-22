import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//キーボード入力メソッド
		Scanner sc = new Scanner(System.in);

		//変数宣言
		int H = 1;
		int W = 1;


		while(true) {
			//HとWを手動入力
			H = sc.nextInt();
			W = sc.nextInt();

			//HとWがともに0のとき、処理を抜ける
			if(H == 0 && W == 0) {
				break;
			}

			//図形作成
			for(int i=0; i<H; i++) {
				for(int j=0; j<W; j++) {
					if(i==0 || i==H-1 || j==0 || j==W-1) {
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();

		}


	}

}

