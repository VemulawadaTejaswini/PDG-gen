import java.util.Scanner;

public class Main {
	public static void main ( String[] args ) {
		int[] deta = new int[128];
		int in , i , max = 0;
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			in = sc.nextInt();
			deta[in]++;
			if ( deta[in] > max ) max = deta[in];
		}
		for ( i = 1; i <= 100; i++ )
			if ( deta[i] == max ) System.out.println(i);
	}
}