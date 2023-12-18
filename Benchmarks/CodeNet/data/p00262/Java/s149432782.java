import java.io.*;
import java.util.*;

class Main {

    void solve(){

	Scanner sc = new Scanner(System.in);
	
	while ( true ) {

	    int n = sc.nextInt();
	    if ( n == 0 ) break;

	    ArrayList<Integer> b = new ArrayList<Integer>();
	    for ( int i=0; i<n; ++i ) {
		int v = sc.nextInt();
		b.add( v );
	    }

	    int cnt = 0;
	    while ( cnt <= 10000 ) {

		//三角形になっているか
		boolean tri_num = true;
		if ( b.get(0) != 1 ) tri_num = false;
		for ( int i=1; i<b.size(); ++i ) {
		    if ( b.get(i) != b.get(i-1)+1 ) {
			tri_num = false;
			break;
		    }
		}
		if ( tri_num ) break;

		ArrayList<Integer> b_tmp = new ArrayList<Integer>();
		for ( int i : b ) {
		    if ( i > 1 ) b_tmp.add( i-1 );
		}
		b_tmp.add( b.size() );
		b = b_tmp;

		++cnt;
	    }
	    
	    if ( cnt > 10000 ) System.out.println(-1);
	    else System.out.println( cnt );
	    

	}

    }

    public static void main(String[] a) { new Main().solve(); }
}

