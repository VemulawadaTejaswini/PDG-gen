import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.uniqueNumberGame();
		return;
	}
	
	//数当てゲーム
	private void uniqueNumberGame() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			
			String inputStr = bufferedReader.readLine();
			int playerNum = Integer.parseInt(inputStr);
			LinkedList<int[]> gameResultList = new LinkedList<int[]>();
			
			//ゲーム結果の入力
			for (int i = 0; i < playerNum; i++) {
				
				String inputStr2 = bufferedReader.readLine();
				String[] inputStrs = inputStr2.split(" ");
				int[] gameResultArray = new int[3];
				
				for (int j = 0; j < 3; j++) {
					gameResultArray[j] = Integer.parseInt(inputStrs[j]);
				}
				
				gameResultList.add(gameResultArray);
				
			}
			
			//得点が得られるプレイヤーを特定し、ゲームの結果に加算する
			int[] resultArray = new int[playerNum]; //ゲームの結果を保存する
			for (int i = 0; i < 3; i++) {
				
				int[] gameIntermediateResultsArray = new int[playerNum];
				boolean[] getFlagArray = new boolean[playerNum]; //trueなら該当する添字のプレイヤーは得点を得られる
				
				//i回目のゲームのそれぞれのプレイヤーが書いた数字を取得
				for (int j = 0; j < playerNum; j++) {
					int[] tmpArray = gameResultList.get(j);
					gameIntermediateResultsArray[j] = tmpArray[i];
				}
				
				//同じ値を書いたプレイヤーがいないかをチェック
				for (int k = 0; k < playerNum; k++) {
					
					int checkNum = gameIntermediateResultsArray[k];
					boolean checkFlag = false; //1回でもcheckNumと同じ数字が配列にあった場合、trueになる
					
					for (int l = 0; l < playerNum; l++) {
						
						if (k != l && checkNum == gameIntermediateResultsArray[l]) {
							checkFlag = true; //同じ数字が見つかった
						}
						
					}
					
					//同じ数字を出したプレイヤーがいなかったのは、どのプレイヤーか記録する
					if (!checkFlag) {
						getFlagArray[k] = true; 
					}
					
				}
				
				//記録に基づいて、他のプレイヤーと同じ数字を出さなかったプレイヤーに加点する
				for (int m = 0; m < playerNum; m++) {
					
					if (getFlagArray[m] == true) {
						resultArray[m] += gameIntermediateResultsArray[m];
					}
					
				}
				
			}
			
			//結果の表示
			for (int resultNum : resultArray) {
				System.out.println(resultNum);
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
}