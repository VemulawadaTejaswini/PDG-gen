import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Player = sc.nextInt();
		int score[] = new int [Player];
		int point[][] = new int [Player][3];
		int work[][] = new int [Player][3];
		for(int i = 0; i < Player; i++){
			score[i] = 0;
			for(int j = 0; j < 3; j++){
				point[i][j] = sc.nextInt();
				work[i][j] = point [i][j];
			}
		}
		for(int j = 0; j < 3; j++){
			for(int i = 0; i < Player; i++){
				for(int k = 0; k < Player; k++){
					if(point[i][j]==point[k][j] && i != k){//同じ数値だった場合
						work[i][j]= 0;					//
					}
				}
			}
		}
		for(int i = 0; i < Player; i++){
			for(int j = 0; j < 3; j++){
				score[i] += work[i][j];		//最終集計
			}
		}

		for(int i = 0; i < Player; i++){
			System.out.println(score[i]);		//結果の出力
		}
	}

}