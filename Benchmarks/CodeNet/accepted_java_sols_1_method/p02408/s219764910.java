import java.util.Scanner;

class Main{
	public static void main(String[] args){
		int MAX_NUM = 13;	// カード番号の最大値
		Scanner scan = new Scanner(System.in);
		int i, j;
		// インプット用配列
		int[][] input_cards = new int[4][13];
		int mark = 0;	// カードの記号
		int num = 0;	// カードの番号
		String str = scan.nextLine();
		String[] input_card = new String[2];
		// ループカウンタ用変数
		int cards_amount = Integer.parseInt(str);

		// S=0 H=1 C=2 D=3
		// input_cardsに値を突っ込む
		for(i=0; i < cards_amount; i++){
			str = scan.nextLine();
			input_card = str.split(" ");

			// 0番目要素でアルファベット判別
			if(input_card[0].equals("S")){
				mark = 0;
			} else if(input_card[0].equals("H")){
				mark = 1;
			} else if(input_card[0].equals("C")){
				mark = 2;
			} else if(input_card[0].equals("D")){
				mark = 3;
			} else{
				System.out.println("不正な値が入力されました。\n処理を終了します。");
				break;
			}
			// 1番目要素で数字変換
			num = Integer.parseInt(input_card[1]);
			if(MAX_NUM < num){
				System.out.println("不正な値が入力されました。\n処理を終了します。");
				break;
			}

			input_cards[mark][num-1] = num;
		}
		// input_cardsが0の要素で出力
		for(i=0; i < 4; i++){
			for(j=0; j<MAX_NUM; j++){
				if(input_cards[i][j] == 0){
					switch(i){
						case 0:
							System.out.println("S "+ (j+1));
							break;
						case 1:
							System.out.println("H "+ (j+1));
							break;
						case 2:
							System.out.println("C "+ (j+1));
							break;
						case 3:
							System.out.println("D "+ (j+1));
							break;

					}
				}
			}
		}

	}
}
