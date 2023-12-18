import java.util.*;

public class Main {
	
	private static int board[][] = new int[8][8];
	
	public static void main(String[] args) {
		
		//input
		Scanner sc = new Scanner(System.in);
		
		char[] c;
		char ret;
		int call_cnt = 0;
		while(sc.hasNext()){
			call_cnt++;
			for(int i=0;i<8;i++){
				c = sc.next().toCharArray();
				for(int j=0;j<8;j++){
					board[i][j] = Character.digit(c[j],10);
				}
			}
			
			ret = 'N';
			loop:for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(board[i][j] == 1){
						ret = check(i,j);
						if(!(ret == 'N')){break loop;}
					}
				}
			}
			System.out.println(ret);
		}
	}
	
	private static char check(int i,int j){
		char ret = 'N';
		if      (check_A(i,j)){ret = 'A';}
		else if (check_B(i,j)){ret = 'B';}
		else if (check_C(i,j)){ret = 'C';}
		else if (check_D(i,j)){ret = 'D';}
		else if (check_E(i,j)){ret = 'E';}
		else if (check_F(i,j)){ret = 'F';}
		else if (check_G(i,j)){ret = 'G';}
		return ret;
	}
	
	private static boolean check_A(int i,int j){
		boolean ret = false;
		if(i+1 != 8 && j+1 != 8){
			if(board[i][j+1]   == 1 &&
			   board[i+1][j]   == 1 &&
			   board[i+1][j+1] == 1){
				ret = true;
			}
		}
		return ret;
	}
	
	private static boolean check_B(int i,int j){
		boolean ret = false;
		if(i+3 < 8){
			ret = true;
			for(int k=1;k<4;k++){
				if(board[i+k][j] != 1){
					ret = false;
				}
			}
		}
		return ret;
	}
	
	private static boolean check_C(int i,int j){
		boolean ret = false;
		if(j+3 < 8){
			ret = true;
			for(int k=1;k<4;k++){
				if(board[i][j+k] != 1){
					ret = false;
				}
			}
		}
		return ret;
	}
	
	private static boolean check_D(int i,int j){
		boolean ret = false;
		if(i+2 < 8 && j-1 != -1){
			if(board[i+1][j]   == 1 &&
			   board[i+1][j-1] == 1 &&
			   board[i+2][j-1] == 1){
				ret = true;
			}
		}
		return ret;
	}
	private static boolean check_E(int i,int j){
		boolean ret = false;
		if(i+1 != 8 && j+2 < 8){
			if(board[i][j+1]   == 1 &&
			   board[i+1][j+1] == 1 &&
			   board[i+1][j+2] == 1){
				ret = true;
			}
		}
		return ret;
	}
	private static boolean check_F(int i,int j){
		boolean ret = false;
		if(i+2 < 8 && j+1 != 8){
			if(board[i+1][j]   == 1 &&
			   board[i+1][j+1] == 1 &&
			   board[i+2][j+1] == 1){
				ret = true;
			}
		}
		return ret;
	}

	private static boolean check_G(int i,int j){
		boolean ret = false;
		if(i+1 != 8 && j+1 != 8 && i-1 != -1 ){
			if(board[i][j+1]   == 1 &&
			   board[i+1][j]   == 1 &&
			   board[i+1][j-1] == 1){
				ret = true;
			}
		}
		return ret;
	}
}