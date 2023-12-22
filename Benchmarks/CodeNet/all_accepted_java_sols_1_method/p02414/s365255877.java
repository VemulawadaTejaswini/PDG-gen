import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Lesson7D n×m  の行列 A  と m×l  の行列 B  を入力し、
 * それらの積である n×l  の行列 C  を出力するプログラム
 * 行列 C  の各要素 c ij   は次の式で得られます：
 * c ij =? k=1 m a ik b kj
 * ここで、A 、B 、C  の各要素をそれぞれ a ij  、b ij  、c ij   とする
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

		//行や列の各数字の一時保管場所
				int intVector = 0;

		//入力値の各行の文字列の一時保管場所
				String strLineAll = "";

		//1行目を読み込む
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine1 = insBR.readLine();

			//ばらけさせる
			String[] strAryLine1 = strLine1.split(" ");

			//１つ目がN
			int intN = Integer.parseInt(strAryLine1[0]);

			//2つ目がM
			int intM = Integer.parseInt(strAryLine1[1]);

			//3つ目がL
			int intL = Integer.parseInt(strAryLine1[2]);

			//N,M,Lが決まったところで配列の大きさが決まる
			//行列A
			int[][] intTableA = new int[intN][intM];

			//行列B
			int[][] intTableB = new int[intM][intL];

			//行列C
			double[][] dbTableC = new double[intN][intL];

			//行列Aを読み込む
			//i行目
			for(int i = 0; i < intN; i++) {
				strLineAll = insBR.readLine();

				//ばらけさせる
				String[] strAryLineAll = strLineAll.split(" ");

				//int型にキャスト
				//j列目
				for(int j = 0; j < intM; j++) {
					intVector = Integer.parseInt(strAryLineAll[j]);

					//配列に格納
					//i行のj列
					intTableA[i][j] = intVector;
				}
			}


			//行列Bを読み込む
			//i行目
			for(int i = 0; i < intM; i++) {
				strLineAll = insBR.readLine();

				//ばらけさせる
				String[] strAryLineAll = strLineAll.split(" ");

				//int型にキャスト
				//j列目
				for(int j = 0; j < intL; j++) {
					intVector = Integer.parseInt(strAryLineAll[j]);

					//配列に格納
					//i行のj列
					intTableB[i][j] = intVector;
				}
			}
			//計算
			for(int i = 0; i < intN; i++) {
				for(int j = 0; j < intL; j++) {
					for(int k = 0; k < intM; k++) {
						dbTableC[i][j] += intTableA[i][k] * intTableB[k][j];
					}

				}
			}

			//小数5桁まで
		    DecimalFormat insdf = new DecimalFormat("0");


			//出力
			for(int i = 0; i < intN; i++) {
				for(int j = 0; j < intL; j++) {
					if(j != 0) {
						System.out.print(" ");
					}
				System.out.print(insdf.format(dbTableC[i][j]));
				}
				System.out.println();
			}



		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}