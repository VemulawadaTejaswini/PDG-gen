import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	
	boolean[][] map = new boolean[n][n];
	int a,b;
	for (int i=0; i<m; i++) {
	    a = sc.nextInt() - 1;
	    b = sc.nextInt() - 1;
	    map[a][b] = true;
	    map[b][a] = true;
	    for (int j=0; j<n; j++) {
		if (map[a][j] == true) {
		    map[b][j] = true;
		    map[j][b] = true;
		}
		if (map[b][j] == true) {
		    map[a][j] = true;
		    map[j][a] = true;
		}
	    }
	}
	int max = 0;
	int count = 0;
	for (int i=0; i<n; i++) {
	    for (int j=0; j<n; j++) {
		if (map[i][j] == true) {
		    count++;
		}
	    }
	    if (count > max) max = count;
	    count = 0;
	}
	System.out.print(max);
    }
}
