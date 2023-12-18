import java.util.* ;
import java.util.Map.Entry;
public class ps6 {
	public static void main(String[] args) {
		ps6 obj = new ps6() ;
		Scanner S = new Scanner( System.in ) ;
		char ch = S.nextLine().charAt(0)  ;
		if( Character.isUpperCase(ch) ) System.out.println( 'A' ) ;
		else System.out.println( 'a' ) ;
	}
}