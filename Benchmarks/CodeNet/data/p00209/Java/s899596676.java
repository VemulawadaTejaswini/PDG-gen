
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
			
			boolean is_na= true;
			for(int i = 0; i < (n - m); i++){
				for(int j = 0; j < (n - m); j++){
					boolean flag = true;
					for(int k = 0; k < m; k++){
						for(int l = 0; l < m; l++){
							if(pict[k][l] == -1){
								continue;
							}
							
							if(pict[k][l] != map[i+k][j+l]){
								flag = false;
								break;
							}
						}
						
						if(!flag){
							break;
						}
					}
					
					if(flag){
						is_na = false;
						END:
						for(int k = 0; k < m; k++){
							for(int l = 0; l < m; l++){
								if(pict[k][l] == -1){
									continue;
								}
								
								System.out.println((j+l+1) + " " + (i+k+1));
								break END;
								
							}
						}
						
						break;
					}
					
					
					flag = true;
					for(int k = 0; k < m; k++){
						for(int l = 0; l < m; l++){
							if(pict90[k][l] == -1){
								continue;
							}
							
							if(pict90[k][l] != map[i+k][j+l]){
								flag = false;
								break;
							}
						}
						
						if(!flag){
							break;
						}
					}
					
					if(flag){
						is_na = false;
						END:
						for(int k = 0; k < m; k++){
							for(int l = 0; l < m; l++){
								if(pict90[k][l] == -1){
									continue;
								}
								
								System.out.println((j+l+1) + " " + (i+k+1));
								break END;
							}
						}
						break;
					}
					
					flag = true;
					for(int k = 0; k < m; k++){
						for(int l = 0; l < m; l++){
							if(pict180[k][l] == -1){
								continue;
							}
							
							if(pict180[k][l] != map[i+k][j+l]){
								flag = false;
								break;
							}
						}
						
						if(!flag){
							break;
						}
					}
					
					if(flag){
						is_na = false;
						END:
						for(int k = 0; k < m; k++){
							for(int l = 0; l < m; l++){
								if(pict180[k][l] == -1){
									continue;
								}
								
								System.out.println((j+l+1) + " " + (i+k+1));
								break END;
								
							}
						}
						break;
					}
					
					flag = true;
					for(int k = 0; k < m; k++){
						for(int l = 0; l < m; l++){
							if(pict270[k][l] == -1){
								continue;
							}
							
							if(pict270[k][l] != map[i+k][j+l]){
								flag = false;
								break;
							}
						}
						
						if(!flag){
							break;
						}
					}
					
					if(flag){
						is_na = false;
						END:
						for(int k = 0; k < m; k++){
							for(int l = 0; l < m; l++){
								if(pict270[k][l] == -1){
									continue;
								}
								
								System.out.println((j+l+1) + " " + (i+k+1));
								break END;
								
							}
						}
						break;
					}
					
					if(!is_na){
						break;
					}
				}
				
				if(!is_na){
					break;
				}
				
			}
			
			if(is_na){
				System.out.println("NA");
			}
		}
		
	}

}