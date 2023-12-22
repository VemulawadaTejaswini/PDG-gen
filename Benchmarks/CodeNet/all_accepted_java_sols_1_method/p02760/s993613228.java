import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] bingo = new int [3][3];  //ビンゴカードを表す配列
		int[][] bingoCheck = new int[3][3];  //当たりをチェックするための配列
		//ビンゴカードの入力
		for(int x=0 ; x<3 ; x++) {
			for(int y=0 ; y<3 ; y++) {
				bingo[x][y] = sc.nextInt();
			}
		}
		//抽選番号の個数の入力と、配列に抽選番号の入力
		int sum = sc.nextInt();
		int num[] = new int[sum];
		for(int i=0 ; i<sum ; i++) {
			num[i] = sc.nextInt();
		}
		//抽選番号とカード内とで、同じ数字があるか判断
		for(int i=0 ; i<sum ; i++) {
			for(int x=0 ; x<3 ; x++) {
				for(int y=0 ; y<3 ; y++) {
					if(bingo[x][y]==num[i]) {
						//bingoCheckのあたりの場所に+1する
						bingoCheck[x][y]=1;
					}
				}
			}
		}
		//ビンゴのパターン
		int pattern1 = bingoCheck[0][0] + bingoCheck[0][1] + bingoCheck[1][2];  //縦1列目
		int pattern2 = bingoCheck[1][0] + bingoCheck[1][1] + bingoCheck[1][2];  //縦2列目
		int pattern3 = bingoCheck[2][0] + bingoCheck[2][1] + bingoCheck[2][2];  //縦3列目
		int pattern4 = bingoCheck[0][0] + bingoCheck[1][1] + bingoCheck[2][2];  //ななめ右下
		int pattern5 = bingoCheck[2][0] + bingoCheck[1][1] + bingoCheck[0][2];  //ななめ左下
		int pattern6 = bingoCheck[0][0] + bingoCheck[1][0] + bingoCheck[2][0];  //横1列目
		int pattern7 = bingoCheck[0][1] + bingoCheck[1][1] + bingoCheck[1][2];  //横2列目
		int pattern8 = bingoCheck[0][2] + bingoCheck[1][2] + bingoCheck[2][2];  //横3列目

		//いずれかのパターンが3であればビンゴになっている
		if(pattern1==3 || pattern2==3 || pattern3==3 || pattern4==3 || pattern5==3 || pattern6==3 || pattern7==3 || pattern8==3) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}
}
