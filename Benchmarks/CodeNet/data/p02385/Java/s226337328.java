import java.util.Scanner;

class Dice3{
	private int[] number = new int[6]; //Diceの方向には何の数字かを示す
										//初期値の順番と一緒：上面①、その下②、その右③、その左④、その上⑤、その反面⑥（Indexと一個違い）

	//コンストラクタ
	public Dice3(int[] n) {
		for (int i=0; i< 6; i++)number[i] = n[i];
	}

	public int getDice(int no) {
		return number[no];
	}

	public void roll(String target) {
		int [] w = new int[6];  //仮のway
		int a = target.length();
		for (int i=0; i<a; i++) {
			for (int j=0; j< 6; j++) w[j] = number[j];  //コピーする
			String t = target.substring(i, i+1);
			switch(t) {
			case "N":
				number[4] = w[0];
				number[0] = w[1];
				number[1] = w[5];
				number[5] = w[4];
				break;
			case "E":
				number[2] = w[0];
				number[0] = w[3];
				number[3] = w[5];
				number[5] = w[2];
				break;
			case "S":
				number[4] = w[5];
				number[0] = w[4];
				number[1] = w[0];
				number[5] = w[1];
				break;
			case "W":
				number[2] = w[5];
				number[0] = w[2];
				number[3] = w[0];
				number[5] = w[3];
				break;
			}
		}
	}

	public void rollToAB(int A,int B) {
		if (number[0]!=A) {		//Aは①面ではない
			if (number[2] == A) roll("W"); //Aが③の時：W
			else if (number[3] == A) roll("E"); //Aが④の時：E
			else if (number[1] == A) roll("N"); //Aが②の時：N
			else if (number[4] == A) roll("S"); //Aが⑤の時：S
			else roll("NN"); //Aが⑥の時：NN
		}
		if (number[1]!=B){  //Aは①面にあって、Bは②にない
			if (number[2] == B) roll("WSE");  //Bが③の時：W→S→E
			else if (number[3] == B) roll("ESW");  //Bが④の時：E→S→W
			else if (number[4] == B) roll("SENWSE");  //Bが⑤の時：S→E→N→Bが③になる→W→S→E
			else number[2] = -1;  //Bが⑥の時：必ず異なる
		}
	}
}

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			//データ入力----------------------------------------------
			boolean[] check = new boolean[6];

			int [] n = new int[6];
			for (int i=0; i<6; i++) {
					n[i] = sc.nextInt();
					check[i] = false;  //初期化
			}
			Dice3 diceA = new Dice3(n);
			for (int i=0; i<6; i++) n[i] = sc.nextInt();
			Dice3 diceB = new Dice3(n);
			//面々の一致性をチェックする--------------------------------
			for (int i=0; i<6; i++) {
				for (int j=0; j<6; j++) {
					if (diceB.getDice(j) == diceA.getDice(i)) check[i] = true;  //jはiと一致する面があったらチェック
				}
			}
			boolean flag = true;
			for (int i=0; i<6; i++) {
				if (!check[i]) { //全部一致ではなければ異なるサイコロ
					flag = false;
					break;
				}
			}
			if (flag) {  //二つのサイコロが同じ数字の組み合わせの場合
				diceB.rollToAB(diceA.getDice(0), diceA.getDice(1));  //diceBの向きを調整する
				System.out.println(diceA.getDice(2)==diceB.getDice(2) ? "Yes" : "No");  //③右面を比較して同じかどうかを判断する
			} else System.out.println("No");
		}
	}
}
