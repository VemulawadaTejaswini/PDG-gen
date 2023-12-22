import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] cum = new int[12];
	for ( int i = 1; i < cum.length; i++ ) {
	    cum[i] = cum[i - 1] + date[i - 1];
	}

	String[] days = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
	
	while ( true ) {

	    final int m = stdin.nextInt();
	    final int d = stdin.nextInt();
	    if ( m == 0 && d == 0 ) {
		break;
	    }

	    final int day = cum[m - 1] + d - 1;
	    System.out.println( days[day % 7] );
	    
	}	
	
    }
    
}