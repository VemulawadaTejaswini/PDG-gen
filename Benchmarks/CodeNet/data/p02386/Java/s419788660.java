import java.util.Scanner;

/**
 * 鈴木くんの参考 与えられた２つのサイコロが同じものかどうかを判定する
 * 
 * @author U633758
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Dice4 dc = new Dice4();
		Dice4 hikaku_dc = new Dice4();
		dc.dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		boolean same_flag = false;	//ごめんなさい、フラグ使いました
		for(int i = 0; i < count -1  ; i++){
			hikaku_dc.dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			if (dc.check(hikaku_dc)) {	//同じものが一つでもあると即実行
				System.out.println("No");
				same_flag = true;
				break;
			}
		}
		//全部違うときにやっと入力
		if(!same_flag){
			System.out.println("Yes");
		}
		sc.close();// Scannerを閉じる


	}
}

/**
 * Dice4クラス ダイスの面に数字をインプットする。回転させたりする。
 * 
 * @author U633758
 *
 */
class Dice4 {
	private int T, S, E, W, N, U;

	Dice4() {
		this.T = 0; // Top
		this.S = 0;
		this.E = 0;
		this.W = 0;
		this.N = 0;
		this.U = 0; // Under
	}

	/**
	 * Diceに数字をインプットする
	 * 
	 * @param T_1
	 *            真上
	 * @param S_2
	 *            南
	 * @param E_3
	 *            東
	 * @param W_4
	 *            西
	 * @param N_5
	 *            北
	 * @param U_6
	 *            真下
	 */
	void dice(int T_1, int S_2, int E_3, int W_4, int N_5, int U_6) {
		this.T = T_1; // Top
		this.S = S_2;
		this.E = E_3;
		this.W = W_4;
		this.N = N_5;
		this.U = U_6; // Under
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * 南方向にサイコロを傾ける
	 */
	void MoveSouth() {
		int a = T;
		T = N;
		N = U;
		U = S;
		S = a;
	}

	void MoveEast() {
		int a = T;
		T = W;
		W = U;
		U = E;
		E = a;
	}

	void MoveNorth() {
		int a = T;
		T = S;
		S = U;
		U = N;
		N = a;
	}

	void MoveWest() {
		int a = T;
		T = E;
		E = U;
		U = W;
		W = a;
	}

	void right() {// 時計周りの回転
		int a = S;
		S = E;
		E = N;
		N = W;
		W = a;
	}

	/**
	 * 
	 * @param t
	 *            真上の数字（上面）
	 * @param f
	 *            南側の数字（前面）
	 * @return 東側（側面）の求めるべき数字
	 */
	int getRight(int t, int f) {
		for (int i = 0; i < 3; i++) {
			if (t == T) {
				break;
			}
			MoveNorth();
			if (t == T) {
				break;
			}
			MoveWest();
		}
		for (int i = 0; i < 3; i++) {
			if (f == S) {
				break;
			}
			right();
		}
		return E;
	}

	/**
	 * 引数と同じサイコロであるか判定する
	 * 
	 * @param hikaku
	 *            比較するサイコロ
	 * @return true:同じ false:異なる
	 */
	boolean check(Dice4 hikaku) {
		for (int i = 0; i < 4; i++) {
			if (checkAll(hikaku)) {
				break;
			}
			MoveNorth();
			for (int j = 0; j < 4; j++) {
				if (checkAll(hikaku)) {
					break;
				}
				right();
			}
		}

		for (int i = 0; i < 4; i++) {
			if (checkAll(hikaku)) {
				break;
			}
			MoveWest();
			for (int j = 0; j < 4; j++) {
				if (checkAll(hikaku)) {
					break;
				}
				right();
			}
		}
		if (checkAll(hikaku)) {
			return true;
		}
		return false;
	}

	boolean checkAll(Dice4 hikaku) {
		if (this.T == hikaku.T && this.S == hikaku.S && this.W == hikaku.W && this.E == hikaku.E && this.N == hikaku.N
				&& this.U == hikaku.U) {

			return true;
		}
		return false;
	}

}
