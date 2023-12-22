import java.util.*;
 
public class Main {
	
    public static void main( String args[] ) {
        Scanner scan	= new Scanner( System.in );

		while( true ) {
			// 文字列入力
			String	n		= scan.next();
			if ( n.equals("-") ) {
				break;
			}

			// 処理
			int	m = scan.nextInt();
			for( int i = 0; i < m; i++ ) {
				int h = scan.nextInt();
				n = n.substring( h, n.length() ) + n.substring( 0, h );

			}

			// 出力
			System.out.println( n );
		}
		
		scan.close();
	}
}