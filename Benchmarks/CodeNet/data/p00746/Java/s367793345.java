import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			int[][] map = new int[2*n+1][2*n+1];
			for(int i = 0; i < map.length; i++) {
				for(int j = 0; j <  map[0].length; j++) {
					map[i][j] = -1;
				}
			}
			
			map[n][n] = 0;/* 中央を0 */
			for(int i = 1; i < n; i++) {
				int ni = sc.nextInt();
				int di = sc.nextInt();
				
				boolean _break = false;
				for(int j = 0; j < map.length; j++) {
					for(int k = 0; k < map[0].length; k++) {
						if(map[j][k] == ni) {
							
							if(di == 0) {
								map[j][k-1] = i;
							}else if(di == 1) {
								map[j+1][k] = i;
							}else if(di == 2) {
								map[j][k+1] = i;
							}else {
								map[j-1][k] = i;
							}
							_break = true;
						}
					}
					if(_break) break;
				}
			}
			
			int h1=map.length, h2=0, w1=map.length, w2=0;
			for(int i = 0; i < map.length; i++) {
				for(int j = 0; j < map[0].length; j++) {
					if(map[i][j] != -1) {
						if(w1 > j) w1 = j;
						if(w2 < j) w2 = j;
						if(h1 > i) h1 = i;
						if(h2 < i) h2 = i;
					}
				}
			}
			System.out.println((w2-w1+1) + " " + (h2-h1+1));
		}
	}
	
}

