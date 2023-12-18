import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) { 
	    final int h = stdin.nextInt();
	    final int w = stdin.nextInt();
	    stdin.nextLine();

	    if ( h == 0 && w == 0 ){
		break;
	    }

	    final boolean[][] visited = new boolean[h][w];
	    char[][] map = new char[h][];
	    for ( int c = 0; c < map.length; c++ ) {
		map[c] = stdin.nextLine().toCharArray();
	    }

	    int c = 0;
	    int r = 0;

	    while ( !visited[c][r] ) {
		visited[c][r] = true;
		if ( map[c][r] == '.' ) {
		    break;
		} else if ( map[c][r] == '<' ) {
		    r--;
		} else if ( map[c][r] == '^' ) {
		    c--;
		} else if ( map[c][r] == '>' ) {
		    r++;
		} else if ( map[c][r] == 'v' ) {
		    c++;
		}
	    }
	    if ( map[c][r] == '.' ) {
		System.out.println(r + " " + c);
	    } else {
		System.out.println( "LOOP" );
	    }
	}	
    }

    static void printArray( char[][] map ) {
	for ( char[] row : map ){
	    for ( char ch : row ) {
		System.out.print(ch);
	    }
	    System.out.println();
	}
    }    
}