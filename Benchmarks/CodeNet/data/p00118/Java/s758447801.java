import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	while ( true ) {
	    final int height = stdin.nextInt();
	    final int width = stdin.nextInt();
	    stdin.nextLine();
	    if ( width == 0 && height == 0 ) {
		break;
	    }

	    char[][] map = new char[height][];
	    for ( int c = 0; c < height; c++ ) {
		map[c] = stdin.nextLine().toCharArray();
	    }

	    boolean[][] visited = new boolean[height][width];

	    int count = 0;
	    for ( int c = 0; c < height; c++ ) {
		for ( int r = 0; r < width; r++ ) {
		    if ( !visited[c][r] ) {
			dfs( visited, map, c, r );
			count++;
		    }				  
		}
	    }
	    System.out.println( count );
	}
	
    }

    static final int[] dx = { 1, 0, -1, 0 };
    static final int[] dy = { 0, -1, 0, 1 };
    
    static void dfs ( boolean[][] visited, char[][] map, int y, int x ) {

	visited[y][x] = true;
	for ( int i = 0; i < dx.length; i++ ) {
	    final int ny = y + dy[i];
	    final int nx = x + dx[i];

	    if ( 0 <= ny && ny < visited.length && 0 <= nx && nx < visited[0].length && 
		 !visited[ny][nx] && map[y][x] == map[ny][nx] ) {
		dfs( visited, map, ny, nx );
	    }	    
	}
	
    }
    
}