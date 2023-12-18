import java.io.*;
import java.util.*;

class Main {

    int n, m, p;
    int dst[] = null;

    //sからeへの時計回り距離
    int CWDist ( int s, int e ) { return e - s < 0 ? e - s + n : e - s; }
    //sからeへの反時計回り距離
    int CCWDist ( int s, int e ) { return s - e < 0 ? s - e + n : s - e; }

    //時計回りで次の買い物場所
    int CWNext ( int i ) { return i == m-1 ? dst[0] : dst[i+1]; }
    //反時計回りで次の買い物場所
    int CCWNext ( int i ) { return i == 0 ? dst[m-1] : dst[i-1]; }

    //pからtへ時計回り tからeへ反時計回りで行ったときの距離
    int CWTurn ( int p, int t, int e ) { return CWDist( p, t ) + CCWDist( t, e ); }
    //pからtへ反時計回り tからeへ時計回りで行ったときの距離
    int CCWTurn ( int p, int t, int e ) { return CCWDist( p, t ) + CWDist( t, e ); }

    void solve(){

	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	m = sc.nextInt();
	p = sc.nextInt();
	dst = new int[m];
	for ( int i=0; i<m; ++i ) dst[i] = sc.nextInt();
	Arrays.sort( dst );
	
	int s = 0;
	while ( s < m ) {
	    if ( dst[s] > p ) break;
	    ++s;
	}

	int cwNext  = s == m ? dst[0] : dst[s];
	int ccwNext = s == 0 ? dst[m-1] : dst[s-1];

	int dist = Math.min( CCWDist(p, cwNext), CWDist(p, ccwNext) );

	for ( int i=0; i<m; ++i ) {
	    dist = Math.min( dist, CWTurn(p, dst[i], CWNext(i)) );
	    dist = Math.min( dist, CCWTurn(p, dst[i], CCWNext(i)) );
	}

	System.out.println( 100*dist );

    }

    public static void main(String[] a) { new Main().solve(); }
}

