import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			long k = sc.nextLong();

			long[] aBooks = new long[n+1];
			long[] bBooks = new long[m+1];

			long sumA = 0;
			for(int i = 0 ; i < n ; i++ ) {
				aBooks[i] = sc.nextLong();
				sumA += aBooks[i];
			}
			aBooks[n] = Long.MAX_VALUE;

			long sumB = 0;
			for(int i = 0 ; i < m ; i++ ) {
				bBooks[i] = sc.nextLong();
				sumB += bBooks[i];
			}
			bBooks[m] = Long.MAX_VALUE;


			int ans = calc(aBooks, bBooks, 0, 0, k);
			
			System.out.println(ans);
		}
	}

	private static int calc(long[] aBooks, long[] bBooks, int ap, int bp, long k) {

		long a = aBooks[ap];
		long b = bBooks[bp];
		
		int takeA = 0;
		if ( a <= k ) {
			takeA = calc(aBooks, bBooks, ap+1, bp, k - a) + 1;
		}
		
		int takeB = 0;
		if ( b <= k ) {
			 takeB = calc(aBooks, bBooks, ap, bp+1, k - b) + 1;
		}

		//can select both

		if ( takeA > takeB) {
			return takeA;
		}
		else {
			return takeB;
		}
	}

}