import java.util.Scanner;

public class Main {
	public static void main ( String[] args ) {
		int[] deta = new int[128];
		int in , i , max = 0;
		Scanner sc = new Scanner(System.in);
		for ( int c = 1; c < 100; c++ ) {
			deta[c] = 0;
		}
		while ( sc.hasNext() ) {
			in = sc.nextInt();
			deta[in]++;
			if ( deta[in] > max ) max = deta[in];
		}
		for ( i = 1; i <= 100; i++ )
			if ( deta[i] == max ) System.out.printf("%d\n",deta[i]);
	}
}