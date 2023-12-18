import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String x = sc.next();

		boolean[] b = new boolean[n];
		int pcx = 0;
		for ( int i=0; i<n; i++ ) {
			if ( x.charAt(i)=='1' ) {
				b[i] = true;
				pcx++;
			} else {
				b[i] = false;
			}
		}

		for ( int i=0; i<n; i++ ) {
			int pcxi = pcx;
			if ( b[i] ) pcxi--;
			else        pcxi++;

			b[i] = !b[i];
			if ( pcxi==0 ) {
				System.out.println(0);
				continue;
			}

			long ad = 1L;
			long f1 = 0L;
			for ( int j=n-1; j>=0; j-- ) {
				if ( b[j] ) {
					f1 += ad;
				}
				ad = (ad*2L)%(long)pcxi;
				if ( ad==0 ) break;
			}

			int g = getfx(f1%(long)pcxi, 1);
			System.out.println(g);
			b[i] = !b[i];
		}
	}

	private static int getfx(long fn, int tm) {
		if ( fn==0 ) return tm;
		if ( fn==1 ) return tm+1;

		int pc = getpc(fn);
		return getfx(fn%(long)pc, tm+1);
	}
	private static int getpc(long num) {
		long n1 = num;
		int pc = 0;
		while ( n1>0 ) {
			if ( n1%2L==1 ) pc++;
			n1 /= 2L;
		}
		return pc;
	}
}
