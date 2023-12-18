import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

/**
 * AIZU 0121
 * 幅優先探索
 */
public class Main {
	private final static int SIZE = 8;
	private final BitSet isVisit;// 既に生成した状態かどうかを管理するフラグセット

	// int[0の座標番号][交換候補の座標]
	private final static int[][] MOVABLE_PAIRS = {
		{1,4}, {0,2,5}, {1,3,6}, {2,7},
		{0,5}, {1,4,6}, {2,5,7}, {3,6}
	};
	
	// stateを整数に変換する際の係数
	private final static int[] coefficients = {5040, 720, 120, 24, 6, 2, 1, 0};
	
	private Main() {
		Scanner in = new Scanner(System.in);
		this.isVisit = new BitSet();
		
		while(in.hasNext()) {
			int[] puzzle = new int[SIZE];
			for(int i=0; i<SIZE; i++) {
				puzzle[i] = in.nextByte();
			}
			long start = System.currentTimeMillis();
			System.out.println(solve(puzzle));
			System.out.println(System.currentTimeMillis() - start);
			isVisit.clear();
		}
		in.close();
	}
	
	final class Puzzle {
		// 座標番号
		// 0 1 2 3
		// 4 5 6 7
		final int[] state; // パズルの状態
		final int depth; // 深さ(操作回数)
		final int movablePiecePoint; // パズル内にある動かせるピースの座標 
		final int point;// 移動可能なピースの直前にあった座標
		final boolean isRoot; // 根ノードかどうか
		int stateCode;
		
		/**
		 * 根ノード用コンストラクタ
		 * @param state
		 */
		public Puzzle(int[] state) {
			this.isRoot = true;
			this.depth = 0;
			this.state = state;
			this.point = -1;
			calcStateCode();
			
			for(int i=0; i<SIZE; i++) {
				// 0(動かせるピース)の座標を探索
				if(state[i]==0) {
					this.movablePiecePoint = i;
					return;
				}
			}
			this.movablePiecePoint = -1;
		}
		
		/**
		 * 子ノード生成用コンストラクタ
		 * @param parent 親ノード
		 * @param point1
		 * @param point2
		 */
		public Puzzle (Puzzle parent, int nextMove){
			this.isRoot = false;
			this.depth = parent.depth+1;
			this.point = parent.movablePiecePoint;
			this.movablePiecePoint = nextMove;
			
			// stateのswap
			this.state = Arrays.copyOf(parent.state, SIZE);
			int tmp = this.state[this.point];
			this.state[this.point] = this.state[nextMove];
			this.state[nextMove] = tmp;

			calcStateCode();
		}
		
		/**
		 * stateCodeの計算メソッド
		 */
		private final void calcStateCode() {
			for(int i=SIZE-2; i>=0; i--) {
				// 状態コードの計算
				int c = 0;
				for(int j=SIZE-1; j-i>0; j--) {
					if(this.state[i] > this.state[j]) {
						c++;
					}
				}
				this.stateCode += (coefficients[i]*c);
			}
		}
	}
	
	/**
	 * パズルを解く
	 * @param puzzle 初期状態
	 * @return 操作回数
	 */
	private final int solve(int[] puzzle) {
		ArrayDeque<Puzzle> queue = new ArrayDeque<Puzzle>();
		queue.add(new Puzzle(puzzle));
		while(!queue.isEmpty()) {
			Puzzle now = queue.poll();
			if(now.stateCode==0) { // 01234567のstateCodeは0
				return now.depth;
			}
			if(!isVisit.get(now.stateCode)) { // 枝刈りが可能かチェック
				for(int nextMove : MOVABLE_PAIRS[now.movablePiecePoint]) {
					if (now.isRoot || (!now.isRoot && now.point!=nextMove)) {
						queue.add(new Puzzle(now, nextMove));
					}
				}
			}
			isVisit.set(now.stateCode, true);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new Main();
	}

}