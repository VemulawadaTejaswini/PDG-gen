package exp0121;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private final static int SIZE = 8;
	
	private final static int[][] MOVABLE_PAIRS = {
		{1,4}, {0,2,5}, {1,3,6}, {2,7},
		{0,5}, {1,4,6}, {2,5,7}, {3,6}
	};
	
	private final static int[] coefficients = {5040, 720, 120, 24, 6, 2, 1, 0};

	private static final int[] ANSWER_STATE = {0,1,2,3,4,5,6,7};
	
	private static final int FORE_DIRECTION = 1;
	private static final int BACK_DIRECTION = -1;
	
	private Main3() {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			int[] puzzle = new int[SIZE];
			for(int i=0; i<SIZE; i++) {
				puzzle[i] = in.nextInt();
			}
			System.out.println(solve(puzzle));
		}
		in.close();
	}
	
	final class Puzzle {
		final int[] state;
		final int depth; 
		final int movablePiecePoint;
		final int point;
		final boolean isRoot;
		int stateCode;
		final int direction;

		public Puzzle(int[] state, int direction) {
			this.isRoot = true;
			this.depth = 0;
			this.state = state;
			this.point = -1;
			this.direction = direction;
			setStateCode();
			
			for(int i=0; i<SIZE; i++) {
				if(state[i]==0) {
					this.movablePiecePoint = i;
					return;
				}
			}
			this.movablePiecePoint = -1;
		}
		
		public Puzzle (Puzzle parent, int nextMove){
			this.isRoot = false;
			this.depth = parent.depth+1;
			this.point = parent.movablePiecePoint;
			this.movablePiecePoint = nextMove;
			this.direction = parent.direction;
			
			this.state = Arrays.copyOf(parent.state, SIZE);
			this.state[this.point] = this.state[nextMove];
			this.state[nextMove] = 0;

			setStateCode();
		}
		
		private final void setStateCode() {
			for(int i=0; i<SIZE-1; i++) {
				int c = 0;
				for(int j=i+1; j<SIZE; j++) {
					if(this.state[i] > this.state[j]) {
						c++;
					}
				}
				this.stateCode += coefficients[i]*c;
			}
		}
		
		public String toString() {
			StringBuilder str = new StringBuilder("");
			for(int s:state) {
				str.append(s+" ");
			}
			return str.toString();
		}
	}

	private final int solve(int[] puzzle) {
		int[] isVisit = new int[50430];
		ArrayDeque<Puzzle> queue = new ArrayDeque<Puzzle>();
		queue.add(new Puzzle(puzzle, FORE_DIRECTION)); // 初期状態から
		queue.add(new Puzzle(ANSWER_STATE, BACK_DIRECTION)); // 完成形から
		while(!queue.isEmpty()) {
			Puzzle now = queue.poll();
			if(now.stateCode==0 && now.direction==FORE_DIRECTION) { // 初期状態から直接完成形にたどり着いた場合
				return now.depth;
			} else if(isVisit[now.stateCode]!=0 && isVisit[now.stateCode]*now.direction<0) { // 01234567のstateCodeは0
				return now.depth + StrictMath.abs(isVisit[now.stateCode]);
			}
			for(int nextMove : MOVABLE_PAIRS[now.movablePiecePoint]) {
				if (now.isRoot || now.point!=nextMove) { // 直前の状態に戻ることを禁止する
					queue.add(new Puzzle(now, nextMove));
				}
			}
			isVisit[now.stateCode] = now.direction*now.depth;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new Main();
	}
}