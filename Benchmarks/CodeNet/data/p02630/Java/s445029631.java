import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Map<Integer,Long> map = new HashMap<>();
		int n = sc.nextInt();
		int[] a = new int[n];
		for( int i=0 ; i<n ; i++ ) {
			a[i] = sc.nextInt();
			map.compute( a[i], (k,v)->{ return v==null ? 1 : v+1; } );
		}
		
		int q = sc.nextInt();
		for( int i=0 ; i<q	 ; i++ ) {
			int b = sc.nextInt();
			int c = sc.nextInt();

			Long bCnt = map.remove(b);
			if( bCnt != null ) {
				map.compute( c, (k,v)->{ return v==null ? bCnt : v+bCnt; } );
			}
			
			long s=0;
			for( Map.Entry<Integer, Long> it : map.entrySet() ) {
				s+= it.getKey() * it.getValue();
			}

			System.out.println(s);
		}
		
		
		
	}
}