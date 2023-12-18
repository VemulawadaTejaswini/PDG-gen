import java.util.*;
import java.io.*;

class Team {

    final int no;
    final int ans;
    int rank;

    Team( int no, int ans ) {
	this.no = no;
	this.ans = ans;
    }
}

class ComparatorAns implements Comparator<Team> {
    public int compare( Team t1, Team t2 ) {
	return Double.compare( t2.ans, t1.ans );
    }    
}

class ComparatorTeamNo implements Comparator<Team> {
    public int compare( Team t1, Team t2 ) {
	return Double.compare( t1.no, t2.no );
    }    
}

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	ArrayList<Team> list = new ArrayList<Team>();
	
	while( true ) {

	    String[] input = stdin.nextLine().split( "," );
	    final int team = Integer.parseInt( input[0] );
	    final int ans  = Integer.parseInt( input[1] );

	    if ( team == 0 && ans == 0 ) {
		break;
	    }
	    list.add( new Team( team, ans ) );	    
	}

	Collections.sort( list, new ComparatorAns() );
	int befAns = list.get( 0 ).ans;
	int rank = 1;
	for ( Team t : list ) {
	    if ( t.ans < befAns ) {
		rank++;
		befAns = t.ans;
	    }
	    t.rank = rank;
	}

	Collections.sort( list, new ComparatorTeamNo() );

	while( stdin.hasNextLine() ) {

	    final int teamNo = Integer.parseInt( stdin.nextLine() );
	    for ( Team t : list ) {
		if ( t.no == teamNo ) {
		    System.out.println( t.rank );
		    break;
		}
	    }	    
	}	
    }    
}