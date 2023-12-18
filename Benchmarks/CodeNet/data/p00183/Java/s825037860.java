import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int[][] board = new int[3][3];
			
			for(int i = 0; i < 3; i++){
				char[] strs = sc.nextLine().toCharArray();
			
				if(strs[0] == '0'){
					return;
				}
				
				for(int j = 0; j < 3; j++){
					board[i][j] = strs[j] == 'b' ? 1 : strs[j] == 'w' ? -1 : 0;
				}
			}
			
			if((board[0][0] == 1 &&  board[0][1] == 1 && board[0][2] == 1) ||
			   (board[1][0] == 1 &&  board[1][1] == 1 && board[1][2] == 1) ||
			   (board[2][0] == 1 &&  board[2][1] == 1 && board[2][2] == 1) ||
			   (board[0][0] == 1 &&  board[1][0] == 1 && board[2][0] == 1) ||
			   (board[0][1] == 1 &&  board[1][1] == 1 && board[2][1] == 1) ||
			   (board[0][2] == 1 &&  board[1][2] == 1 && board[2][2] == 1) ||
			   (board[0][0] == 1 &&  board[1][1] == 1 && board[2][2] == 1) ||
			   (board[0][2] == 1 &&  board[1][1] == 1 && board[2][0] == 1)){
				System.out.println('b');
			}else if((board[0][0] == -1 &&  board[0][1] == -1 && board[0][2] == -1) ||
					(board[1][0] == -1 &&  board[1][1] == -1 && board[1][2] == -1) ||
					(board[2][0] == -1 &&  board[2][1] == -1 && board[2][2] == -1) ||
					(board[0][0] == -1 &&  board[1][0] == -1 && board[2][0] == -1) ||
					(board[0][1] == -1 &&  board[1][1] == -1 && board[2][1] == -1) ||
					(board[0][2] == -1 &&  board[1][2] == -1 && board[2][2] == -1) ||
					(board[0][0] == -1 &&  board[1][1] == -1 && board[2][2] == -1) ||
					(board[0][2] == -1 &&  board[1][1] == -1 && board[2][0] == -1)){
				System.out.println('w');
			}else{
				System.out.println("NA");
			}
			   
		}
		
		
		
	}
	
	
}