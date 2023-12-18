import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] p = new int[n];
		for ( int i=0; i<n; i++ ) p[i] = sc.nextInt()-1;

		long[] c = new long[n];
		for ( int i=0; i<n; i++ ) c[i] = sc.nextLong();

		LinkedList<Integer> ll = new LinkedList<Integer>();
		int[] cycleDist = new int[n];
		long[] cycleSum = new long[n];
		long[] chainMax = new long[n];
		long[] resMax = new long[n];


		for ( int i=0; i<n; i++ ) {
			int pos = p[i];
			long csum = c[pos];
			long cmax = c[pos];
			int dist = 1;
			while ( pos != i && dist<k ) {
				pos = p[pos];
				csum += c[pos];
				cmax = (long)Math.max(cmax, csum);
				dist++;
			}

			cycleDist[i] = dist;
			cycleSum[i] = Math.max(0, csum);
			chainMax[i] = cmax;

			if ( dist<k ) {
				int rpos = p[i];
				long rsum = c[rpos];
				long rmax = c[rpos];
				for ( int j=1; j<k%dist; j++ ) {
					rpos = p[rpos];
					rsum += c[rpos];
					rmax = (long)Math.max(rmax, rsum);
				}
				resMax[i] = rmax;
			}
		}

		long t = -999999999999L ;
		for ( int i=0; i<n; i++ ) {
			if ( k<cycleDist[i] ) {
				t = (long)Math.max(t, chainMax[i]) ;
			} else {
				long t0 = (long)Math.max(chainMax[i], cycleSum[i]*(k/cycleDist[i])+resMax[i]) ;
				t = (long)Math.max(t, t0) ;
			}
		}

		System.out.println(t);
	}
}