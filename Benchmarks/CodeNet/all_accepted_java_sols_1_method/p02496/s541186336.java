import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();

		boolean[][] card = new boolean[4][13];
		String[] cord = {"S", "H", "C", "D"};

		// 配列の初期化
		for (int i = 0; i < card.length; i++){
			for (int j = 0; j < card[i].length; j++){
				card[i][j] = false;
			}
		}

		// カードの有無を判定
		for (int i = 0; i < length; i++){
			String c = sc.next();
			int n = sc.nextInt() - 1;

			for (int j = 0; j < 4; j++){
				if (c.equals(cord[j])){
					card[j][n] = true;
				}
			}
		}

		// 出力
		for (int i = 0; i < card.length; i++){
			for (int j = 0; j < card[i].length; j++){
				if (!card[i][j]){
					System.out.println(cord[i] + " " + (j + 1));
				}
			}
		}
	}
}