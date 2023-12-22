
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
			int intN = intLine[0];
			int intM = intLine[1];
			int intL = intLine[2];

			//n×m の行列 A
			int[][] intA = new int[intN][intM];
			for(int i = 0; i < intN; i++){
				strLine = insBR.readLine().split(" ");
				for(int j = 0; j < intM; j++){
					intA[i][j] = Integer.parseInt(strLine[j]);
				}
			}

			//m×l の行列 B
			int[][] intB = new int[intM][intL];
			for(int i = 0; i < intM; i++){
				strLine = insBR.readLine().split(" ");
				for(int j = 0; j < intL; j++){
					intB[i][j] = Integer.parseInt(strLine[j]);
				}
			}

			//n×l の行列 C
			long[][] longC = new long[intN][intL];
			for(int i = 0; i < intN; i++){
				for(int j = 0; j < intL; j++){
					for(int k = 0; k < intM; k++){
						longC[i][j] += intA[i][k] * intB[k][j];
					}
				}
			}

			for(int i = 0; i < intN; i++){
				for(int j = 0; j < intL; j++){
					if(j != intL - 1){
						System.out.print(longC[i][j] + " ");
					}else{
						System.out.println(longC[i][j]);
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

