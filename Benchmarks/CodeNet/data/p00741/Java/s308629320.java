import java.util.Scanner;

public class Main {
	static int w;
	static int h;
	static int[][] map;
	static boolean[][] check;
	static int count;
	
	static void go(int i,int j) {
		if(!check[i][j]) {
			check[i][j] = true;
			if(i-1>=0 && map[i-1][j] == 1) go(i-1,j);
			if(i+1<h && map[i+1][j] == 1) go(i+1,j);
			if(j-1>=0 && map[i][j-1] == 1) go(i,j-1);
			if(j+1<w && map[i][j+1] == 1) go(i,j+1);
			if(i-1>=0 && j-1>=0 && map[i-1][j-1] == 1) go(i-1,j-1);
			if(i-1>=0 && j+1<w && map[i-1][j+1] == 1) go(i-1,j+1);
			if(i+1<h && j-1>=0 && map[i+1][j-1] == 1) go(i+1,j-1);
			if(i+1<h && j+1<w && map[i+1][j+1] == 1) go(i+1,j+1);
		}
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		w = Integer.parseInt(sc.next());
    		h = Integer.parseInt(sc.next());
    		if(w==0 && h==0) break;
    		map = new int[h][w];
    		check = new boolean[h][w];
    		for(int i=0;i<h;i++) {
    			for(int j=0;j<w;j++) {
    				map[i][j] = sc.nextInt();
    			}
    		}
    		count = 0;
    		for(int i=0;i<h;i++) {
    			for(int j=0;j<w;j++) {
    				if(map[i][j] == 1 && !check[i][j]) {
    					go(i,j);
    					count++;
    				}
    			}
    		}
    		System.out.println(count);
    	}
    }
}

