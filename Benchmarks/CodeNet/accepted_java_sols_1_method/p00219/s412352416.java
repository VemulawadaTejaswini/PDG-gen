import java.util.*;

public class Main {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			int n = sc.nextInt();
			int[] table = new int[10];
			for ( int i = 0; i < n; i++ ) {
				int index = sc.nextInt();
				table[index]++;
			}
			for ( int i = 0; i < 10; i++ ) {
				if ( table[i] == 0 ) System.out.println("-");
				else {
					for ( int j = 0; j < table[i]; j++ ) {
						System.out.print("*");
					}
					System.out.println("");
				}
			}
		}
	}
}