import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


/**
 * Lesson8B 与えられた数の各桁の和を計算するプログラム
 *
 * @author Internship
 *
 */
public class Main{

	/**
	 * プログラムのエントリポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Double> dbAry = new ArrayList<Double>();

		//各行読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			while(true) {

				String strLine = insBR.readLine();

				//int型にキャスト
				double dbNum  = Double.parseDouble(strLine);

				//終了条件
				if(dbNum == 0) {
				break;
				}

				//何桁か確認

				//1 10 100 1000 10000・・・桁が増えていく
				double dbNum10 = 1.0;

				//答えをカウント
				double dbAnswer = 0;

				while(true){

					dbAnswer += Math.floor((dbNum / dbNum10) % 10) ;

					if((dbNum / dbNum10) <= 1) {
						break;
					}

					//10 100 1000 10000・・・桁が増えていく
					dbNum10 = dbNum10 * 10.0;
				}

				dbAry.add(dbAnswer);
			}

			//答えが入った配列のサイズ取得
			int intSize = dbAry.size();

			//小数0桁まで
		    DecimalFormat insdf = new DecimalFormat("0");

		    //出力
			for(int i = 0; i < intSize; i++) {
				System.out.println(insdf.format(dbAry.get(i)));
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}