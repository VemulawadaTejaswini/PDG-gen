import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextInt() ) {

	    final int n = stdin.nextInt();
	    System.out.println( ( n + 1 ) * n / 2 + 1 );
	    
	}	
    }
    
}