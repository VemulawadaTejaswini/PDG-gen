import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long[] asum = new long[n+2];
		long[] bsum = new long[m+2];

		Arrays.fill(asum, k+1L);
		Arrays.fill(bsum, k+1L);
		asum[0] = 0;
		bsum[0] = 0;

		long a = 0L;
		int amax = 0;
		for ( int i=1; i<=n; i++ ) {
			a += sc.nextLong();
			if ( a<=k ) asum[i] = a;
			else break;
			amax++;
		}

		long b = 0L;
		int bmax = 0;
		for ( int i=1; i<=m; i++ ) {
			b += sc.nextLong();
			if ( b<=k ) bsum[i] = b;
			else break;
			bmax++;
		}

		int p = amax;
		int q = 1;
		int g = 0;

		if ( p==0 ) {
			System.out.println(bmax);
			System.exit(0);
		}

		while ( p>0 && q<bmax ) {
			long bsub = k - asum[p];
			if ( bsum[q+1]<=bsub ) q = nibutan(bsum, q, bmax+1, bsub);
			g = Math.max(g, p+q);
			p--;
		}

		System.out.println(g);
	}

	private static int nibutan(long[] ary, int mn, int mx, long target) {
		if (mx-mn<=1) return mn;
		int md = (mn+mx)/2;
		if ( ary[md]<=target) return nibutan(ary, md, mx, target);
		else                  return nibutan(ary, mn, md, target);
	}
}