import java.util.*;

public class Main {
	int[] table = {0,1,2,3,5,7,8,9};
	public void MakeNumber( int old ) {
		if ( old >= 8 )
			MakeNumber( old / 8 );
		System.out.print(table[old%8]);
	}
	public static void main ( String[] args ) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			int num = sc.nextInt();
			m.MakeNumber(num);
			System.out.println("");
		}
	}
}