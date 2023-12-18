import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner inputData = new Scanner( System.in);
//		各面(S1~S6)の値を取得する処理
		int[] dice_surface = new int[7];
		for( int count=1; count<=6; count++) {
			dice_surface[count] = inputData.nextInt();
		}
		Dice dice = new Dice(dice_surface);
//		命令となる文字列を取得する処理
		char[] commandAll = inputData.next().toCharArray();
		
		for( char command : commandAll) {
			switch( command) {
			case 'N' :
				dice.roll_N();
				break;
			case 'S' :
				dice.roll_S();
				break;
			case 'W' :
				dice.roll_W();
				break;
			case 'E' :
				dice.roll_E();
				break;
			}
		}
		dice.outSurface();
	}
}

//サイコロに関するクラス
class Dice {
//	配列のインデックスをサイコロの番号と合わせる為(roll時の値保管用の為)7つ用意
	public static int[] surface = new int[7];
	
	public Dice() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public Dice(int[] surface_in) {
		// TODO 自動生成されたコンストラクター・スタブ
		surface = surface_in;
	} 
	public void outSurface() {
		System.out.println( surface[1]);
	}
	
	public void roll_N() {
		surface[0] = surface[1];
		surface[1] = surface[2];
		surface[2] = surface[6];
		surface[6] = surface[5];
		surface[5] = surface[0];
	}
	public void roll_S() {
		surface[0] = surface[1];
		surface[1] = surface[5];
		surface[5] = surface[6];
		surface[6] = surface[2];
		surface[2] = surface[0];
	}
	public void roll_W() {
		surface[0] = surface[1];
		surface[1] = surface[3];
		surface[3] = surface[6];
		surface[6] = surface[4];
		surface[4] = surface[0];
	}
	public void roll_E() {
		surface[0] = surface[1];
		surface[1] = surface[4];
		surface[4] = surface[6];
		surface[6] = surface[3];
		surface[3] = surface[0];
	}
}

