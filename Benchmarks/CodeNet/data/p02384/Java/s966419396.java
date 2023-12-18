import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner inputData = new Scanner( System.in);
//			各面(S1~S6)の値を取得する処理
		int[] dice_surface = new int[7];
		for( int count=1; count<=6; count++) {
			dice_surface[count] = inputData.nextInt();
		}
		Dice dice = new Dice(dice_surface);
//		質問の数 q を取得する
		int q = inputData.nextInt();
//		質問の数だけ処理を回す
		for( int count=1; count<=q; count++) {
//			質問の上面/前面を取得する
			int surface_top = inputData.nextInt();
			int surface_front = inputData.nextInt();
			while( true) {
				if( dice.getTop() == surface_top && 
						dice.getFront() == surface_front) {
					break;
				}
				dice.roll_random();
			}
			dice.outSurfaceRight();
		}
	}
}

//サイコロに関するクラス
class Dice {
//		配列のインデックスをサイコロの番号と合わせる為(roll時の値保管用の為)7つ用意
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
//	ダイスの右側の面を出力する
	public void outSurfaceRight() {
		System.out.println( surface[3]);
	}
	
//	ダイスの上面を取得する
	public int getTop() {
		return surface[1];
	}
//	ダイスの前面を取得する
	public int getFront() {
		return surface[2];
	}
	
//	ダイスをランダムに回す
	public void roll_random() {
		int random = (int)( Math.random() * 4) + 1;
		switch( random) {
		case 1:
			roll_N();
			break;
		case 2:
			roll_S();
			break;
		case 3:
			roll_W();
			break;
		case 4:
			roll_E();
			break;
		default :
			break;
		}
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
