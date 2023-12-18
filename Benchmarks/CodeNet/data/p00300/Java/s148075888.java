import java.io.*;
import java.util.*;

class Main {

    int CalcID(int r, int t) { return r + 5*t; }
    
    void solve(){

	Scanner sc = new Scanner( System.in );
	int n = sc.nextInt();
	for ( int i=0; i<n; ++i ) {

	    int r = sc.nextInt();
	    int t = sc.nextInt();

	    boolean onR = r%100 == 0;
	    boolean onT = t%30 == 0;
	    r /= 100;
	    t /= 30;

	    if ( onR && onT ) System.out.println(CalcID(r, t));
	    else if ( onR ) System.out.println(CalcID(r, t) + " " + CalcID(r, t+1));
	    else if ( onT ) System.out.println(CalcID(r, t) + " " + CalcID(r+1, t));
	    else System.out.println(CalcID(r, t) + " " + CalcID(r+1, t) + " "
				    + CalcID(r, t+1) + " " + CalcID(r+1, t+1));
	}
    }

    public static void main( String[] a ) {new Main().solve(); }
}

