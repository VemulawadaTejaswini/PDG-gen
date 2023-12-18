import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int W = sc.nextInt();
	char[][] maze = new char[H+2][W+2];

	for(int i = 1; i<H+1; i++) {
	    String str = sc.next();
	    for(int j = 1; j<W+1; j++) {
		maze[i][j] = str.charAt(j-1);
	    }
	}

	long[][] way = new long[H+2][W+2];
	way[H][W] = 1;
	for(int i = H; i>0; i--) {
	    for(int j = W; j>0; j--) {
		if(maze[i][j] == '#') {
		    way[i][j] = 0;
		}else if(i== H && j == W) {
		    way[H][W] = 1;
		}else{
		    way[i][j] = way[i+1][j] + way[i][j+1];
		    way[i][j] %= 1000000000+7;
		}
	    }
	}
	System.out.println(way[1][1]);

    }
}