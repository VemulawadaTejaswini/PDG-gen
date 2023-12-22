import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] moves = new int[h][w];
		int[][] map = new int[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				if (s.charAt(j) == '#')
					map[i][j] = 1;
				else
					map[i][j] = 0;
			}
		}

		for(int i=0; i<h; i++){
			int count = 0;
			for(int j=0; j<w; j++){
				if(map[i][j] == 0){
					count++;
					if(j==w-1){
						int k = j;
						while(k>=0 && map[i][k] == 0){
							moves[i][k] = count;
							k--;
						}
					}
				} else {
					int k = j-1;
					while(k>=0 && map[i][k] == 0){
						moves[i][k] = count;
						k--;
					}
					count = 0;
				}
			}
		}

		for(int i=0; i<w; i++){
			int count = 0;
			for(int j=0; j<h; j++){
				if(map[j][i] == 0){
					count++;
					if(j==h-1){
						int k = j;
						while(k>=0 && map[k][i] == 0){
							moves[k][i] += count;
							k--;
						}
					}
				} else {
					int k = j-1;
					while(k>=0 && map[k][i] == 0){
						moves[k][i] += count;
						k--;
					}
					count = 0;
				}
			}
		}
		int ans = 0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				ans = Math.max(ans, moves[i][j]-1);
			}
		}
		System.out.println(ans);
	}
}
