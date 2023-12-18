import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem1201_LatticePractices {
public class Main {
	
	public static void main(String[] args) {
		try {
		//	Problem1201_LatticePractices test = new Problem1201_LatticePractices();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//	
			String line;
			while((line = reader.readLine()) != null) {
				if(line.equals("END")) {
					break;
				}
				test.showAnswer(line);
			}
		//	
			
		//	test.showAnswer("10000 01000 00100 00110 11111 01110 10110 11000 11100 11110");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(String line) {
		Board[] boards = createBoards(line);
		int result = getPossibleConfigration(boards);
		System.out.println(result);
	//	System.out.println(getConfigrationNumber(boards, 1, 2, 3, 4));
		
	}
	Board[] createBoards(String line) {
		String[] textArray = line.split(" ");
		
		Board[] boards = new Board[10];
		for(int i = 0; i < 10; i++) {
			String text = textArray[i];
			boolean[] slits = new boolean[5];
			for(int j = 0; j < 5; j++) {
				char depth = text.charAt(j);
				if(depth == '1') {
					slits[j] = true;
				} else if(depth == '0') {
					slits[j] = false;
				} else {
					throw new IllegalArgumentException("eLXgªs³ : " + text + "\tÁÉ" + i + "ÔÚ");
				}
			}
			boards[i] = new Board(slits);
		}
		return boards;
	}
	int getPossibleConfigration(Board[] boards) {
		int possibleCount = 0;
		for(int i = 1; i < 7; i++) {
			for(int j = i+1; j < 8; j++) {
				for(int k = j+1; k < 9; k++) {
					for(int l = k+1; l < 10; l++) {
						int configrationNumber = getConfigrationNumber(boards, i, j, k, l);
						possibleCount += configrationNumber;
					}
				}
			}
		}
		return possibleCount;
	}
	private int getConfigrationNumber(Board[] boards, int second, int third, int fourth, int fifth) {
		if(boards.length != 10) {
			throw new IllegalArgumentException("boards.lengthªs³ : " + boards.length);
		}
		int result = 0;
		Board[][] dividedBoard = createDividedBoards(boards, 0, second, third, fourth, fifth);
		Board[] originalHorizontalBoards = dividedBoard[0];
		BoardList originalVerticalBoardList = new BoardList(dividedBoard[1]);
		SuccessBedStack successBedStack = new SuccessBedStack();
		for(int i = 0; i < 5; i++) {
		//	System.out.println("fJ[v" + i  + "ñÚ");	/*************
			CocoonBed bed = new CocoonBed();
			BedStack cocoonBedStack = new BedStack();
			BoardList originalHorizontalBoardList = new BoardList(originalHorizontalBoards);
			originalHorizontalBoardList.delete(originalHorizontalBoards[i]);
			bed.setHorizontalBoard(originalHorizontalBoards[i]);
			bed.setVerticalBoardCandidates(originalVerticalBoardList);
			
			bed.setHorizontalBoardCandidates(originalHorizontalBoardList);
			
			
			while(bed != null) {
		//	for(int j = 1; j < 10; j = bed.getNumberOfPutted()) {
				int puttedCount; 
				
				if((puttedCount = bed.getNumberOfPutted()) == 10) {
					if(successBedStack.exists(bed)) {
						//dont count
					} else {
						successBedStack.push(bed);
						result++;
					}
					bed = cocoonBedStack.pop();
			//		System.out.println("*****¬÷******");		/*************
				} else {
					int position = puttedCount / 2;
			//		System.out.println("~j[v" + puttedCount + "ÂzuÏÝ\tposition = "+ position);	/*************
				//	BoardList horizontalBoardList = bed.getHorizontalBoardCandidates();
				//	BoardList verticalBoardList = bed.getVerticalBoardCandidates();
					
					int[] positions = new int[(puttedCount+1)/2];
					for(int k = 0; k < positions.length; k++) {
						positions[k] = k;
					}
					if(puttedCount % 2 == 0) {		//ôÈç¡ûüÌzu
						BoardList horizontalBoardList = bed.getHorizontalBoardCandidates();
						Board[] candidates = horizontalBoardList.getPuttableBoards(positions, bed.getHorizontalRequiredSlit(position));
						
						for(int k = 0; k < candidates.length; k++) {
							Board candidateBoard = candidates[k];
						//	System.out.println("candidateBoard : " + candidateBoard);
							if(candidateBoard == null) {
								break;
							} else {
								CocoonBed newBed = bed.copy();
								newBed.setHorizontalBoard(candidateBoard);
								newBed.getHorizontalBoardCandidates().delete(candidateBoard);
								cocoonBedStack.push(newBed);
							}
						}
					} else {				//ïÈçcûüÌzu
						BoardList verticalBoardList = bed.getVerticalBoardCandidates();
					//	System.out.println("verticalBoardList: " + verticalBoardList);	/*************
						Board[] candidates = verticalBoardList.getPuttableBoards(positions, bed.getVerticalRequiredSlit(position));
						for(int k = 0; k < candidates.length; k++) {
							Board candidateBoard = candidates[k];
					//		System.out.println("candidateBoard : " + candidateBoard);	/*************
							if(candidateBoard == null) {
								break;
							} else {
								CocoonBed newBed = bed.copy();
								newBed.setVerticalBoard(candidateBoard);
								newBed.getVerticalBoardCandidates().delete(candidateBoard);
								cocoonBedStack.push(newBed);
							}
						}
					}
					bed = cocoonBedStack.pop();
				}
			}
		}
		return result;
	}
	private Board[][] createDividedBoards(Board[] boards, int first, int second, int third, int fourth, int fifth) {
		Board[][] dividedBoards = new Board[2][5];
		
		for(int i = 0, maincount = 0, subcount = 0; i < 10; i++) {
			if(i == fifth || i == fourth || i == third || i == second || i == first) {
				dividedBoards[0][maincount] = boards[i];
			//	System.out.println("main\t" + boards[i]);	/*************
				maincount++;
			} else {
				dividedBoards[1][subcount] = boards[i];
			//	System.out.println("sub\t" + boards[i]);	/*************
				subcount++;
			}
		}
		return dividedBoards;
	}
	private class SuccessBedStack {
		private BedNode top;
		final BedNode FLOOR_NODE = new BedNode(null);
		SuccessBedStack() {
			top = FLOOR_NODE;
		}
		void push(CocoonBed bed) {
			BedNode node = new BedNode(bed);
			node.setPreviousNode(top);
			top = node;
		}
		boolean exists(CocoonBed bed) {
			BedNode currentNode = top;
			
			while(currentNode != FLOOR_NODE) {
				if(currentNode.getBed().equals(bed)) {
					return true;
				} else {
					currentNode = currentNode.getPreviousNode();
				}
			}
			return false;
		}
	}
	private class BedNode {
		private BedNode previous;
		private CocoonBed node;
		
		BedNode(CocoonBed bed) {
			node = bed;
			previous = null;
		}
		CocoonBed getBed() {
			return node;
		}
		void setPreviousNode(BedNode bed) {
			previous = bed;
		}
		BedNode getPreviousNode() {
			return previous;
		}
	}
	private class BedStack {
		private CocoonBed top;
		
		BedStack() {
			top = null;
		}
		void push(CocoonBed bed) {
			bed.setPreviousBed(top);
			top = bed;
		}
		CocoonBed pop() {
			CocoonBed result = top;
			if(result == null) {
				return null;
			} else {
				top = top.getPreviousBed();
				return result;
			}
		}
	}
	private class CocoonBed {
		private CocoonBed previousBed;
		private Board[] horizontalBoard;
		private Board[] verticalBoard;
		private int verticalcount;
		private int horizontalcount;
		
		private BoardList horizontalBoardCandidates;
		private BoardList verticalBoardCandidates;
		
		CocoonBed() {
			setPreviousBed(null);
			horizontalBoard = new Board[5];
			verticalBoard = new Board[5];
			verticalcount = 0;
			horizontalcount = 0;
			
		}
		int getNumberOfPutted() {
			return horizontalcount + verticalcount;
		}
		boolean[] getHorizontalRequiredSlit(int rowNumber) {
		//	System.out.println("verticalcount: " + verticalcount);	/*************
			boolean[] result = new boolean[verticalcount];
			for(int i = 0; i < result.length; i++) {
				result[i] = (getVerticalBoard(i).isShallow(rowNumber) ? false : true);
			}
			return result;
		}
		boolean[] getVerticalRequiredSlit(int columnNumber) {
			boolean[] result = new boolean[horizontalcount];
			for(int i = 0; i < result.length; i++) {
				result[i] = (getHorizontalBoard(i).isShallow(columnNumber) ? false : true);
			//	System.out.println("getHorizontalBoard(" + i + ") = " + getHorizontalBoard(i));	/*************
			}
			return result;
		}
		void setHorizontalBoard(Board board) {
			horizontalBoard[horizontalcount] = board;
			horizontalcount++;
		//	System.out.println("¡ûüÌzu:" + board);	/*************
		}
		void setVerticalBoard(Board board) {
			verticalBoard[verticalcount] = board;
			verticalcount++;
		//	System.out.println("cûüÌzu:" + board);	/*************
		}
		Board getHorizontalBoard(int position) {
			return horizontalBoard[position];
		}
		Board getVerticalBoard(int position) {
			return verticalBoard[position];
		}
		Board[] getHorizontalBoards() {
			return horizontalBoard;
		}
		void setPreviousBed(CocoonBed bed) {
			previousBed = bed;
		}
		CocoonBed getPreviousBed() {
			return previousBed;
		}
		void setHorizontalBoardCandidates(BoardList list) {
			horizontalBoardCandidates = list;
		}
		void setVerticalBoardCandidates(BoardList list) {
			verticalBoardCandidates = list;
		}
		BoardList getHorizontalBoardCandidates() {
			return horizontalBoardCandidates;
		}
		BoardList getVerticalBoardCandidates() {
			return verticalBoardCandidates;
		}
		CocoonBed copy() {
			CocoonBed clone = new CocoonBed();
			for(int i = 0; i < horizontalcount; i++) {
				clone.setHorizontalBoard(getHorizontalBoard(i));
			}
			for(int i = 0; i < verticalcount; i++) {
				clone.setVerticalBoard(getVerticalBoard(i));
			}
			clone.setHorizontalBoardCandidates(getHorizontalBoardCandidates().copy());
			clone.setVerticalBoardCandidates(getVerticalBoardCandidates().copy());
			return clone;
		}
		private boolean isObverseHorizontalBoardsEquals(Board[] anotherHorizontalBoard) {
			for(int i = 0; i < horizontalBoard.length; i++) {
				if(horizontalBoard[i].isObverseEquals(anotherHorizontalBoard[i])) {
					//loop more
				} else {
					for(int j = 0; j < horizontalBoard.length; j++) {
						if(horizontalBoard[j].isObverseEquals(anotherHorizontalBoard[anotherHorizontalBoard.length - 1 - j])) {
							//loop more
						} else {
							return false;
						}
					}
					return true;
				}
			}
			return true;
		}
		private boolean isReverseHorizontalBoardsEquals(Board[] anotherHorizontalBoard) {
			for(int i = 0; i < horizontalBoard.length; i++) {
				if(horizontalBoard[i].isReverseEquals(anotherHorizontalBoard[i])) {
					//loop more
				} else {
					for(int j = 0; j < horizontalBoard.length; j++) {
						if(horizontalBoard[j].isReverseEquals(anotherHorizontalBoard[anotherHorizontalBoard.length - 1 - j])) {
							//loop more
						} else {
							return false;
						}
					}
					return true;
				}
			}
			return true;
		}
		@Override
		public boolean equals(Object o) {
			if(o instanceof CocoonBed) {
				CocoonBed another = (CocoonBed)o;
				
				Board[] anotherHorizontalBoard = another.getHorizontalBoards();
				if(isObverseHorizontalBoardsEquals(anotherHorizontalBoard)) {
					return true;
				}
				if(isReverseHorizontalBoardsEquals(anotherHorizontalBoard)) {
					return true;
				}
				return false;
			} else {
				return false;
			}
		}
		@Override
		public String toString() {
			StringBuilder resultBuilder = new StringBuilder();
			for(int i = 0; i < verticalBoard.length; i++) {
				resultBuilder.append(horizontalBoard[i]);
				resultBuilder.append("\t");
				resultBuilder.append(verticalBoard[i]);
				resultBuilder.append("\n");
			}
			return resultBuilder.toString();
		}
	}
	private class BoardList {
		private Board[] list;
		private int max;	//max-1 ÜÅªÎÛ maxÂ éÆ¢¤Ó¡
		
		BoardList(Board[] array) {
			Board[] newArray = new Board[array.length];
			System.arraycopy(array, 0, newArray, 0, newArray.length);
			this.list = newArray;
			max = list.length;
		}
		boolean delete(Board targetBoard) {
			boolean isDeleted = false;
		//	System.out.println("max:" + max);
			for(int i = 0; i < max; i++) {
				if(targetBoard.equals(list[i])) {
					for(int j = i; j < max-1; j++) {
						list[j] = list[j+1];
					}
					list[max-1] = null;
					max--;
					isDeleted = true;
				}
			}
			return isDeleted;
		}
		Board[] getPuttableBoards(int[] positions, boolean[] depths) {
			if(positions.length != depths.length) {
				throw new IllegalArgumentException("positions.length = " + positions.length + "depths.length = " + depths.length);
			}
			Board[] resultBoards = new Board[max*2];
			int count = 0;
			for(int i = 0; i < max; i++) {
				Board board = list[i];
				if(board.isPuttable(positions, depths)) {
				//	System.out.println("puttableBoards[" + count + "] = " + board);	/*************
					resultBoards[count] = board;
					count++;
				}
				if(board.isReversePuttable(positions, depths)) {
					Board reverseBoard = board.getReverseBoard();
					if(reverseBoard == null) {
						//do nothing
					} else {
				//		System.out.println("puttableBoards[" + count + "] = " + reverseBoard);	/*************
						resultBoards[count] = reverseBoard;
						count++;
					}
				}
			}
			
			return resultBoards;
		}
		BoardList copy() {
			Board[] trimmedArray = new Board[max];
			System.arraycopy(list, 0, trimmedArray, 0, max);
			return new BoardList(trimmedArray);
		}
		@Override
		public String toString() {
			StringBuilder resultBuilder = new StringBuilder();
			for(int i = 0; i < max; i++) {
				resultBuilder.append(list[i] + "\t");
			}
			return resultBuilder.toString();
		}
	}
	private class Board {
		private boolean[] slits;	//trueÈç1(shallow) falseÈç0(deep)
		
		Board(boolean[] slits) {
			if(slits.length == 5) {
				this.slits = slits;
			} else {
				throw new IllegalArgumentException("slits.lengthªs³ : " + slits.length);
			}
		}
		Board getReverseBoard() {
			boolean[] reverseSlits = new boolean[slits.length];
			if(isSymmetry()) {
				return null;
			}
			for(int i = 0; i < reverseSlits.length; i++) {
				reverseSlits[i] = slits[slits.length - i - 1];
			}
			return new Board(reverseSlits);
		}
		boolean isShallow(int number) {
			return slits[number];	//numberÌlªs³ÈçáOªÔé
		}
		boolean isSymmetry() {	//¶EÎÌ©Ç¤©
			for(int i = 0, j = slits.length; i < j; i++, j--) {
				if(slits[i] == slits[j-1]) {
					//loop more
				} else {
					return false;
				}
			}
			return true;
		}
		boolean[] getSlits() {
			return slits;
		}
		boolean isPuttable(int[] positions, boolean[] depths) {
			for(int i = 0; i < positions.length; i++) {
				if(isShallow(positions[i]) == depths[i]) {
					//loop more
				} else {
					return false;
				}
			}
			return true;
		}
		boolean isReversePuttable(int[] positions, boolean[] depths) {
			for(int i = 0; i < positions.length; i++) {
				if(isShallow(slits.length - positions[i] -1) == depths[i]) {
					//loop more
				} else {
					return false;
				}
			}
			return true;
		}
		boolean isReverseEquals(Board another) {
			boolean[] anotherSlits = another.getSlits();
			for(int i = 0; i < anotherSlits.length; i++) {
				if(slits[i] == anotherSlits[anotherSlits.length-1-i]) {
					//loop more
				} else {
					return false;
				}
			}
			return true;
		}
		boolean isObverseEquals(Board another) {
			boolean[] anotherSlits = another.getSlits();
			for(int i = 0; i < anotherSlits.length; i++) {
				if(slits[i] == anotherSlits[i]) {
					//loop more
				} else {
					return false;
				}
			}
			return true;
		}
		@Override
		public boolean equals(Object o) {
			if(o instanceof Board) {
				Board another = (Board)o;
				boolean[] anotherSlits = another.getSlits();
				for(int i = 0; i < 5; i++) {
					if(slits[i] == anotherSlits[i]) {
						//loop more
					} else {
						for(int j = 0; j < 5; j++) {
							if(slits[j] == anotherSlits[4-j]) {
								//loop more
							} else {
								return false;
							}
						}
						return true;
					}
				}
				return true;
			} else {
				return false;
			}
		}
		@Override
		public String toString() {
			StringBuilder result = new StringBuilder();
			for(boolean b : slits) {
				result.append(b ? 1 : 0);
			}
			return result.toString();
		}
	}
}