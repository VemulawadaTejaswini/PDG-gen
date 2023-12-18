import java.util.*;

public class Main {
	public String check( int pm , int pe , int pj ) {
		if ( pm == 100 || pe == 100 || pj == 100 ) return "A";
		int ave = ( pm + pe ) / 2;
		if ( ave >= 90 ) return "A";
		ave = ( pm + pe + pj ) / 3;
		if ( ave >= 80 ) return "A";
		if ( ave >= 70 ) return "B";
		if ( ave >= 50 && ( pm >= 80 || pe >= 80 ) ) return "B";
		else return "C";
	}
	
	public static void main ( String[] args ) {
		int pm , pe , pj;
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				pm = sc.nextInt();
				pe = sc.nextInt();
				pj = sc.nextInt();
				System.out.println(m.check(pm, pe, pj));
			}
		}
	}
}