import java.util.Scanner;

public class Main {

    static boolean check_num( int x ) {
    	if( ( x % 3 == 0 ) ) {
    		System.out.print( " " + x );
    		return true;
    	} else {
    		return false;
    	}
    }

    static boolean include3( int x, int i ) {
    	if ( ( x % 10 == 3 ) ) {
    		System.out.print( " " + i );
    		return true;
    	} else {
    		return false;
    	}
    }

    public static void main(String[] args) {

        int num = 0;

        Scanner sc= new Scanner( System.in );

        num = sc.nextInt();
        for ( int i = 1 ; i <= num ; i++ ) {
        	if ( check_num( i ) ) {
        		continue;
        	} else {
        		int x = i;
        		while ( x > 0 ) {
        			if ( include3( x , i ) ) {
        				break;
        			}
            		x /= 10;
        		}
        	}

        }
		System.out.print( "\n" );
        sc.close();
    }
}
