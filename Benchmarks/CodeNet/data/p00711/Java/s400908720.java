import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Point {

	final int y;
	final int x;

	Point( final int y, final int x ) {
		this.y = y;
		this.x = x;
	}	
}

class Main {

    public static void main( final String[] args ) throws IOException {

		final BufferedReader br = new BufferedReader( new InputStreamReader(System.in ) );

		while ( true ) {

			final int[] hw = parse( br.readLine().split( " " ) );
			final int width = hw[ 0 ];
			final int height = hw[ 1 ];
			if ( height == 0 && width == 0 ) break;
			final char[][] map = new char[ height ][];
			for ( int i = 0; i < height; i++ ) {
				map[ i ] = br.readLine().toCharArray();
			}
			solve( map );
		}	
    }

	static void solve( final char[][] map ) {
		final Point start = findStart( map );
		System.out.println( dfs( map, start.y, start.x ) );
	}

	static final int[] dx = { -1, 0, 1, 0 };
	static final int[] dy = { 0, 1, 0, -1 };
	
	static int dfs( final char[][] map, final int y, final int x ) {
		int count = 1;
		map[ y ][ x ] = 'o';
		
		for ( int i = 0; i < 4; i++ ) {
			final int nx = x + dx[ i ];
			final int ny = y + dy[ i ];
			if ( 0 <= ny && ny < map.length &&
				 0 <= nx && nx < map[ ny ].length &&
				 map[ ny ][ nx ] == '.' ) {

				count += dfs( map, ny, nx );
			}
		}
		return count;
	}

	static Point findStart( final char[][] map ) {
		for ( int y = 0; y < map.length; y++ ) {
			for ( int x = 0; x < map[ y ].length; x++ ) {
				if ( map[ y ][ x ] == '@' ) {
					return new Point( y, x );
				}
			}
		}
		return null;
	}

	static int[] parse( String[] sinput ) {
		final int[] input = new int[ sinput.length ];
		for ( int i = 0; i < input.length; i++ ) {
			input[ i ] = Integer.parseInt( sinput[ i ].trim() );
		}
		return input;
	}	
}