import java.util.Scanner;

public class Main {
	
	private static final int VACANT = 0;
	private static final int BLOCK = 1;
	private static final int START = 2;
	private static final int GOAL = 3;
	private static final int HOLE = 4;
	private static final int VX[] = new int[]{ 1, 0, -1, 0 };
	private static final int VY[] = new int[]{ 0, 1,  0, -1 };
	private Scanner sc; 

	private int[][] board;
	private void run() {
		sc = new Scanner( System.in );
		while( true ) {
			int h, w;
			int curY = 0, curX = 0;
			w = sc.nextInt();
			h = sc.nextInt();
			if( w == 0 && h == 0 ){ break; }
			board = new int[ h + 2 ][ w + 2 ];
			for( int x = 0; x < w + 2; x++ ) {
				board[ 0 ][ x ] = HOLE;
				board[ h + 1 ][ x ] = HOLE;
			}
			for( int y = 0; y < h + 2; y++ ) {
				board[ y ][ 0 ] = HOLE;
				board[ y ][ w + 1 ] = HOLE;
			}
			for( int y = 1; y < h + 1; y++ ) {
				for( int x = 1; x < w + 1; x++ ) {
					board[ y ][ x ] = sc.nextInt();
					if( board[ y ][ x ] == START ) {
						board[ y ][ x ] = VACANT;
						curX = x;
						curY = y;
					}
				}
			}
			int minpt = Integer.MAX_VALUE;
			for( int i = 0; i < VX.length; i++ ) {
				int pt = dfs( 1, curX, curY, i );
				if( pt != -1 && pt < minpt ) { minpt = pt; }
			}
			if( minpt == Integer.MAX_VALUE ) { minpt = -1; }
			System.out.println( minpt );
		}
	}
	public int dfs( int depth, int x, int y, int dir ) {
		if( depth > 10) { return -1; }

		int dest = board[ y + VY[ dir ] ][ x + VX[ dir ] ];
		if( dest == BLOCK || dest == HOLE ) {
			return -1;
		}
		/*
				System.err.println( moves + " " + dir );
				for( int ly = 0; ly < b.length; ly++ ){
					for( int lx = 0; lx < b[ ly ].length; lx++ ){
						if( ly == y && lx == x ) { System.err.print( "P"); }
						else {System.err.print( b[ ly ][ lx ] );}
					}
					System.err.println();
				}
				System.err.println();
		 */
		while( board[ y ] [ x ] == VACANT ) {
			x += VX[ dir ];
			y += VY[ dir ];
		}

		if(board[ y ][ x ] == BLOCK ) {
			board[ y ][ x ] = VACANT;
			int minpt = Integer.MAX_VALUE;
			for( int i = 0; i < VX.length; i++ ) {
				int pt = dfs( depth + 1, x - VX[ dir ], y - VY[ dir ], i );
				if( pt != -1 && pt < minpt ) { minpt = pt; }
			}
			if( minpt == Integer.MAX_VALUE ) { minpt = -1; }
			board[ y ][ x ] = BLOCK;
			return minpt;
		} else if( board[ y ][ x ] == GOAL ) {
			return depth;
		} else {
			return -1;
		}
	}
	
	public static void main( String[] args ) {
		new Main().run();
	}
}