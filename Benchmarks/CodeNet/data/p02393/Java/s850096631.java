import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scaner = new Scanner( System.in );

		int first = Integer.parseInt( scaner.next() );
		int second= Integer.parseInt( scaner.next() );
		int third = Integer.parseInt( scaner.next() );

		int [] nums = { first, second, third };

		bobleSort( nums );

	    System.out.println( nums[0] + " " + nums[1] + " " + nums[2] );

		scaner.close();
	}

	public static void bobleSort( int [] nums ) {

		for ( int i = 0; i < nums.length - 1; i++ ) {
			for ( int j = nums.length - 1; j > i; j-- ) {
				if ( nums[ j ] < nums[ j - 1 ] ) {
					swap( nums, j, j - 1 );
				}
			}
		}
	}

	public static void swap( int [] nums, int i , int j ) {
		int remain = nums[ i ];
		nums[ i ]  = nums[ j ];
		nums[ j ]  = remain;
	}

}