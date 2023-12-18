import java.io.*;
import java.util.*;

class Main {

    void solve(){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int[] A = new int[n];
	int[] B = new int[n];
	int[] C = new int[n];
	for ( int i=0; i<n; ++i ) A[i] = B[i] = C[i] = 0;
	
	int x = sc.nextInt();
	for ( int i=0; i<x; ++i ) A[sc.nextInt()-1] = 1;
	int y = sc.nextInt();
	for ( int i=0; i<y; ++i ) B[sc.nextInt()-1] = 1;
	int z = sc.nextInt();
	for ( int i=0; i<z; ++i ) C[sc.nextInt()-1] = 1;

	int ans = 0;
	for ( int i=0; i<n; ++i ) {
	    if ( (A[i] == 0 && C[i] == 1) || (B[i] == 1 && C[i] == 1) ) ++ans;
	}

	System.out.println( ans );
    }

    public static void main(String[] a) {new Main().solve(); }
}

