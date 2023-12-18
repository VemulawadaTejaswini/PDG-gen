

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
			Dice3Next insDice = new Dice3Next();
			insDice.diceMain();
	}
}

class Dice3Next{

	//使用の対象となるサイコロ。
	private int[] intObjectDice;
	//仮のサイコロ。
	private int[] intActDice;
	//サイコロのリスト。
	private List<Integer> diceList;

	BufferedReader insBR;

	//インスタンスの初期化。
	Dice3Next(){
		intObjectDice = new int[6];
		intActDice = new int[6];
		diceList = new ArrayList<Integer>();
		insBR = new BufferedReader(new InputStreamReader(System.in));
	}

	public void diceMain(){

			//サイコロを作成。
			int[] intFirstDice = new int[6];
			intFirstDice = makeDice();

			//もう1つサイコロを作成。
			int[] intNextDice = new int[6];
			intNextDice = makeDice();

			setDice(intNextDice);

			String strAnswer = "No";

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
						strAnswer = "Yes";
						break;
					}
				}
			}

			//出力。
			System.out.println(strAnswer);

	}

	public int[] makeDice(){

		int[] intDice = new int[6];
		try{
			String[] strDice = insBR.readLine().split(" ");
			for(int i = 0; i < intDice.length; i++){
				intDice[i] = Integer.parseInt(strDice[i]);
			}

		}catch(IOException e){
		 	e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

		return intDice;
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

	//サイコロの上の目の数値を得る get メソッド。
	public int getDice(){
		return intObjectDice[0];
	}

	public List<Integer> getDiceList(){
		return diceList;
	}

	//転がす。
	public void roll(String strOrder){

		//サイコロの値をgetし、仮のサイコロに格納。
		for(int i = 0; i < 6; i++){
			intActDice[i] = intObjectDice[i];
		}
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

}


