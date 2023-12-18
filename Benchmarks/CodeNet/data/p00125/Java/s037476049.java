import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Date implements Comparable<Date> {

    int y;
    int m;
    int d;
    final int[] date = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    Date( int y, int m, int d ) {
	this.y = y;
	this.m = m;
	this.d = d;
    }

    public int compareTo( Date date ) {
	if ( y != date.y ) {
	    return y - date.y;
	} else if( m != date.m ) {
	    return m - date.m;
	} else {
	    return d - date.d;
	}
    }

    boolean uruu( int y ) {
	if ( y % 400 == 0 ) {
	    return true;
	} else if( y % 100 == 0 ) {
	    return false;
	} else if ( y % 4 == 0 ) {
	    return true;
	} else {
	    return false;
	}
    }
    
    void increment() {
	d++;
	if ( d > date[ m ] ) {
	    if ( m != 2 || !uruu( y ) ){
		d = 1;
		m +=1;
	    } else if( m == 2 && d == 30 ) {
		m += 1;
		d = 1;
	    }
	} 
	if ( m == 13 ) {
	    y++;
	    m = 1;
	}
    }
    public String toString() {
	return String.format( "(%d, %d, %d)", y, m, d );
    }
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	while ( true ) {

	    final int y1 = stdin.nextInt();
	    final int m1 = stdin.nextInt();
	    final int d1 = stdin.nextInt();
	    final int y2 = stdin.nextInt();
	    final int m2 = stdin.nextInt();
	    final int d2 = stdin.nextInt();

	    if ( y1 == -1 ) {
		break;
	    }

	    Date date1 = new Date( y1, m1, d1 );
	    Date date2 = new Date( y2, m2, d2 );
	    int count = 0;
	    while ( date1.compareTo( date2 ) < 0 ){
		date1.increment();
		//System.err.println( date1 );
		count++;
	    }
	    System.out.println( count );
	}	
    }
}