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

		int pcxp = pcx+1;
		int pcxm = pcx-1;

		int adp = 1;
		int adm = 1;
		long f1p = 0L;
		long f1m = 0L;
		int[] p = new int[n];
		int[] m = new int[n];

		for ( int j=n-1; j>=0; j-- ) {
			p[j] = adp;
			m[j] = adm;

			if ( b[j] ) {
				f1p += (long)adp;
				f1m += (long)adm;
			}
			adp = (adp*2)%pcxp;
			adm = (adm*2)%Math.max(pcxm,1);
		}

		for ( int i=0; i<n; i++ ) {
			long f1 = 0;
			int pcxi = pcx;

			if ( b[i] ) {
				pcxi--;
				f1 = (f1m - (long)m[i] + (long)pcxi)%(long)Math.max(pcxi,1);
			} else {
			        pcxi++;
				f1 = (f1p + (long)p[i])%(long)pcxi;
			}

			if ( pcxi==0 ) {
				System.out.println(0);
				continue;
			}

			int g = getfx(f1, 1);
			System.out.println(g);
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
