import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] nArray = new int[n];

	for ( int i=0; i<n; i++ ) {
	    nArray[i] = sc.nextInt();
	}

	Arrays.sort(nArray);

	int t;
	for ( int i=0; i<n/2; i++ ) {
	    t = nArray[i];
	    nArray[i] = nArray[n-i-1];
	    nArray[n-i-1] = t;
	}

	int alice=0, bob=0;
	for ( int i=0; i<n; i++ ) {
	    if ( i%2 == 0 ) {
		alice += nArray[i];
	    } else {
		bob += nArray[i];
	    }
	}

	System.out.println(alice - bob);
    }
    
}