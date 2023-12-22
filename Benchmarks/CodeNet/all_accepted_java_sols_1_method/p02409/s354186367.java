

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String strN = insBR.readLine();
			int n = Integer.parseInt(strN);
			int intLength = n * 4;
			String[][] strA = new String[n][4];
			for(int i = 0; i < n; i++){
				strA[i] = insBR.readLine().split(" ");
			}

			int[][] intA = new int[n][4];

			//読み込んだ数値をintの配列につめる。
			for(int j = 0; j < strA.length; j++){
				for(int k = 0; k < 4; k++){
						intA[j][k] = Integer.parseInt(strA[j][k]);
				}
			}


			//マンション初期化。
			int[][][] intLive = new int[4][3][10];

			//マンションに住む。
			for(int i = 0; i < n; i++){
				int intTou = intA[i][0] - 1;
				int intKai = intA[i][1] - 1;
				int intRoom = intA[i][2] - 1;
				int intPeaple = intA[i][3];
				intLive[intTou][intKai][intRoom] += intPeaple;
			}

			//出力
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 3; j++){
					for(int k = 0; k < 10; k++){
						System.out.print(" " + intLive[i][j][k]);
					}
					System.out.println();
				}
				if(i < 3){
					System.out.println("####################");
				}
			}

		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}
}

