
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//宣言文
		//標準入力オブジェクトを生成
		Scanner sc = new Scanner(System.in);
		//標準入力で以下の変数を初期化
		int number = sc.nextInt();
		int[] numArray = new int[number];
		for(int i = 0; i < numArray.length; ++i) {
			numArray[i] = sc.nextInt();
		}
		sc.close();
		//カウント変数
		int countNum = 0;
		boolean flagNum = true;
		
		do {
			for(int i = 0; i < numArray.length; i++) {
				//全て偶数か判定
				if(!(numArray[i]%2 == 0)){
					flagNum = false;
					break;
				}
				//割る２する処理を流す。
				numArray[i] = numArray[i] / 2;
			}
			//全体の処理をカウント
			if(flagNum) {
				countNum++;
			}
		}while(flagNum);//全て偶数なら繰り返す
			//標準出力
			System.out.print(countNum);
	}
}
