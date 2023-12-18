import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] board = new char[3][3];
	
	static boolean read() {
		String line = sc.next();
		if(line.equals("0")) return false;
		board[0][0] = line.charAt(0); board[0][1] = line.charAt(1); board[0][2] = line.charAt(2);
		for(int i = 1; i < 3; i++) {
			line = sc.next();
			for(int j = 0; j < 3; j++) board[i][j] = line.charAt(j);
		}
		return true;
	}
	
	static String solve() {
		char stone;
		boolean win;
		
		for(int i = 0; i < 3; i++) {
			win = true;
			stone = board[i][0];
			for(int j = 1; j < 3; j++) {
				if(stone != board[i][j]) win = false;
			}
			if(win) return "" + stone;
		}
		
		for(int j = 0; j < 3; j++) {
			win = true;
			stone = board[0][j];
			for(int i = 1; i < 3; i++) {
				if(stone != board[i][j]) win = false;
			}
			if(win) return "" + stone;
		}
		
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2]) return "" + board[0][0];
		
		if(board[2][0] == board[1][1]  && board[1][1] == board[0][2]) return "" + board[2][0];
		
		return "NA";
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}

	}

}