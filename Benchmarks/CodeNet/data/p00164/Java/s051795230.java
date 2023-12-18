import java.util.*;
import java.io.*;

class Main {

    static final int ICHIRO = 0;
    static final int JIRO = 1;
    
    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	while ( true ) {
	    int n = stdin.nextInt();

	    if ( n == 0 ) {
		break;
	    }

	    int[] ar = new int[n];
	    for ( int i = 0; i < n; i++ ) {
		ar[i] = stdin.nextInt();
	    }

	    int turn = 0;
	    int jiro_i = 0;
	    int rest = 32;
	    while ( rest > 0 ) {
		if ( turn == ICHIRO ) {
		    final int get = (rest - 1) % 5;
		    rest = Math.max(0, rest - get);		    
		} else {
		    final int get = ar[jiro_i];
		    rest = Math.max(0, rest - get);
		    jiro_i = (jiro_i + 1) % n;		    
		}
		System.out.println(rest);
		turn = ( turn + 1 ) % 2;
	    }	    
	}
	
    }
    
}