import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		//サイコロ2個を生成
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		//各サイコロの目を入力から読み込む
		Scanner scanner = new Scanner(System.in);
		dice1.readInput(scanner);
		dice2.readInput(scanner);
		
		Main examDice3 = new Main();
		//dice1とdice2を比較
		boolean compare = examDice3.diceRollCompare(dice1, dice2);
		
		//結果を出力
		if (compare) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
	
	boolean diceRollCompare (Dice dice1, Dice dice2) {
		//2つのサイコロが回転させて一致するか判定するメソッド
		//戻り値を宣言
		boolean result = false;
		
		//北→西→北→西→北の順に回せば全ての面が1回ずつ上面にくる
		//dice2を上の順で回転させ、それぞれに対してDiceRightRollを行い、trueならresultをtrueに
		//DiceRightRoll1回目
		if (diceRightRoll(dice1, dice2)) {
			result = true;
		}
		//北回転
		dice2.rollN();
		//DiceRightRoll2回目
		if (diceRightRoll(dice1, dice2)) {
			result = true;
		}
		//西回転
		dice2.rollW();
		//DiceRightRoll3回目
		if (diceRightRoll(dice1, dice2)) {
			result = true;
		}
		//北回転
		dice2.rollN();
		//DiceRightRoll4回目
		if (diceRightRoll(dice1, dice2)) {
			result = true;
		}
		//西回転
		dice2.rollW();
		//DiceRightRoll5回目
		if (diceRightRoll(dice1, dice2)) {
			result = true;
		}
		//北回転
		dice2.rollN();
		//DiceRightRoll6回目
		if (diceRightRoll(dice1, dice2)) {
			result = true;
		}
		
		//戻り値を返す
		return result;
	}
	
	boolean diceRightRoll (Dice dice1, Dice dice2) {
		//一方のサイコロを水平方向に1回転させ、その過程でもう一方のサイコロと一致するか判定するメソッド
		//戻り値を宣言
		boolean result = false;
		
		//（完全一致判定→dice2を右回転）を4回行う
		for (int j=0; j < 4; j++) {
			if (diceCompare(dice1, dice2)) {
				//一致したら戻り値をtrueに設定
				result = true;
			}
			dice2.rollR();
		}
		
		//戻り値を返す
		return result;
	}
	
	boolean diceCompare (Dice dice1, Dice dice2) {
		//2つのサイコロが面の順番も含めて完全一致しているか判定するメソッド
		//すべての面が一致しているときtrue、そうでないときfalseを返す
		if (dice1.getTop() == dice2.getTop()
				&& dice1.getFront() == dice2.getFront() 
				&& dice1.getRight() == dice2.getRight() 
				&& dice1.getLeft() == dice2.getLeft() 
				&& dice1.getBack() == dice2.getBack()
				&& dice1.getBottom() == dice2.getBottom()) {
			return true;
		} else {
			return false;
		} 
	}

}

class Dice {

	//メンバ変数
	//上面、前面、右面、左面、背面、底面の順
	private int[] faces = new int[6];
	
	//サイコロの目を入力から読み込む
	public void readInput(Scanner scanner) {
		for (int i = 0; i < 6; i++) {
			faces[i] = scanner.nextInt();
		}
	}
	
	//北方向に回転
	public void rollN() {
		int temp = faces[0]; //topの値をtempに退避
		faces[0] = faces[1]; //front → top
		faces[1] = faces[5]; //bottom → front
		faces[5] = faces[4]; //back → bottom
		faces[4] = temp; //top → back
	}
	
	//南方向に回転
	public void rollS() {
		int temp = faces[0]; //topの値をtempに退避
		faces[0] = faces[4]; //back → top
		faces[4] = faces[5]; //bottom → back
		faces[5] = faces[1]; //front → bottom
		faces[1] = temp; //top → front
	}
	
	//東方向に回転
	public void rollE() {
		int temp = faces[0]; //topの値をtempに退避
		faces[0] = faces[3]; //left → top
		faces[3] = faces[5]; //bottom → left
		faces[5] = faces[2]; //right → bottom
		faces[2] = temp; //top → right
	}
	
	//西方向に回転
	public void rollW() {
		int temp = faces[0]; //topの値をtempに退避
		faces[0] = faces[2]; //right → top
		faces[2] = faces[5]; //bottom → right
		faces[5] = faces[3]; //left → bottom
		faces[3] = temp; //top → left
	}
	
	//水平右回りに回転
	public void rollR() {
		int temp = faces[1]; //frontをtempに退避
		faces[1] = faces[2]; //right → front
		faces[2] = faces[4]; //back → right
		faces[4] = faces[3]; //left → back
		faces[3] = temp; //front → left
	}
	
	//水平左回りに回転
	public void rollL() {
		int temp = faces[1]; //frontをtempに退避
		faces[1] = faces[3]; //left → front
		faces[3] = faces[4]; //back → left
		faces[4] = faces[2]; //right → back
		faces[2] = temp; //front → right
	}
	
	//指定した番号の面を上面に持ってくる
	public void rollTop(int faceNum) {
		switch (faceNum) {
		case 0: //上面：何もしない
			break;
		case 1: //前面：北回転
			rollN();
			break;
		case 2: //右面：西回転
			rollW();
			break;
		case 3: //左面：東回転
			rollE();
			break;
		case 4: //背面：南回転
			rollS();
			break;
		case 5: //底面：北回転2回
			rollN();
			rollN();
			break;
		}
	}
	
	//指定した番号の面の値を返す
	public int getFaceVal(int faceNum) {
		return faces[faceNum];
	}
	
	//getterおよびsetter
	public int getTop() {
		return faces[0];
	}
	public void setTop(int top) {
		this.faces[0] = top;
	}
	public int getFront() {
		return faces[1];
	}
	public void setFront(int front) {
		this.faces[1] = front;
	}
	public int getRight() {
		return faces[2];
	}
	public void setRight(int right) {
		this.faces[2] = right;
	}
	public int getLeft() {
		return faces[3];
	}
	public void setLeft(int left) {
		this.faces[3] = left;
	}
	public int getBack() {
		return faces[4];
	}
	public void setBack(int back) {
		this.faces[4] = back;
	}
	public int getBottom() {
		return faces[5];
	}
	public void setBottom(int bottom) {
		this.faces[5] = bottom;
	}
	
	//
}

