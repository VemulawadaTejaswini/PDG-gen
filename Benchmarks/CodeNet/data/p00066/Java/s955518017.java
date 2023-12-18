public class Main {

	public static void main(String[] args) {
		//do something
	}

	public static final char CIRCLE = 'o';
	public static final char CROSS = 'x';
	public static final char DRAW = 'd';	
	public static char judgeWinner(String boardStr){
		char[][] board = createBoard(boardStr);
		if(judgeWin(board, CIRCLE))	return CIRCLE;
		if(judgeWin(board,CROSS))	return CROSS;
		return DRAW;
	}
	
	private static final int WIN = 3;
	private static boolean judgeWin(char[][] board, char player){
		int count = 0;
		//横
		for(int i = 0; i < board.length; i++){
			count = 0;
			for(int j = 0; j < board[0].length; j++){
				if(board[i][j] == player)	count++;
			}
			if(count == WIN)	return true;
		}
		//縦
		for(int j = 0; j < board[0].length; j++){
			count = 0;
			for(int i = 0; i < board.length; i++){
				if(board[i][j] == player)	count++;
			}
			if(count == WIN)	return true;
		}
		//斜め
		count = 0;
		for(int i = 0; i < board.length; i++){
			if(board[i][i] == player)	count++; 
		}
		if(count == WIN)	return true;
		count = 0;
		for(int i = 2; i >= 0; i--){
			if(board[i][i] == player)	count++; 
		}
		if(count == WIN)	return true;
		return false;
	}
	
	private static char[][] createBoard(String boardStr){
		char[][] board = new char[3][3];
		String line = null;
		for(int i = 0; i < 3; i++){
			line = boardStr.substring(i * 3, i * 3 + 3);
			board[i] = line.toCharArray();
		}
		return board;
	}
}