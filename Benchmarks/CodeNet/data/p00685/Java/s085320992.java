import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//public class Problem1103_BoardArrangementsForConcentrationGames {
public class Main {
	
	public static void main(String[] args) {
		try {
		//	Problem1103_BoardArrangementsForConcentrationGames test = new Problem1103_BoardArrangementsForConcentrationGames();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				String[] textArray = line.split(" ");
				if(textArray.length > 1) {
					int answer = test.checkBoard(test.createRelativePosition(textArray));
					System.out.println(answer);
				} else {
					int number = Integer.parseInt(textArray[0]);
					if(number > 4) {
						break;
					} else {
						throw new IllegalArgumentException();
					}
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	RelativePosition createRelativePosition(String[] textArray) {
		RelativePosition startPosition = new RelativePosition(Integer.parseInt(textArray[0]), Integer.parseInt(textArray[1]), null);
		RelativePosition position = startPosition;
		for(int i = 1; i < 4; i++) {
			position.setNext(new RelativePosition(Integer.parseInt(textArray[i*2]), Integer.parseInt(textArray[i*2 +1]), null));
			position = position.getNext();
		}
		
		return startPosition;
	}
	
	
	int checkBoard(RelativePosition start) {
		GameBoard gameBoard = new GameBoard();
		RelativePosition position = start;
		RelativePosition startPosition = start;
		
		int answerCount = 0;
		int puttedCount = 0;
		int x = 0, y = 0;  
		while(true) {
			while(puttedCount < 8) {
			//	System.out.println("ÇÁpÚF" + position.toString() + "  \tx:" + x + "\ty:" + y);
				if(gameBoard.isPutted(x,y)) {	//ÝuÏÝÅAputtedCount < 8 ÌÆ«ÍAª éÌÅ¸B
					position = startPosition;
					x = (x < 3 ? x+1 : 0);
					y = (x == 0 ? y+1 : y);
				} else if(gameBoard.put(x, y, position)){	//u¯êÎu­
					position = startPosition;
					x = (x < 3 ? x+1 : 0);
					y = (x == 0 ? y+1 : y);
					puttedCount++;
			//		System.out.println("ÇÁ" + puttedCount +"ÂÚ");
				} else {
					position = position.getNext();	//ÝuÅ«È¯êÎÊÌóâÅÝuµÄÝéB
					
					if(position == null) {	//SÄÌÚÅÝuÅ«È¢êBPÂßéB
			//			System.out.println("positionªÅãÜÅB");
						PuttedPoint removedPoint;
						
						while(true) {
							removedPoint = gameBoard.removeLast();
							if(removedPoint.getRelativePosition().getNext() == null) {
								if(removedPoint.getPreviousPoint() == null) {
			//						System.out.println("jIõI¹");
									return answerCount;
								} else {
									puttedCount--;
								}
							} else {
								position = removedPoint.getRelativePosition().getNext();
								x = removedPoint.getX();
								y = removedPoint.getY();
								puttedCount--;
			//					System.out.println("ßéF" + removedPoint.getRelativePosition() + "\tJE^F" + puttedCount);
								break;
							}
						}
					}
				}
			}
			
			//êñÜÁ½ê
			answerCount++;
		//	System.out.println("****ÜÁ½æ\t" + answerCount + "ñÚ****");
			for(int i = 8; -1 < i; i--) {
				PuttedPoint removedPoint = gameBoard.removeLast();
				position = removedPoint.getRelativePosition().getNext();
				puttedCount--;
				if(position == null) {	//óâªÈ¢ÌÈçà¤êÂßé
					if(i == 0) {	//i == 0@¦¿ASõI¹
			//			System.out.println("jIõI¹");
						return answerCount;
					} else {
						//loop more 	//à¤êÂßé
					}
				} else {
					x = removedPoint.getX();
					y = removedPoint.getY();
					break;	//fJ[và¤êñ
				}
			}
		}
	}
	private class GameBoard {
		private boolean[][] board;	//ÝuÏÝÈçfalse, ¢ÝuÌÆ«true
		private PuttedPoint lastPuttedPoint;
		
		GameBoard(int height, int width) {
			board = new boolean[height][width];
			for(boolean[] boardRow : board) {
				Arrays.fill(boardRow,true);
			}
			lastPuttedPoint= null;
		}
		GameBoard() {
			this(4,4);
		}
		boolean isPutted(int x, int y) {
			boolean result = board[x][y];
			return !result;	//½]Ó
		}
		boolean put(int x, int y, RelativePosition position) {
			if(canAdd(x,y,position)) {
				if(addPosition(x,y,position)) {
					lastPuttedPoint = new PuttedPoint(x, y, position, lastPuttedPoint);
			//		System.out.println("ÇÁF" + "  \tx:" + lastPuttedPoint.getX() + "\ty:" +  lastPuttedPoint.getY());
					return true;
				}
			}
			return false;
		}
		PuttedPoint removeLast() {
			PuttedPoint removedPoint = lastPuttedPoint;
			if(removedPoint == null) {
				return null;
			}
			if(removePosition(lastPuttedPoint.getX(), lastPuttedPoint.getY(), lastPuttedPoint.getRelativePosition())) {
			//	System.out.println("íF" + lastPuttedPoint.getRelativePosition() + "  \tx:" + lastPuttedPoint.getX() + "\ty:" +  lastPuttedPoint.getY());
				lastPuttedPoint = lastPuttedPoint.getPreviousPoint();
				
			/*	if(lastPuttedPoint == null) {
					return null;
				}*/
			} else {
				throw new IllegalStateException("í¸s");
			}
			return removedPoint;
		}
		/*
			øÌÊuÆAyAÌÊu¼ûª¢Ýu¾Á½êÉ true
		*/
		private boolean canAdd(int x, int y, RelativePosition position) {
			int pointX = x;
			int pointY = y;
			
			try {
				if(board[pointX][pointY] && board[x + position.getX()][y + position.getY()]) {
					return true;
				} else {
					return false;
				}
			} catch(IndexOutOfBoundsException e) {
				return false;
			}
		}
		/*
			³ÝuÅ«½çtrue	AµAaddÌêªÝu¢Ýu©Ç¤©mFµÈ¢B
		*/
		private boolean addPosition(int x, int y, RelativePosition position) {
			int pointX = x;
			int pointY = y;
			int pointPairX = pointX + position.getX();
			int pointPairY = pointY + position.getY();
			
			try {
				board[x][y] = false;
				board[pointPairX][pointPairY] = false;
				
				return true;
			} catch(IndexOutOfBoundsException e) {
				return false;
			}
		}
		/*
			³íÅ«½çtrue	AµAremoveÌêªÝuÏÝ©Ç¤©mFµÈ¢B
		*/
		private boolean removePosition(int x, int y, RelativePosition position) {
			int pointX = x;
			int pointY = y;
			int pointPairX = pointX + position.getX();
			int pointPairY = pointY + position.getY();
			
			try {
				board[x][y] = true;
				board[pointPairX][pointPairY] = true;
				
				return true;
			} catch(IndexOutOfBoundsException e) {
				return false;
			}
		}
	}
	private class PuttedPoint {
		private int x;
		private int y;
		
		private PuttedPoint previousPoint;
		private RelativePosition puttedRelativePosition;
		
		PuttedPoint(int x, int y, RelativePosition point, PuttedPoint previous) {
			this.x = x;
			this.y = y;
			puttedRelativePosition = point;
			previousPoint = previous;
		}
		int getX() {
			return x;
		}
		int getY() {
			return y;
		}
		RelativePosition getRelativePosition() {
			return puttedRelativePosition;
		}
		PuttedPoint getPreviousPoint() {
			return previousPoint;
		}
	}
	private class RelativePosition {
		private int x;
		private int y;
		
		private RelativePosition nextPosition;
		
		RelativePosition(int x, int y, RelativePosition next) {
			this.x = x;
			this.y = y;
			nextPosition = next;
		}
		int getX() {
			return x;
		}
		int getY() {
			return y;
		}
		void setNext(RelativePosition position) {
			nextPosition = position;
		}
		RelativePosition getNext() {
			return nextPosition;
		}
		@Override
		public String toString() {
			return "(" + x + "," + y + ")";
		}
	}
}