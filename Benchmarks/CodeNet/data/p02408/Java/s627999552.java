import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	 // 柄を数値化して多次元配列に使えるようにする
	static enum Mark {
	    S(0), H(1), C(2), D(3);//柄を数値化
	    //enumのコンストラクタはprivate以外だとコンパイルエラー
		private int id;//数値として指定
	    public int getId() {//取り出し用　getメソッドとコンストラクタの値はid指定が必須
	      return this.id;
	    }

	    private Mark (int id) {
	      this.id = id;
	    }
	  }


	public static void main(String[] args) throws NumberFormatException, IOException {
	    // 入力用
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	    // 柄と数字で多次元配列
	    boolean[][] checkInput = new boolean[4][13];//前者：柄　後者：数字

	    // 枚数用
	    int inputCards = Integer.parseInt(input.readLine());//合計枚数
	    int inputNumberOfCards; // 数字用

	    // 入力された合計枚数分ループ
	    for (int i = 0; i < inputCards; i++) {

	    	// 入力されたものを柄と数字に分ける
	      String[] inputCardsArray = (input.readLine()).split("\\s");//スペースで分割
	      // カードの数字
	      inputNumberOfCards = Integer.parseInt(inputCardsArray[1]);//数字部分を改めて配列化

	      // 柄ごとに場合分け
	      switch(Mark.valueOf(inputCardsArray[0])) {//文字列からenumへの変換
	      case S: // スペード
	        checkInput[0][(inputNumberOfCards -1)] = true;//数字は13だが0スタートなので-1
	        break;
	      case H: // ハート
	        checkInput[1][(inputNumberOfCards -1)] = true;
	        break;
	      case C: // クラブ
	        checkInput[2][(inputNumberOfCards -1)] = true;
	        break;
	      case D: // ダイヤ
	        checkInput[3][(inputNumberOfCards -1)] = true;
	        break;
	      }
	    }

	    // 柄のループ
	    for (int i = 0; i < Mark.values().length; i++) {
	      // 数字のループ
	      for (int j = 0; j < checkInput[1].length; j++) {
	        // 入力されなかったものを表示
	        if (!checkInput[i][j]) {//場合分けでcheckInputに入力「されていない」として抽出
	        	//前者：enumから対応する柄を取得　後者：ループ番目の抜けから取得(0スタートの為+1)
	          System.out.println(Mark.values()[i] + " " + (j +1));
	        }
	      }
	    }
	  }
	}


