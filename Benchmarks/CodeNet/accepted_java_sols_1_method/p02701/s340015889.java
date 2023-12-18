import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(  sc.nextLine() ) ;

		Set<String> set = new HashSet<>() ;
		for ( int j=0 ; j<N ; j++ ) 
			 set.add ( sc.nextLine() ) ;
		System.out.println( set.size() ) ;
	 }
}