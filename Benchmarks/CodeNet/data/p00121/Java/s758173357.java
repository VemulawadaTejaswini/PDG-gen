import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

/**
 * AIZU 0121
 */
public class Main {
	private final int x = 2;
	private final int y = 4;
	final int size = x*y;

	// byte[0の座標番号][交換候補の座標]
	private final static byte[][] MOVABLE_PAIRS = {
		{1,4}, {0,2,5}, {1,3,6}, {2,7},
		{0,5}, {1,4,6}, {2,5,7}, {3,6}
	};

	// 完成形の状態コード("01234567"を表す)
	private final int answerStateCode = 01234567;

	// stateを整数に変換する際の係数(8の累乗)
	private final static int[] coefficients = {2097152, 262144, 32768, 4096, 512, 64, 8, 1};
	
	private Main() {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			byte[] puzzle = new byte[size];
			for(int i=0; i<size; i++) {
				puzzle[i] = in.nextByte();
			}
			long start = System.currentTimeMillis();
			System.out.println(solve(puzzle));
			System.out.println(System.currentTimeMillis() - start);
		}
		in.close();
	}
	
	
	class Puzzle {
		// 座標番号
		// 0 1 2 3
		// 4 5 6 7
		final byte[] state; // パズルの状態
		byte depth; // 深さ(操作回数)

		byte movablePiecePoint; // パズル内にある動かせるピースの座標 
		int stateCode; // 状態で一意に決まるindex(枝狩り用)
		
		public Puzzle (byte depth, byte[] state){
			this.depth = depth;
			this.state = state;
			
			// 0(動かせるピース)の座標を探索
			// 状態コードの計算
			this.stateCode = -answerStateCode;
			for(byte i=0; i<size; i++) {
				if(state[i]==0) {
					this.movablePiecePoint = i;
				}
				this.stateCode += coefficients[i]*state[i];
			}
		}
		
	}

	/**
	 * 次の状態を生成する
	 * @param point1,point2 交換するピースの位置番号
	 * @return 移動後の状態を表す配列
	 */
	public byte[] move(byte[] state, byte point1, byte point2) {
		byte[] nextState = Arrays.copyOf(state, size);
		byte tmp = nextState[point1];
		nextState[point1] = nextState[point2];
		nextState[point2] = tmp;
		return nextState;
	}

	
	/**
	 * パズルを解く
	 * @param puzzle 初期状態
	 * @return 操作回数
	 */
	private int solve(byte[] puzzle) {
		ArrayDeque<Puzzle> queue = new ArrayDeque<Puzzle>();
		BitSet isVisit = new BitSet();// 既に生成した状態かどうかを管理するフラグセット
		
		queue.add(new Puzzle((byte)0, puzzle));
		Puzzle now;
		while(!queue.isEmpty()) {
			now = queue.poll();
			if(0 == now.stateCode) {
				return now.depth;
			}
			if(!isVisit.get(now.stateCode)) { // 枝刈りが可能かチェック
				for(byte nextMove : MOVABLE_PAIRS[now.movablePiecePoint]) {
					byte nextDepth = (byte)(now.depth+1);
					queue.add(new Puzzle(nextDepth, move(now.state, now.movablePiecePoint, nextMove)));
				}
			}
			isVisit.set(now.stateCode, true);
		}
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}