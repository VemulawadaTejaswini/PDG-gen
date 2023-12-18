

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//文字を読み取る。
			String strLine = insBR.readLine();
			int intTurn = Integer.parseInt(strLine);

			//2人にカードを配る。
			String[][] strCard = new String[intTurn][2];
			char[][][] chCard = new char[intTurn][2][100];
			for(int i = 0; i < intTurn; i++){
				strCard[i] = insBR.readLine().split(" ");
				for(int j = 0; j < 2; j++){
					chCard[i][j] = strCard[i][j].toCharArray();
				}
			}

			String[][][] strJuge = new String[intTurn][2][100];
			for(int i = 0; i < strCard.length; i++){
				for(int j = 0; j < 2; j++){
					strJuge[i][j] = strCard[i][j].split("");
				}
			}


			//2人のスコアをとる。
			int intTaro = 0;
			int intHanako = 0;
			for(int i = 0; i < intTurn; i++){
				int intJuge = strCard[i][0].compareTo(strCard[i][1]);
				if(intJuge == 0){
					intTaro += 1;
					intHanako += 1;
				}else if(0 < intJuge){
					intTaro += 3;
				}else{
					intHanako += 3;
				}
			}

			//出力。
			System.out.println(intTaro + " " + intHanako);


		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

	}

}

