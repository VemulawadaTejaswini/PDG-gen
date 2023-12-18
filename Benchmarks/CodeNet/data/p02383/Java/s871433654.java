

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			//サイコロの値を取る。
			String[] strDice = insBR.readLine().split(" ");
			int[] intDice = new int[strDice.length];
			for(int i = 0; i < intDice.length; i++){
				intDice[i] = Integer.parseInt(strDice[i]);
			}

			//サイコロ作成。
			Dice insDice = new Dice();
			insDice.setDice(intDice[0], intDice[1], intDice[2], intDice[3], intDice[4], intDice[5]);

			//方角。
			String[] strDirection = insBR.readLine().split("");


			//転がす。
			for(int i = 0; i < strDirection.length; i++){
				insDice.roll(strDirection[i]);
			}

			//出力。
			System.out.println(insDice.getDice());


		}catch(IOException e){
		 	e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

	}

}

class Dice{

	//使用の対象となるサイコロ。
	private int[] intObjectDice;
	//仮のサイコロ。
	private int[] intActDice;

	//インスタンスの初期化。
	Dice(){
		intObjectDice = new int[6];
		intActDice = new int[6];
	}

	//サイコロをつくる set メソッド。
	public void setDice(int i, int j, int k, int l, int m, int n) {

		this.intObjectDice[0] = i;
		this.intObjectDice[1] = j;
		this.intObjectDice[2] = k;
		this.intObjectDice[3] = l;
		this.intObjectDice[4] = m;
		this.intObjectDice[5] = n;

	}

	//サイコロの上の目の数値を得る get メソッド。
	public int getDice(){
		return intObjectDice[0];
	}

	//転がす。
	public void roll(String strOrder){

		//サイコロの値をgetし、仮のサイコロに格納。
		for(int i = 0; i < 6; i++){
			intActDice[i] = intObjectDice[i];
		}
		switch(strOrder){

		case "N":
			setDice(intObjectDice[1], intObjectDice[5], intObjectDice[2], intObjectDice[3], intObjectDice[0], intObjectDice[4]);
			break;

		case "E":
			setDice(intObjectDice[3], intObjectDice[1], intObjectDice[0], intObjectDice[5], intObjectDice[4], intObjectDice[2]);
			break;

		case "S":
			setDice(intObjectDice[4], intObjectDice[0], intObjectDice[2], intObjectDice[3], intObjectDice[5], intObjectDice[1]);
			break;

		default:
			setDice(intObjectDice[2], intObjectDice[1], intObjectDice[5], intObjectDice[0], intObjectDice[4], intObjectDice[3]);
			break;

		}
	}

}


