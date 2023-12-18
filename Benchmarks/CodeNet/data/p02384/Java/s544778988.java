

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//サイコロを作成。
			String[] strDice = insBR.readLine().split(" ");
			int[] intDice = new int[strDice.length];
			for(int i = 0; i < intDice.length; i++){
				intDice[i] = Integer.parseInt(strDice[i]);
			}

			//質問数。
			String strTime = insBR.readLine();
			int intTime = Integer.parseInt(strTime);

			//質問。
			int[][] intQuestion = new int[intTime][2];

			//答えのリストを用意。
			List<Integer> answerList = new ArrayList<Integer>();

			//質問に応じた回答。
			for(int i = 0; i < intQuestion.length; i++){

				//質問内容の読み込み。
				String[] strQuestion = insBR.readLine().split(" ");

				for(int j = 0; j < strQuestion.length; j++){
					intQuestion[i][j] = Integer.parseInt(strQuestion[j]);
				}

				//1つ目の数値は6通り。
				//1つの数値がわかると、4通りの場合分けがある。
				//つまり、全部で24通り。
				if(intQuestion[i][0] == intDice[0]){

					if(intQuestion[i][1] == intDice[1]){
						answerList.add(intDice[2]);
					}else if(intQuestion[i][1] == intDice[2]){
						answerList.add(intDice[4]);
					}else if(intQuestion[i][1] == intDice[4]){
						answerList.add(intDice[3]);
					}else{
						answerList.add(intDice[1]);
					}

				}else if(intQuestion[i][0] == intDice[1]){

					if(intQuestion[i][1] == intDice[0]){
						answerList.add(intDice[3]);
					}else if(intQuestion[i][1] == intDice[3]){
						answerList.add(intDice[5]);
					}else if(intQuestion[i][1] == intDice[5]){
						answerList.add(intDice[2]);
					}else{
						answerList.add(intDice[0]);
					}

				}else if(intQuestion[i][0] == intDice[2]){

					if(intQuestion[i][1] == intDice[0]){
						answerList.add(intDice[1]);
					}else if(intQuestion[i][1] == intDice[1]){
						answerList.add(intDice[5]);
					}else if(intQuestion[i][1] == intDice[5]){
						answerList.add(intDice[4]);
					}else{
						answerList.add(intDice[0]);
					}

				}else if(intQuestion[i][0] == intDice[3]){

					if(intQuestion[i][1] == intDice[0]){
						answerList.add(intDice[4]);
					}else if(intQuestion[i][1] == intDice[4]){
						answerList.add(intDice[5]);
					}else if(intQuestion[i][1] == intDice[5]){
						answerList.add(intDice[1]);
					}else{
						answerList.add(intDice[0]);
					}

				}else if(intQuestion[i][0] == intDice[4]){

					if(intQuestion[i][1] == intDice[0]){
						answerList.add(intDice[2]);
					}else if(intQuestion[i][1] == intDice[2]){
						answerList.add(intDice[5]);
					}else if(intQuestion[i][1] == intDice[5]){
						answerList.add(intDice[3]);
					}else{
						answerList.add(intDice[0]);
					}

				}else{

					if(intQuestion[i][1] == intDice[1]){
						answerList.add(intDice[3]);
					}else if(intQuestion[i][1] == intDice[3]){
						answerList.add(intDice[4]);
					}else if(intQuestion[i][1] == intDice[4]){
						answerList.add(intDice[2]);
					}else{
						answerList.add(intDice[1]);
					}

				}
			}

			//出力。
			for(Integer list : answerList){
				System.out.println(list);
			}


		}catch(IOException e){
		 	e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

	}

}

