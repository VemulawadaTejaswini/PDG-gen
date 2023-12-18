import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();

		int[][] c = new int[h][w];
		for ( int i=0; i<h; i++ ) {
			String c1 = sc.next();
			for ( int j=0; j<w; j++ ) {
				if ( c1.charAt(j)=='#' ) c[i][j] = 1;
			}
		}

		int maxh = 1;
		for ( int i=0; i<h; i++ ) {
			maxh *= 2;
		}
		int maxw = 1;
		for ( int i=0; i<w; i++ ) {
			maxw *= 2;
		}

		int[] row = new int[h];
		int[] column = new int[w];
		int g = 0;
		for ( int i=0; i<maxh; i++ ) {
			getbit(i, row, h);

			for ( int j=0; j<maxw; j++ ) {
				getbit(j, column, w);

				int k1 = 0;
				for ( int p=0; p<h; p++ ) {
				for ( int q=0; q<w; q++ ) {
 					if ( c[p][q]==1 && row[p]==0 && column[q]==0 ) k1++;
				}
				}

				if ( k1==k ) g++;
			}
		}

		System.out.println(g);
	}

	private static void getbit(int num, int[] ary, int sz) {
		int tmp = num;
		for ( int i=sz-1; i>=0; i-- ) {
			ary[i] = tmp%2;
			tmp /= 2;
		}
	}
}
