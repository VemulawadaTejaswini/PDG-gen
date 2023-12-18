import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int N = stdin.nextInt();
	final int K = stdin.nextInt();

	final long[][] rects = new long[ N ][ 6 ];
	for ( int i = 0; i < N; i++ ) {
	    for ( int j = 0; j < 6; j++ ) {
		rects[ i ][ j ] = stdin.nextLong();
	    }
	}
	final ArrayList<Long> xs = new ArrayList<Long>();
	final ArrayList<Long> ys = new ArrayList<Long>();
	final ArrayList<Long> zs = new ArrayList<Long>();

	for ( int i = 0; i < N; i++ ) {
	    if ( !xs.contains( rects[ i ][ 0 ] ) ) {
		xs.add( rects[ i ][ 0 ] );
	    }
	    if ( !xs.contains( rects[ i ][ 3 ] ) ) {
		xs.add( rects[ i ][ 3 ] );
	    }
	    if ( !ys.contains( rects[ i ][ 1 ] ) ) {
		ys.add( rects[ i ][ 1 ] );
	    }
	    if ( !ys.contains( rects[ i ][ 4 ] ) ) {
		ys.add( rects[ i ][ 4 ] );
	    }
	    if ( !zs.contains( rects[ i ][ 2 ] ) ) {
		zs.add( rects[ i ][ 2 ] );
	    }
	    if ( !zs.contains( rects[ i ][ 5 ] ) ) {
		zs.add( rects[ i ][ 5 ] );
	    }
	}
	Collections.sort( xs );
	Collections.sort( ys );
	Collections.sort( zs );

	final int[][][] compressedRect = new int[ xs.size() ][ ys.size() ][ zs.size() ];

	for ( int i = 0; i < N; i++ ) {
	    final int fromX = Collections.binarySearch( xs, rects[ i ][ 0 ] );
	    final int toX = Collections.binarySearch( xs, rects[ i ][ 3 ] );
	    final int fromY = Collections.binarySearch( ys, rects[ i ][ 1 ] );
	    final int toY = Collections.binarySearch( ys, rects[ i ][ 4 ] );
	    final int fromZ = Collections.binarySearch( zs, rects[ i ][ 2 ] );
	    final int toZ = Collections.binarySearch( zs, rects[ i ][ 5 ] );

	    for ( int x = fromX; x < toX; x++ ) {
		for ( int y = fromY; y < toY; y++ ) {
		    for ( int z = fromZ; z < toZ; z++ ) {
			compressedRect[ x ][ y ][ z ]++;
		    }
		}
	    }
	}

	long volume = 0L;
	for ( int x = 0; x < compressedRect.length - 1; x++ ) {
	    for ( int y = 0; y < compressedRect[ x ].length - 1; y++ ) {
		for ( int z = 0; z < compressedRect[ x ][ y ].length - 1; z++ ) {
		    if ( compressedRect[ x ][ y ][ z ] >= K ) {
			volume += ( xs.get( x + 1 ) - xs.get( x ) ) *
			    ( ys.get( y + 1 ) - ys.get( y ) ) *
			    ( zs.get( z + 1 ) - zs.get( z ) );
		    }
		}
	    }
	}
	System.out.println( volume );
    }    
}