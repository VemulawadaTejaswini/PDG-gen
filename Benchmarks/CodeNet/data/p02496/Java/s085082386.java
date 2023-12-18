import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean[][] card = new boolean[5][14];	//1:S,2:H,3:C,4:D???[0][n]??¨[n][0]???????????????
		int n = Integer.parseInt(scan.next());
		char picture;
		int number;
		for( int i = 0; i < 5; i++ ){
			for( int j = 0; j < 14; j++ ){
				card[i][j] = false;
			}
		}
		
		for( int i = 0; i < n; i++ ){
			card[CheckCtoI((scan.next()).charAt(0))][Integer.parseInt(scan.next())] = true;
		}
		
		for( int i = 1; i <= 4; i++ ){
			for( int j = 1; j <=13 ; j++ ){
				if( card[i][j] == false ){
					System.out.println(CheckItoC(i) + " " + j);
				}
			}
		}
		
		return;
	}
	public static int CheckCtoI(char c){
		if( c == 'S' ){
			return 1;
		}else if( c == 'H' ){
			return 2;
		}else if( c == 'C' ){
			return 3;
		}else if( c == 'D' ){
			return 4;
		}
		return 0;
	}
	
	public static char CheckItoC(int n){
		if( n == 1 ){
			return 'S';
		}else if( n == 2 ){
			return 'H';
		}else if( n == 3 ){
			return 'C';
		}else if( n == 4 ){
			return 'D';
		}
		return 'X';
	}
}