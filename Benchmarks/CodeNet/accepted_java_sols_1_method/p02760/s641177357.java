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
		for(int i=0 ; i<sum ; i++) {
			num[i] = sc.nextInt();
		}
		//
		for(int i=0 ; i<sum ; i++) {
			for(int x=0 ; x<3 ; x++) {
				for(int y=0 ; y<3 ; y++) {
					if(bingo[x][y]==num[i]) {
						bingo[x][y]=1;
					}
				}
			}
		}
		//ビンゴのパターン
		int pattern1 = bingo[0][0] + bingo[0][1] + bingo[1][2];  //縦1列目
		int pattern2 = bingo[1][0] + bingo[1][1] + bingo[1][2];  //縦2列目
		int pattern3 = bingo[2][0] + bingo[2][1] + bingo[2][2];  //縦3列目
		int pattern4 = bingo[0][0] + bingo[1][1] + bingo[2][2];  //ななめ右下
		int pattern5 = bingo[2][0] + bingo[1][1] + bingo[0][2];  //ななめ左下
		int pattern6 = bingo[0][0] + bingo[1][0] + bingo[2][0];  //横1列目
		int pattern7 = bingo[0][1] + bingo[1][1] + bingo[1][2];  //横2列目
		int pattern8 = bingo[0][2] + bingo[1][2] + bingo[2][2];  //横3列目

		if(pattern1==3 || pattern2==3 || pattern3==3 || pattern4==3 || pattern5==3 || pattern6==3 || pattern7==3 || pattern8==3) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}
}
