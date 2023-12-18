

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){


		try{

			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
			String strArticles =insBR.readLine();
			int intArticles = Integer.parseInt(strArticles);

			int[][] intSomeDice = new int[intArticles][6];
			for(int i = 0; i < intSomeDice.length; i++){
				String[] strDice = insBR.readLine().split(" ");
				int[] intDice = new int[6];
				for(int j = 0; j < intDice.length; j++){
					intSomeDice[i][j] = Integer.parseInt(strDice[j]);
				}

			}

			Dice4Obj insDice = new Dice4Obj(intSomeDice, intArticles);
			insDice.lummyMain();

		}catch(IOException e){

		}catch(NumberFormatException e){

		}



	}
}

class Dice4Obj{

	//使用の対象となるサイコロ。
	private int[] intObjectDice;

	//サイコロのリスト。
	private List<Integer> diceList;

	private int[][] intSomeDice;


	//インスタンスの初期化。
	Dice4Obj(){
		intObjectDice = new int[6];
		diceList = new ArrayList<Integer>();
	}

	Dice4Obj(int[][] intSomeDice, int intArticles){
		intObjectDice = new int[6];
		diceList = new ArrayList<Integer>();
		this.intSomeDice = new int[intArticles][6];
		setSomeDice(intSomeDice);
	}

	public void lummyMain(){
		int[][] intSomeDice = getSomeDice();
		String[] strOrder = "NNNNWNNNWNNNENNNENNNWNNN".split("");
		String strAnswer = "Yes";
		for(int first = 0; first < intSomeDice.length - 1; first++){
			for(int second = first + 1; second < intSomeDice.length; second++){
				setDice(intSomeDice[second]);
				int[] intNextDice = new int[6];
				for(int third = 0; third < strOrder.length; third++){
					roll(strOrder[third]);
					intNextDice = getDiceArray();
					if(intSomeDice[first][0] == intNextDice[0] && intSomeDice[first][1] == intNextDice[1]
						&& intSomeDice[first][2] == intNextDice[2] && intSomeDice[first][3] == intNextDice[3]
						&& intSomeDice[first][4] == intNextDice[4] && intSomeDice[first][5] == intNextDice[5]){
						strAnswer = "No";
						break;
					}

				}
				if("No".equals(strAnswer)){
					break;
				}
			}
			if("No".equals(strAnswer)){
				break;
			}

		}

		System.out.println(strAnswer);
	}



	public void setSomeDice(int[][] intSomeDice){
		this.intSomeDice = intSomeDice;
	}

	public int[][] getSomeDice(){
		return this.intSomeDice;
	}

	//サイコロを最初につくる set メソッド。
	public void setDice(int[] intActDice) {

		this.intObjectDice[0] = intActDice[0];
		this.intObjectDice[1] = intActDice[1];
		this.intObjectDice[2] = intActDice[2];
		this.intObjectDice[3] = intActDice[3];
		this.intObjectDice[4] = intActDice[4];
		this.intObjectDice[5] = intActDice[5];

		diceList.clear();
		for(int i = 0; i < intObjectDice.length; i++){
			diceList.add(intObjectDice[i]);
		}

	}

	public void setDice2(int i, int j, int k, int l, int m, int n){
		this.intObjectDice[0] = i;
		this.intObjectDice[1] = j;
		this.intObjectDice[2] = k;
		this.intObjectDice[3] = l;
		this.intObjectDice[4] = m;
		this.intObjectDice[5] = n;
		diceList.clear();
		for(int addNum = 0; addNum < intObjectDice.length; addNum++){
			diceList.add(intObjectDice[addNum]);
		}
	}


	public void setDiceArray(int[] intDice){
		this.intObjectDice[0] = intDice[0];
		this.intObjectDice[1] = intDice[1];
		this.intObjectDice[2] = intDice[2];
		this.intObjectDice[3] = intDice[3];
		this.intObjectDice[4] = intDice[4];
		this.intObjectDice[5] = intDice[5];
		diceList.clear();
		for(int addNum = 0; addNum < intObjectDice.length; addNum++){
			diceList.add(intObjectDice[addNum]);
		}
	}

	//サイコロの上の目の数値を得る get メソッド。
	public int getDiceTop(){
		return intObjectDice[0];
	}

	public int[] getDiceArray(){
		return intObjectDice;
	}

	public List<Integer> getDiceList(){
		return diceList;
	}

	//転がす。
	public void roll(String strOrder){

		switch(strOrder){

		case "N":
			setDice2(intObjectDice[1], intObjectDice[5], intObjectDice[2], intObjectDice[3], intObjectDice[0], intObjectDice[4]);
			break;

		case "E":
			setDice2(intObjectDice[3], intObjectDice[1], intObjectDice[0], intObjectDice[5], intObjectDice[4], intObjectDice[2]);
			break;

		case "S":
			setDice2(intObjectDice[4], intObjectDice[0], intObjectDice[2], intObjectDice[3], intObjectDice[5], intObjectDice[1]);
			break;

		default:
			setDice2(intObjectDice[2], intObjectDice[1], intObjectDice[5], intObjectDice[0], intObjectDice[4], intObjectDice[3]);
			break;

		}
	}

	public String diceJudge(int[] intFirstDice){

		String strAnswer = "Yes";

		//24通り出るように転がす。
		String[] strOrder = "NNNNWNNNWNNNENNNENNNWNNN".split("");

		//転がってきたサイコロのリスト作成。
		List<Integer> afterRollDice = new ArrayList<Integer>();

		for(int i = 0; i < strOrder.length; i++){
			roll(strOrder[i]);
			afterRollDice = getDiceList();
			for(int j = 0; j < afterRollDice.size(); j++){
				if(intFirstDice[j] != afterRollDice.get(j)){
					afterRollDice.clear();
					break;
				}
				if(j == afterRollDice.size() - 1){
					strAnswer = "No";
					break;
				}
			}
		}

		return strAnswer;
	}

}
