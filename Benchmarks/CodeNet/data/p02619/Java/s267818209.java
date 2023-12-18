import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();

		int[] c = new int[27];
		for ( int i=1; i<27; i++ ) {
			c[i] = sc.nextInt();
		}

		int[][] s = new int[d][27];
		for ( int i=0; i<d; i++ ) {
		for ( int j=1; j<27; j++ ) {
			s[i][j] = sc.nextInt();
		}
		}

		long man = 0L;
		int[] last = new int[27];
		for ( int i=0; i<d; i++ ) {
			int t = sc.nextInt();
			last[t] = i+1;
			man += (long)s[i][t];

			for ( int j=1; j<27; j++ ) {
				man -= (long)(c[j]*((i+1)-last[j]));
			}

			System.out.println(man);
		}

	}
}