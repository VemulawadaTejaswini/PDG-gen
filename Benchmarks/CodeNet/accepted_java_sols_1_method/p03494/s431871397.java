import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main( String[] args ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.valueOf( br.readLine() );
		String[] A = br.readLine().split( " " );
		ArrayList< Integer > list = new ArrayList< Integer >();

		for( int i = 0; i < N; i++ ) {
			list.add( Integer.valueOf( A[i] ) );
		}
		boolean flg = true;
		int cnt = 0;
		while( flg ) {
			for( int i = 0; i < list.size(); i++ ) {
				if( ( list.get( i ) % 2 ) != 0 ){
					flg =  false;
					break;
				} else {
					list.set( i, ( list.get( i ) / 2 ) );
				}
			}
			cnt++;
		}
		System.out.println( cnt - 1 );
	}
}