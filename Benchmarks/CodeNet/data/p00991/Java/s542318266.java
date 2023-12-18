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

    @Override public boolean equals( final Object o ) {
	if( ! ( o instanceof Point ) ) {
	    return false;
	}
	final Point p = ( Point )o;
	return x == p.x && y == p.y;
    }

    public int hashCode() {
	return x * 1419418249 + y * 1029418721;
    }

    public String toString() {
	return String.format( "(%d, %d)", y, x );
    }
}

class Main {

    static final int[] dx = { -1, 0, 1, 0 };
    static final int[] dy = { 0, 1, 0, -1 };
    
    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int r = stdin.nextInt();
	final int c = stdin.nextInt();
	final int a1 = stdin.nextInt();
	final int a2 = stdin.nextInt();
	final int b1 = stdin.nextInt();
	final int b2 = stdin.nextInt();

	final long[][] map = new long[ c ][ r ];
	map[ a2 ][ a1 ] = 1L;
	final boolean[][] visited = new boolean[ c ][ r ];
	visited[ a2 ][ a1 ] = true;

	final Set<Point> before = new HashSet<Point>();
	final Point start = new Point( a2, a1 );
	before.add( start );
	final Set<Point> after = new HashSet<Point>();

	boolean success = false;
	
	while ( !success ) {
	    for ( final Point p : before ) {
		for ( int i = 0; i < 4; i++ ) {
		    final int nx = p.x + dx[ i ];
		    final int ny = p.y + dy[ i ];
		    success |= exec( ny, nx, after, map, p, b1, b2, visited );
		}
		success |= exec( p.y, 0, after, map, p, b1, b2, visited );
		success |= exec( p.y, r - 1, after, map, p, b1, b2, visited );
		success |= exec( 0, p.x, after, map, p, b1, b2, visited );
		success |= exec( c - 1, p.x, after, map, p, b1, b2, visited );
	    }
	    before.clear();
	    for ( final Point p : after ) {
		visited[ p.y ][ p.x ] = true;
	    }
	    before.addAll( after );
	    after.clear();
	}
	System.out.println( map[ b2 ][ b1 ] );	
    }

    static void printMap( final long[][] a ) {
	for ( final long[] ar :  a ) {
	    for ( final long val : ar ) {
		System.err.print( val + "," );
	    }
	    System.err.println();
	}
    }

    static boolean exec( final int ny, final int nx, final Set<Point> after,
			 final long[][] map, final Point p,
			 final int b1, final int b2, boolean[][] visited ) {

	final int c = map.length;
	final int r = map[ 0 ].length;
	final Point next = new Point( ny, nx );
	
	if( 0 <= nx && nx < r &&
	    0 <= ny && ny < c && !visited[ ny ][ nx ] ) {
	    
	    map[ ny ][ nx ] += map[ p.y ][ p.x ];
	    map[ ny ][ nx ] %= 100000007L;
	    if ( !after.contains( next ) ) {
		after.add( next );
	    }
	}
	return nx == b1 && ny == b2;
    }    
}