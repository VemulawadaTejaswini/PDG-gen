import java.util.* ;

public class Main {
	
	public static void main( String[] args ) {
		
		Scanner sc			= new Scanner( System.in ) ;
		int		N			= sc.nextInt();
		int		field[][]	= new int[2][N];
		
		for( int i = 0; i < 2; i++ ) {
			for( int j = 0; j < N; j++ ) {
				field[i][j] = sc.nextInt();
			}
		}
		
		field[1][0] += field[0][0] ;
		
		for( int j = 1; j < N; j++ ) {
			field[0][j] += field[0][j-1] ;
			field[1][j] += field[0][j] < field[1][j-1] ? field[1][j-1] : field[0][j] ;
		}
		
		System.out.println( field[1][N-1] ) ;
	}
}
