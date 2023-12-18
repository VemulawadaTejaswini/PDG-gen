
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static final byte WHITE = 1;
	private static final byte BLACK = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int[] minx = new int[n];
		int[] miny = new int[n];
		
		for( int i=0 ; i<n ; i++ ) {
			minx[i] = n-2; 
			miny[i] = n-2; 
		}
		long blackCnt = ((long)n-2)*(n-2);
		
//		byte[][] grid = new byte[n][n];
//		for( int i=0 ; i<n ; i++ ) {
//			grid[i][n-1] = WHITE;
//			grid[n-1][i] = WHITE;
//		}
//		for( int i=1 ; i<n-1 ; i++ ) {
//			Arrays.fill(grid[i], 1, n-1, BLACK);
//		}
		
//		long whiteCnt = 0;
		for( int i=0 ; i<q ; i++ ) {
			int q1 = sc.nextInt();
			int q2 = sc.nextInt()-2;
			
			if( q1==1 ) {
				// vertical
				int m = minx[q2];
				for( int j=0 ; j<m ; j++ ) {
					miny[j]=Math.min(miny[j],q2);
				}
				minx[q2]=0;
				blackCnt -= m;
			}else {
				// horizontal
				int m = miny[q2];
				for( int j=0 ; j<m ; j++ ) {
					minx[j]=Math.min(minx[j],q2);
				}
				miny[q2]=0;
				blackCnt -= m;
			}

		}
		System.out.println(blackCnt);

	}

}
