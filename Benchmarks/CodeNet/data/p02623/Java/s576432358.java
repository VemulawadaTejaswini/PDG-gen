import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long[] asum = new long[n+1];
		long[] bsum = new long[m+1];

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

		for ( int i=amax+bmax; i>0; i-- ) {
			int amx1 = Math.min(amax, i);
			int bmx1 = Math.min(bmax, i);
			int amn1 = i-bmx1;
			int bmn1 = i-amx1;
			int ptn1 = amx1-amn1;

			for ( int j = 0; j<=ptn1; j++ ) {
				long sum1 = asum[amn1+j] + bsum[bmx1-j];
				if ( sum1<=k ) {
					System.out.println(i);
					System.exit(0);
				}
			}
		}

		System.out.println(0);
	}
}