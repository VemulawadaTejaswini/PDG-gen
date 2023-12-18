import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) throws IOException {

	final Scanner stdin = new Scanner( System.in );
	final int n = Integer.parseInt( stdin.nextLine() );
	for ( int i = 0; i < n; i++ ) {
	    final String input = stdin.nextLine();
	    final StreamTokenizer tokenizer = new StreamTokenizer( new StringReader( input.substring( 0, input.length() - 1 ) ) );
	    tokenizer.parseNumbers();
	    tokenizer.ordinaryChar( '+' );
	    tokenizer.ordinaryChar( '-' );
	    tokenizer.ordinaryChar( '/' );
	    tokenizer.ordinaryChar( '*' );
	    tokenizer.ordinaryChar( ')' );
	    tokenizer.ordinaryChar( '(' );
	    tokenizer.nextToken();
	    System.out.println( pm( tokenizer ) );
	}
    }

    static int pm( StreamTokenizer tokenizer ) throws IOException {
	int ans = md( tokenizer );

	while ( tokenizer.ttype != StreamTokenizer.TT_EOF &&
		( tokenizer.ttype == '+' || tokenizer.ttype == '-' ) ) {
	    
	    boolean add = ( tokenizer.ttype == '+' );
	    tokenizer.nextToken();
	    final int val = md( tokenizer );
	    if ( add ) {
		ans += val;
	    } else {
		ans -= val;
	    }
	}
	return ans;
    }

    static int md( StreamTokenizer tokenizer ) throws IOException {
	int ans = term( tokenizer );
	while ( tokenizer.ttype != StreamTokenizer.TT_EOF &&
		( tokenizer.ttype == '*' || tokenizer.ttype == '/' ) ){
	    
	    boolean mul = ( tokenizer.ttype == '*' );
	    tokenizer.nextToken();
	    final int val = term( tokenizer );
	    if ( mul ) {
		ans *= val;
	    } else {
		ans /= val;
	    }
	}
	return ans;
    }

    static int term( StreamTokenizer tokenizer ) throws IOException {
	if ( tokenizer.ttype == StreamTokenizer.TT_NUMBER ) {
	    final int val = ( int )tokenizer.nval;
	    tokenizer.nextToken();
	    return val;
	} else { 
	    tokenizer.nextToken(); //(
	    final int val = pm( tokenizer );
	    tokenizer.nextToken(); //)
	    return val;
	}
    }
}