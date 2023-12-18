import java.util.Scanner;

public class Main {
	
	static int[][] field;
	// l <= ..... <  r , u <= ..... < d
	static int min;
	
	static boolean ok(int l, int r, int u, int d) {
		boolean flag = true;
		int max = 0;
		for(int i = u; i < d; i++) {
			for(int j = l; j < r; j++) {
				max = Math.max(field[i][j], max);
			}
		}
		for(int j = l-1; j <= r; j++) {
			min = Math.min(Math.min(field[u-1][j], field[d][j]), min);
			if(min <= max)	flag = false;
		}
		for(int i = u; i < d; i++) {
			min = Math.min(Math.min(field[i][l-1], field[i][r]), min);
			if(min <= max)	flag = false;
		}
		return flag;
	}
	
	static int water(int l, int r, int u, int d) {
		int ans = 0;
		for(int i = u; i < d; i++) {
			for(int j = l; j < r; j++) {
				ans += min - field[i][j];
			}
		}
		return ans;
	}
	
    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {
    		while(true) {
    			int d = sc.nextInt();
    			int w = sc.nextInt();
    			if(d+w==0) break;
    			field = new int[d][w];
    			for(int i = 0; i < d; i++) {
    				for(int j = 0; j < w; j++) {
    					field[i][j] = sc.nextInt();
    				}
    			}
    			int ans = 0;
    			for(int l = 1; l < w-1; l++) {
    				for(int r = 2; r < w; r++) {
    					for(int u = 1; u < d-1; u++) {
    						for(int b = 2; b < d; b++) {
    							min = 10;
    							if(ok(l, r, u, b)) {
    								ans = Math.max(ans, water(l, r, u, b));
    							}
    						}
    					}
    				}
    			}
    			System.out.println(ans);
    		}
    		
    	}
    }
}


