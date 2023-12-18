import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Person implements Comparable<Person> {

    final int no;
    final double time;

    Person( final int no, final double time ) {
	this.no = no;
	this.time = time;
    }
    
    public int compareTo( final Person p ) {
	return Double.compare( time, p.time );
    }

    public String toString() {
	return String.format( "%d %.2f", no, time );
    }
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final ArrayList<Person> last = new ArrayList<Person>();
	final ArrayList<Person> rest = new ArrayList<Person>();
	
	for ( int i = 0; i < 3; i++ ) {
	    final ArrayList<Person> semifinal = new ArrayList<Person>();
	    for ( int j = 0; j < 8; j++ ) {
		semifinal.add( new Person( stdin.nextInt(), stdin.nextDouble() ) );
	    }
	    Collections.sort( semifinal );
	    last.add( semifinal.remove( 0 ) );
	    last.add( semifinal.remove( 0 ) );
	    rest.addAll( semifinal );
	}
	Collections.sort( rest );
	last.add( rest.remove( 0 ) );
	last.add( rest.remove( 0 ) );
	for ( Person p : last ) {
	    System.out.println( p );
	}
    }    
}