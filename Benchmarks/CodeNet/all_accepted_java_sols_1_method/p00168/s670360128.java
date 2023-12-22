import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    long[] dp = new long[n + 3];
	    dp[0] = 1;
	    for ( int i = 0; i < n; i++ ) {
		dp[i + 1] += dp[i];
		dp[i + 2] += dp[i];
		dp[i + 3] += dp[i];
	    }

	    System.out.println( dp[n] / 3650L + ( dp[n] % 3650L == 0 ? 0 : 1) );
	}
	
    }
    
}