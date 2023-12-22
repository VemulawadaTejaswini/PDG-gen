import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextLine() ) {

	    final String[] input = stdin.nextLine().split(" ");

	    final int morning = Integer.parseInt( input[1] );
	    final int afternoon = Integer.parseInt( input[2] );
	    final int people = morning + afternoon;
	    final int kane = morning * 200 + afternoon * 300;

	    System.out.printf("%s %d %d\n", input[0], people, kane);
	    
	}
	
    }
    
}