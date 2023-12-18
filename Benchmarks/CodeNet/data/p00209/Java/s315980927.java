
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			
			int[][] map = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					map[i][j] = sc.nextInt();
				}
			}
			
			int[][] pict = new int[m][m];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					pict[i][j] = sc.nextInt();
				}
			}
			
			int[][] pict90 = new int[m][m];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					pict90[i][j] = pict[(m - 1) - j][i];
				}
			}
			
			int[][] pict180 = new int[m][m];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					pict180[i][j] = pict90[(m - 1) - j][i];
				}
			}
			
			int[][] pict270 = new int[m][m];
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					pict270[i][j] = pict180[(m - 1) - j][i];
				}
			}
			
			int count = 0;
			int[][][] order = new int[4][][];
			boolean p = false,p_90 = false,p_180 = false,p_270 = false;
			END_O:
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					if(count >= 4){
						break END_O;
					}
					
					if(!p && pict[i][j] != -1){
						p = true;
						order[count] = pict;
						count++;
					}
					
					if(!p_90 && pict90[i][j] != -1){
						p_90 = true;
						order[count] = pict90;
						count++;
					}
					
					if(!p_180 && pict180[i][j] != -1){
						p_180 = true;
						order[count] = pict180;
						count++;
					}
					
					if(!p_270 && pict270[i][j] != -1){
						p_270 = true;
						order[count] = pict270;
						count++;
					}
				}
			}
			
			boolean flag = false;
			END_2:
			for(int i = 0; i < (n - m + 1); i++){
				for(int j = 0; j < (n - m + 1); j++){
					
					for(int[][] window : order){
						boolean found = true;
						
						END:
						for(int k = 0; k < m; k++){
							for(int l = 0; l < m; l++){
								if(window[k][l] == -1){
									continue;
								}
								
								if(window[k][l] != map[i+k][j+l]){
									found = false;
									break END;
								}
							}
						}
						
						if(found){
							flag = true;
							for(int k = 0; k < m; k++){
								for(int l = 0; l < m; l++){
									if(window[k][l] == -1){
										continue;
									}
									
									System.out.println((j+l+1) + " " + (i+k+1));
									break END_2;
								}
							}
							
						}
						
					}
					
				}
			}
			
			if(!flag){
				System.out.println("NA");
			}
			
		}
		
	}

}