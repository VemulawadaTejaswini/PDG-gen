import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		
		//n*m???????????£??\
		int[][]  aryA = new int[n][m];
		for(int ai = 0; ai < n; ai++){
			for(int aj = 0; aj < m; aj++){
				aryA[ai][aj] = scan.nextInt();
			}
		}
		//m*l???????????£??\
		int[][] aryB = new int[m][l];
		for(int bi = 0; bi < m; bi++ ){
			for(int bj = 0; bj < l; bj++){
				aryB[bi][bj] = scan.nextInt();
			}
		}
		scan.close();
		//n*l????????????????????£??\
		long[][] aryC = new long[n][l];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				for(int k = 0; k < m; k++){
					aryC[i][j] += aryA[i][k] * aryB[k][j]; 					
				}				
			}
		}
		
		//??????
		for(int ci = 0; ci < n; ci++){
		 for(int cj = 0; cj < l; cj++){
			 System.out.print(aryC[ci][cj]);
			 if(cj != l-1){
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
		}
		
	}

}