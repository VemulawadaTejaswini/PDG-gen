import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int[][] map = new int[h][w];
		int n = Integer.parseInt(sc.next());
		

		for(int i=0; i<n; i++) {
		    int x = Integer.parseInt(sc.next());
		    int y = Integer.parseInt(sc.next());
		    int a = Integer.parseInt(sc.next());
		    x--;
		    y--;
		    if(a == 1) {
        		for(int k=0; k<h; k++) {
        		    for(int j=0; j<=x; j++) {
        		        map[k][j] = 1;
        		    }
        		}
		    }else if(a == 2) {
		        for(int k=0; k<h; k++) {
        		    for(int j=x+1; j<w; j++) {
        		        map[k][j] = 1;
        		    }
        		}
		    }else if(a == 3) {
		        for(int k=0; k<=y; k++) {
        		    for(int j=0; j<w; j++) {
        		        map[k][j] = 1;
        		    }
        		}
		    }else {
		        for(int k=y+1; k<h; k++) {
        		    for(int j=0; j<w; j++) {
        		        map[k][j] = 1;
        		    }
        		}
		    }
		}
		
		int count = 0;
        for(int i=0; i<h; i++) {
		    for(int j=0; j<w; j++) {
		        if(map[i][j] == 0) count++;
		    }
		}
		System.out.println(count);
		
		
	}
}