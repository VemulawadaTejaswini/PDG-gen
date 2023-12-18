import java.util.*;
import java.io.*;

class Main {
	public static void main( final String[] args ) {

		Scanner sc = new Scanner( System.in );
		int n = Integer.parseInt( sc.nextLine() );

		for ( int i = 1; i <= n; i++ ) {
			sc.next();
			char[][] map = new char[8][];
			for ( int j = 0; j < 8; j++ ) {
				map[j] = sc.next().toCharArray();
			}
			int x = Integer.parseInt( sc.next() ) - 1;
			int y = Integer.parseInt( sc.next() ) - 1;

			don( map, y, x );
			System.out.printf( "Data %d:\n", i);
			for ( int k = 0; k < map.length; k++ ) {
				for ( int j = 0; j < map[k].length; j++ ) {
					System.out.print( map[k][j] );
				}
				System.out.println();
			}
		}   
	}

	static void don( char[][] map, int y, int x ) {

		map[y][x] = '0';

		int minX = Math.max( x - 3, 0 );
		int maxX = Math.min( x + 3, 7 );
		int minY = Math.max( y - 3, 0 );
		int maxY = Math.min( y + 3, 7 );

		for ( int i = minX; i <= maxX; i++ ) {
			if ( map[y][i] == '1' ) {
				don( map, y, i );
			}
		}
		for ( int i = minY; i <= maxY; i++ ) {
			if ( map[i][x] == '1' ) {
				don( map, i, x );
			}
		}   
	}    
}