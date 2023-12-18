import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private final int x = 2;
	private final int y = 4;
	final int size = x*y;
	private final static byte[][] MOVABLE_PAIRS = {
		{1,4}, {0,2,5}, {1,3,6}, {2,7},
		{0,5}, {1,4,6}, {2,5,7}, {3,6}
	};
	private final int answerStateCode = 1234567;	
	private final static int[] coefficients = {10000000,1000000,100000,10000,1000,100,10,1};
	
	private Main() {
		Scanner in = new Scanner(System.in);
	
		while(in.hasNext()) {
			byte[] puzzle = new byte[size];
			for(int i=0; i<size; i++) {
				puzzle[i] = in.nextByte();
			}
			System.out.println(solve(puzzle));
		}
		in.close();
	}
		
	class Puzzle {
		byte[] state;
		byte depth;
		byte movablePiecePoint;
		int stateCode;

		public Puzzle (byte depth, byte[] state){
			this.depth = depth;
			this.state = state;
			
			for(byte i=0; i<size; i++) {
				if(state[i]==0) {
					this.movablePiecePoint = i;
				}
				this.stateCode += coefficients[i]*state[i];
			}
		}
		
		public byte[] move(byte point1, byte point2) {
			byte[] nextState = Arrays.copyOf(this.state, size);
			byte tmp = nextState[point1];
			nextState[point1] = nextState[point2];
			nextState[point2] = tmp;
			return nextState;
		}
	}
	
	private int solve(byte[] puzzle) {
		LinkedList<Puzzle> queue = new LinkedList<Puzzle>();
		BitSet isVisit = new BitSet();
		
		queue.add(new Puzzle((byte)0, puzzle));
		Puzzle now;
		while(!queue.isEmpty()) {
			now = queue.poll();

			if(answerStateCode == now.stateCode) {
				return now.depth;
			}

			if(!isVisit.get(now.stateCode)) {
				for(byte nextMove : MOVABLE_PAIRS[now.movablePiecePoint]) {
					byte nextDepth = (byte)(now.depth+1);
					queue.add(new Puzzle(nextDepth, now.move(now.movablePiecePoint, nextMove)));
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