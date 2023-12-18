
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//最初の数値を読み取る。
			String[] strN = insBR.readLine().split(" ");
			int[] intN = new int[strN.length];
			for(int i = 0; i < strN.length; i++){
				intN[i] = Integer.parseInt(strN[i]);
			}

			//ベクトルMNを配列につめる。
			int intGyou = intN[0];
			int intRetsu = intN[1];
			int[][] intMN = new int[intGyou][intRetsu];
			String[][] strMN = new String[intGyou][intRetsu];
			for(int i = 0; i < intGyou; i++){
				strMN[i] = insBR.readLine().split(" ");
			}
			for(int i = 0; i < intGyou; i++){
				for(int j = 0; j < intRetsu; j++){
						intMN[i][j] = Integer.parseInt(strMN[i][j]);
				}
			}

			//M行分の数値を読み取り、配列につめる。
			int[] intM = new int[intRetsu];
			String strLine = "";
			for(int i = 0; i < intM.length; i++){
				strLine = insBR.readLine();
				intM[i] = Integer.parseInt(strLine);
			}

			//ベクトルCを算出する。
			int[] intC = new int[intGyou];
			//int[] intSum = new int[intRetsu];
			for(int i = 0; i < intGyou; i++){
				for(int j = 0; j < intRetsu; j++){
					intC[i] += intMN[i][j] * intM[j];
				}
			}
			for(int i = 0; i < intGyou; i++){
				System.out.println(intC[i]);
			}



		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}
}

