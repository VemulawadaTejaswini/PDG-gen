
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//宣言文
		//標準入力オブジェクトを生成
		Scanner sc = new Scanner(System.in);
		//標準入力で以下の変数を初期化
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		int numberC = sc.nextInt();
		int numberX = sc.nextInt();
		//和変数
		int sumNum = 0;
		//フラグ変数
		int flagNum = 0;

		//処理文
		for(int i = 0; i <= numberA; i++) {
			for(int j = 0; j <= numberB; j++) {
				for(int k = 0; k <= numberC; k++) {
					sumNum = ((500 * i) + (100 * j) + (50 * k));
					if(numberX == sumNum) {
						flagNum++;
					}
				}
			}
		}
			//標準出力
			System.out.print(flagNum);
	}
}
