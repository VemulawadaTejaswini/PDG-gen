
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//最初の行の数値を読み取る。
			String[] strLine = insBR.readLine().split(" ");
			int[] intLine = new int[strLine.length];
			for(int i = 0; i < strLine.length; i++){
				intLine[i] = Integer.parseInt(strLine[i]);
			}

			//次の行以降を読み取る際の配列を用意。
			int intR = intLine[0];
			int intC = intLine[1];
			int[][] intRC = new int[intR][intC];
			String[][] strRC = new String[intR][intC];

			//数値を読み取り、配列につめる。
			for(int i = 0; i < intR; i++){
				strRC[i] = insBR.readLine().split(" ");
			}
			for(int i = 0; i < intR; i++){
				for(int j = 0; j < intC; j++){
					intRC[i][j] = Integer.parseInt(strRC[i][j]);
				}
			}

			//出力用の配列を用意。
			int[][] intPrint = new int[intR + 1][intC + 1];

			//1行ごとに合計値を算出。
			for(int i = 0; i < intR; i++){
				for(int j = 0; j < intC; j++){
					intPrint[i][j] = intRC[i][j];
					intPrint[i][intC] += intPrint[i][j];
					intPrint[intR][intC] += intPrint[i][j];
				}
			}

			//1列ごとに合計値を算出。
			for(int i = 0; i < intC; i++){
				for(int j = 0; j < intR; j++){
					intPrint[intR][i] += intPrint[j][i];

				}
			}

			//出力
			for(int i = 0; i < intPrint.length; i++){
				for(int j = 0; j <= intC; j++){
					if(j != intC){
						System.out.print(intPrint[i][j] + " ");
					}else{
						System.out.println(intPrint[i][j]);
					}
				}
			}




		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}

