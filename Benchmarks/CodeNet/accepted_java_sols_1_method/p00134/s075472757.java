import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	long n = stdin.nextLong();

	long sum = 0;
	for ( int i = 0; i < n; i++ ) {
	    sum += stdin.nextLong();
	}
	System.out.println( sum / n );
    }
    
}