import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[8][8];
        
        for(int i = 0; i < 8 ; i++){
        	Arrays.fill(board[i], 0);
        }
        
        for(int i = 0; i < n; i++){
        	String[] tmpArray = br.readLine().split(" ");
        	int r = Integer.parseInt(tmpArray[0]);
        	int c = Integer.parseInt(tmpArray[1]);
        	board[r][c] = 1;
        }
        
        for(int i = 0; i < 8; i++){
        	boolean result = putQueen(board, 8, i, getAvailableColumn(board, 8));
        	if(result == true){
        		break;
        	}
        }
        //print
        for(int i = 0; i < 8; i++){
        	for(int j = 0; j < 8 ; j++){
        		if(board[i][j] == 1){
        			System.out.print("Q");
        		}
        		else{
        			System.out.print(".");
        		}
        	}
        	System.out.println();
        }
	}
	
	static int getAvailableColumn(int[][] board, int n){
		int j;
		for(j = 0; j < n ; j++){
			int queen = 0;
			for(int i = 0; i < n; i++){
				if(board[i][j] == 1){
					queen++;
					break;
				}
			}
			if(queen == 0){
				break;
			}
		}
		
		if(j >= n){
			return -1;
		}
		
		else {
			return j;
		}
	}
	
	static boolean putQueen(int[][] board, int n, int r, int c){
		//System.out.println("n "+n + " r "+r+" c "+c);
		//????????????????????????????????????????????????????????¨??????????????£??????
		for(int i = 0; i < n ; i++){
			if(board[i][c] == 1 && i != r){
				//System.out.println("error 1");
				return false;
			}
			if(board[r][i] == 1 && i != c){
				//System.out.println("error 2");
				return false;
			}
		}
		for(int i = 0; i < n; i++){
			if(  r+i < n && c+i < n && board[r+i][c+i] ==1){
				//System.out.println("error 3");
				return false;
			}
			if( r+i < n && c-i >= 0 && board[r+i][c-i] ==1 ){
				//System.out.println("error 4");
				return false;
			}
			if(  r-i >= 0 && c+i < n && board[r-i][c+i] ==1){
				//System.out.println("error 5");
				return false;
			}
			if( r-i >= 0 && c-i >= 0 && board[r-i][c-i] ==1 ){
				//System.out.println("error 6");
				return false;
			}
		}
		//System.out.println("("+r+","+c+") is OK");
		board[r][c] = 1;
		
		int nextColumn = getAvailableColumn(board, 8);
		if(nextColumn < 0){
			return true;
		}
		for(int i = 0; i < n ; i++){
			boolean result = putQueen(board, n, i, nextColumn);
			if(result == true){
				return true;
			}
		}
		board[r][c] = 0;
		return false;
	}

}