import java.util.*;

class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true) {
	    int r = s.nextInt();
	    int c = s.nextInt();
	    int n = s.nextInt();
	    if(n == 0) break;
	    int[][] data = new int[r][c];
	    for(int i=0 ; i<r ; i++) {
		for(int j=0 ; j<c ; j++)
		    data[i][j] = s.nextInt();
	    }
	    for(int i=0 ; i<n ; i++) {
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		int min = Integer.MAX_VALUE;
		for(int j=x1 ; j<=x2 ; j++) {
		    for(int k=y1 ; k<=y2 ; k++)
			if(min>data[j][k]) min = data[j][k];
		}
		System.out.println(min);
	    }
	}
    }
}