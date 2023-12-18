import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Event implements Comparable<Event> {

    static final int ARRIVE = 1;
    static final int LEAVE = 0;

    final int state;
    final int id;
    final int time;

    public Event( final int state, final int id, final int time ) {
	this.state = state;
	this.id = id;
	this.time = time;
    }

    @Override public int compareTo( Event event ) {
	if ( time != event.time ) {
	    return time - event.time;	    
	} else {
	    return state - event.state;
	}
    }

    public String toString() {
	final String stateStr = ( state == ARRIVE ? "ARRIVE" : "LEAVE" );
	return String.format( "%s %d, time = %d", stateStr, id, time );
    }
    
}

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );
	final int[] waitTime = new int[100];
	simulate( waitTime );
	//System.err.println( Arrays.toString( waitTime ) );

	while ( stdin.hasNextInt() ) {
	    final int n = stdin.nextInt();
	    System.out.println( waitTime[n] );
	}	
    }

    static void simulate( final int[] waitTime ) {
	
	final PriorityQueue<Event> queue = new PriorityQueue<Event>();
	final LinkedList<Event> waitQueue = new LinkedList<Event>();
	for ( int i = 0; i < 100; i++ ) {
	    queue.offer( new Event( Event.ARRIVE, i, i * 5 ) );
	}

	int time = 0;

	int[] seats = new int[17];
	Arrays.fill( seats, -1 );
	
	while ( !queue.isEmpty() ) {
	    //System.err.println( Arrays.toString( seats ) );
	    final Event e = queue.poll();
	    //System.err.println( e );
	    time = e.time;
	    if ( e.state == Event.ARRIVE ) {
		final int pos = canPut( seats, getNoOfPeople( e.id ) );
		if ( waitQueue.isEmpty() && pos >= 0 ) {
		    put( seats, e.id, pos );
		    queue.offer( new Event( Event.LEAVE, e.id, e.time + calcEatTime( e.id ) ) );
		} else {
		    //System.err.printf( "wait... %s\n", e );
		    waitQueue.offer( e );
		}
	    } else { //if ( e.state == Event.LEAVE ) {
		remove( seats, e.id );
		while ( !waitQueue.isEmpty() ) {
		    final Event ne = waitQueue.peek();
		    final int nPos = canPut( seats, getNoOfPeople( ne.id ) );
		    if ( nPos >= 0 ) {
			waitQueue.poll();
			put( seats, ne.id, nPos );
			waitTime[ne.id] = time - ne.time;
			//System.err.printf( "in: %s\n", ne );
			//System.err.printf( "waitTime = %d\n", waitTime[ne.id] );
			queue.offer( new Event( Event.LEAVE, ne.id, ne.time + calcEatTime( ne.id ) ) );
		    } else {
			break;
		    }
		}
	    }
	}
    }

    static int calcEatTime( final int id ) {
	return 17 * ( id % 2 ) + 3 * ( id % 3 ) + 19;
    }

    static void put( final int[] seats, final int id, final int pos ) {
	final int p = getNoOfPeople( id );
	for ( int i = pos; i < pos + p; i++ ) {
	    seats[i] = id;
	}
    }

    static int getNoOfPeople( final int id ) {
	return id % 5 == 1 ? 5 : 2;
    }

    static int canPut( final int[] seats, final int noOfPeople ) {
	int count = 0;
	for ( int i = 0; i < seats.length; i++ ) {
	    if ( seats[i] == -1 ) {
		count++;
		if ( count >= noOfPeople ) {
		    return i - count + 1;
		}
	    } else {
		count = 0;
	    }
	}
	return -1;
    }

    static void remove( final int[] seats, final int id ) {
	for ( int i = 0; i < seats.length; i++ ) {
	    if ( seats[i] == id ) {
		final int noOfPeople = getNoOfPeople( id );
		for ( int j = i; j < i + noOfPeople; j++ ) {
		    seats[j] = -1;
		}
		return;
	    }
	}
    }    
}