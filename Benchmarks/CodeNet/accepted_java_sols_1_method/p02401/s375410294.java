/** ２つの整数 a, b と１つの演算子 op を読み込んで、a op b を計算するプログラムを作成して下さい。
 * ただし、演算子 op は、"+"(和)、"-"(差)、"*"(積)、"/"(商)、のみとし、
 * 割り算で割り切れない場合は、小数点以下を切り捨てたものを計算結果とします。
 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;
class Main{
	//プログラムのエントリポイント
	public static void main(String[] args){
		//入力ストリームの生成
		Scanner sc = new Scanner(System.in);


		//breakされるまでなんども処理を繰り返す
		while(true){
			//二つの数字と演算子を一つ受け取る
			int inta = sc.nextInt();
			String strop =  sc.next();
			int intb = sc.nextInt();


			//演算子に ? が入力されると処理を終了する
			if (strop.equals("?")){
				break;
			//演算子に＋が入った際、受け取った数字を＋して表示する
			}else if (strop.equals("+")) {
				System.out.println(inta + intb);
				//演算子に-が入った際、受け取った数字を-して表示する
			}else if (strop.equals("-")) {
				System.out.println(inta - intb);
				//演算子に*が入った際、受け取った数字を*して表示する
			}else if (strop.equals("*")) {
				System.out.println(inta * intb);
				//演算子に/が入った際、受け取った数字を/して表示する
			}else if (strop.equals("/")) {
				System.out.println(inta / intb);
			}

		}
	}
}