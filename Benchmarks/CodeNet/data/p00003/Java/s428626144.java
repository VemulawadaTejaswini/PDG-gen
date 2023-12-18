/* Volume0 0003 Is it a Right Triangle? */
import java.util.Scanner;

class Main{
	public static void main(String[] args){

		int n, temp;
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();
		int[][] side = new int[n][3];

		for( int i = 0; i < n; i++) {
			for( int j = 0; j < 3; j++) {
				side[i][j] = stdIn.nextInt();
			}
			if ( side[i][0] < side[i][1] ){
				temp = side[i][0] ;
				side[i][0] = side[i][1];
				side[i][1] = temp;
			}
			if ( side[i][0] < side[i][2] ){
				temp = side[i][0] ;
				side[i][0] = side[i][2];
				side[i][2] = temp;
			}
		}

		for( int i = 0; i < n; i++) {
			if ( side[i][0]*side[i][0] == side[i][1]*side[i][1] + side[i][2]*side[i][2] ){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}