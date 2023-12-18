import java.io.*;

class Dice {
	private int[] nums;
	public static final int DICEMAX = 6;
	public static final int[] E = { 1, 4, 6, 3 };
	public static final int[] N = { 1, 2, 6, 5 };
	public static final int[] S = { 1, 5, 6, 2 };
	public static final int[] W = { 1, 3, 6, 4 };
	public Dice( int nums[] ) {
		this.nums = new int[DICEMAX];
		for( int i=0; i<DICEMAX; i++ ) {
			this.nums[i] = nums[i];
		}
	}
	public int getDiceNum( int num ) {
		return this.nums[ num ];
	}
	public void rotate( char c ) {
		int tmp = 0;
		if( 'E' == c ) {
			tmp = this.nums[ E[0]-1 ];
			for( int i=0; i<3; i++ ) {
				this.nums[ E[i]-1 ] = this.nums[ E[i+1]-1 ];
			}
			this.nums[ E[3]-1 ] = tmp;
		} else if( 'N' == c ) {
			tmp = this.nums[ N[0]-1 ];
			for( int i=0; i<3; i++ ) {
				this.nums[ N[i]-1 ] = this.nums[ N[i+1]-1 ];
			}
			this.nums[ N[3]-1 ] = tmp;
		} else if( 'S' == c ) {
			tmp = this.nums[ S[0]-1 ];
			for( int i=0; i<3; i++ ) {
				this.nums[ S[i]-1 ] = this.nums[ S[i+1]-1 ];
			}
			this.nums[ S[3]-1 ] = tmp;
		} else {
			tmp = this.nums[ W[0]-1 ];
			for( int i=0; i<3; i++ ) {
				this.nums[ W[i]-1 ] = this.nums[ W[i+1]-1 ];
			}
			this.nums[ W[3]-1 ] = tmp;
		}
		return;
	}
	
}

class Main {
	public static void main(String[] args) {
		BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
		try {
			int[] nums = new int[ 6 ];
			int i;
			i = 0;
			for( String num:  kb.readLine().split( " " ) ) {
				nums[i++] = Integer.parseInt( num );
			}
			Dice dice = new Dice( nums );
			
			String ensw = kb.readLine();
			int len = ensw.length();
			for( i=0; i<len; i++ ) {
				dice.rotate( ensw.charAt( i ) );
			}
			System.out.println( dice.getDiceNum( 0 ) );

		} catch( IOException e ) {
			System.err.println( e );
		}
	}
}