import java.util.Scanner;

public class Main {
	static int w;
	static int h;
	static char[][] tiles;
	static boolean[][] check;
	static int count;
	
	static int go(int i,int j,int count) {
		if(!check[i][j]) {
			check[i][j] = true;
			count++;
			if(i-1>=0 && tiles[i-1][j] == '.') {
				//System.err.println(count);
				count = go(i-1,j,count);
			}
			if(i+1<h && tiles[i+1][j] == '.') {
				//System.err.println(count);
				count = go(i+1,j,count);
			}
			if(j-1>=0 && tiles[i][j-1] == '.') {
				//System.err.println(count);
				count = go(i,j-1,count);
			}
			if(j+1<w && tiles[i][j+1] == '.') {
				//System.err.println(count);
				count = go(i,j+1,count);
			}
		}
		return count;
	}
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		w = Integer.parseInt(sc.next());
    		h = Integer.parseInt(sc.next());
    		if(w==0 && h==0) break;
    		tiles = new char[h][w];
    		check = new boolean[h][w];
    		for(int i=0;i<h;i++) {
    			tiles[i] = sc.next().toCharArray();
    		}
    		/*for(int i=0;i<h;i++) {
    			for(int j=0;j<w;j++) {
    				System.out.print(tiles[i][j]+" ");
    			}
    			System.out.println();
    		}*/
    		int m = 0;
    		int n = 0;
    		loop:for(int i=0;i<h;i++) {
    			for(int j=0;j<w;j++) {
    				if(tiles[i][j] == '@') {
    					m = i;
    					n = j;
    					break loop;
    				}
    			}
    		}
    		int count = go(m,n,0);
    		System.out.println(count);
    	}
    }
}
