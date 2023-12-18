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
			for(int i=1; i<H+1; i++) {
				if(i%2==0) {//偶数行目(2で割り切れる行数)の時
					for(int j=1; j<W+1; j++) {
						if(j%2==0) {//偶数列目(2で割り切れる列数)の時
							System.out.print("#");
						}else {//奇数列目(2で割り切れる列数)の時
							System.out.print(".");
						}
					}
					System.out.println();
				}else {//奇数行目(2で割り切れない行数)の時
					for(int j=1; j<W+1; j++) {
						if(j%2==0) {//偶数列目(2で割り切れる列数)の時
							System.out.print(".");
						}else {//奇数列目(2で割り切れる列数)の時
							System.out.print("#");
						}
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}

