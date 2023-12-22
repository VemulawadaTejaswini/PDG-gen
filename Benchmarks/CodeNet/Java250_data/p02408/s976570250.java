
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */
		Scanner scan = new Scanner(System.in);

		//boolean型で2次元配列を作成
		boolean[][] cards = new boolean[4][13];

		//char型でmarkの配列を作成
		//※char型は''(シングルクォーテーション)で指定
		//表示用にのみ使う予定
		char[] mark = {'S','H','C','D'};

		//入力した枚数
		int n = scan.nextInt();

		for (int i=0; i < n; i++){
			/* scan.next().charAt(0)
			 * next()で文字を読み込み
			 * charAt(0)で0番目を取得
			 */
			char ch = scan.next().charAt(0);
			/* nextで指定することでD 8等のものが
			 * ↑の.nextにDが、↓の.nextに8を別々に入れられる
			 */
			int num = Integer.parseInt(scan.next());

			/* switch文の出番
			 * chがcaseと一緒ならcardsの[0](つまりS)にnum-1を行う
			 * これを各cardsのマークの種類分行う
			 */

			switch (ch){
			case 'S': cards[0][num-1] = true; break;
			case 'H': cards[1][num-1] = true; break;
			case 'C': cards[2][num-1] = true; break;
			case 'D': cards[3][num-1] = true; break;
			}
		}
		//Scannerを閉じることで黄色い注意マークが消える？
		scan.close();

		/*for文
		 * 二重for文でiでマーク数を、jで値を回して
		 * cardsの[0][0]から[12][12]まで調べて
		 * ないものを逆論理で見つけて表示している
		 */
		for (int i=0; i < 4; i++){
			for (int j =0; j < 13; j ++){
				if(!cards[i][j]){
					//※jに+1しているのは配列が0から始まるため
					//トランプに0はないのと全数値がずれてしまうため
					//markの[i]番目を指定するため、問題の指定通り
					//S,H,C,Dの順番で表示される
					System.out.println(mark[i] + " " + (j + 1));
				}
			}
		}
    }
}