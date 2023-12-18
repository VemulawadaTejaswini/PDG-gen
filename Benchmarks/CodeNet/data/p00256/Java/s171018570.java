import java.io.*;
import java.util.*;

class Main {

    static final long mjd_base = Fliegel( 2012, 12, 21 );
    static final long[] maya_unit = {13, 20, 20, 18, 20};
    static final long maya_cycle = 13*20*20*18*20;

    static long Fliegel( long y, long m, long d ) {//グレゴリオ暦を修正ユリウス通日に換算
	if ( m <= 2 ) {
	    m += 12;
	    --y;
	}
	return (long)(Math.floor(365.25*y) + Math.floor(y/400.0) - Math.floor(y/100.0)
		      + Math.floor(30.59*(m-2)) + d - 678912.0);
    }
    
    void solve(){

	Scanner sc = new Scanner(System.in);

	while ( true ) {

	    String s = sc.next().trim();
	    if ( s.charAt(0) == '#' ) break;

	    String[] t = s.split("\\.");

	    long[] g = new long[3];
	    long[] m = new long[5];

	    if ( t.length == 3 ) {

		for ( int i=0; i<t.length; ++i ) g[i] = Long.parseLong(t[i]);

		long mjd = (Fliegel(g[0], g[1], g[2]) - mjd_base)%maya_cycle;
		
		for ( int i=maya_unit.length-1; i>=0; --i ) {
		    m[i] = mjd%maya_unit[i];
		    mjd /= maya_unit[i];
		}

		System.out.printf("%d.%d.%d.%d.%d\n", m[0], m[1], m[2], m[3], m[4]);
	    }
	    else {

		for ( int i=0; i<t.length; ++i ) m[i] = Long.parseLong(t[i]);

		//マヤ暦をユリウス通日に換算
		long mjd = m[0];
		for ( int i=1; i<maya_unit.length; ++i ) {
		    mjd *= maya_unit[i];
		    mjd += m[i];
		}
		mjd += mjd_base;

		//ユリウス通日をグレゴリオ暦に換算
		mjd += 678881;
		long a = 4*mjd + 3 + (long)(4*Math.floor(3.0*Math.floor(1.0 + 4.0*(mjd+1)/146097.0)/4.0));
		long b = 2 + 5*(long)Math.floor( (a%1461)/4.0 );

		g[0] = (long)Math.floor(a/1461.0);
		g[1] = 3 + (long)Math.floor(b/153.0);
		g[2] = 1 + (long)Math.floor( (b%153)/5.0 );
		if ( g[1] > 12 ) {
		    g[1] -= 12;
		    ++g[0];
		}
	    
		System.out.printf("%d.%d.%d\n", g[0], g[1], g[2]);
	    }
	}

    }

    public static void main(String[] a) { new Main().solve(); }
}

