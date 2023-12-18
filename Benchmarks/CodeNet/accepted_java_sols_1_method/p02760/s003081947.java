import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] bingo = new int [3][3];
		//ビンゴカードの入力
		for(int x=0 ; x<3 ; x++) {
			for(int y=0 ; y<3 ; y++) {
				bingo[x][y] = sc.nextInt();
			}
		}

		//抽選番号の個数の入力と、配列に抽選番号を入力
		int sum = sc.nextInt();
		int num[] = new int[sum];
		int[][] bingoCheck = new int[3][3];  //チェック用
		//配列に
		for(int i=0 ; i<sum ; i++) {
			num[i] = sc.nextInt();
			//カードと抽選番号で同じ数字があれば
			//その場所のビンゴチェックに1を足す
			for(int x=0 ; x<3 ; x++) {
				for(int y=0 ; y<3 ; y++) {
					if(num[i] == bingo[x][y]) {
						bingoCheck[x][y] = 1;
					}
				}
			}
		}
		//結果を表す変数を宣言
		boolean result = false;

		//縦の当たり確認
		//x軸が0、1、2、の場合ごとにcheckが3になるか見てる
		for(int x=0 ; x<3 ; x++) {
			int check = 0;  //xの値ごとにチェックをリセットする
			for(int y=0 ; y<3 ; y++) {
				check += bingoCheck[x][y];
			}
			if(check == 3) {
				result = true;
			}
		}

		//横の当たり確認
		//y軸が0、1、2、の場合ごとにcheckが3になるか見てる
		for(int y=0 ; y<3 ; y++) {
			int check = 0;  //yの値ごとにチェックをリセットする
			for(int x =0 ; x<3 ; x++) {
				check += bingoCheck[x][y];
			}
			if(check == 3) {
				result = true;
			}
		}

		//斜めの当たり確認
		int check = 0;  //1パターンしかないからこの場所でOK
		for(int x=0 ; x<3 ; x++) {
			check += bingoCheck[x][x];
		}
		if(check == 3) {
			result = true;
		}

		//反対の斜めの当たり判断
		check = 0;  //1パターンしかないからこの場所でOK
		for(int y=0 ; y<3 ; y++) {
			check += bingoCheck[y][2-y];
		}
		if(check == 3) {
			result = true;
		}

		//結果の表示
		System.out.print(result ? "Yes" : "No");
		sc.close();
	}
}