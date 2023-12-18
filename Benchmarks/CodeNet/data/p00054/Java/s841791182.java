import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextInt() ) {

	    final int a = stdin.nextInt();
	    final int b = stdin.nextInt();
	    final int n = stdin.nextInt();

	    int mod = a % b;
	    int sum = 0;
	    for ( int i = 0; i < n; i++ ) {
		mod *= 10;
		sum += mod / b;
		mod %= b;
	    }
	    
	    System.out.println( sum );
	}
	
    }    
}