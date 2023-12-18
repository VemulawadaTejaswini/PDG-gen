import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	static final int ROW = 0;
	static final int COLUMN = 1;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[n + 1][2];

		for(int i = 1; i < n + 1 ; i++){
			String[] tmpArray = br.readLine().split(" ");
			matrix[i][ROW] = Integer.parseInt(tmpArray[ROW]);
			matrix[i][COLUMN] = Integer.parseInt(tmpArray[COLUMN]);
		}
		
		int[][] DPResult = new int[n + 1][n + 1];
		for(int i = 0 ; i < n + 1; i++){
			Arrays.fill(DPResult[i], 0);
		}
		
		//DP??§?¨??????§????????°????????????
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n - i ;j++){
				int currentI = j;
				int currentJ = i + j;
				if( currentI + 1 == currentJ ){
					//DPResult[i][j] = matrix[j][ROW]*matrix[j][COLUMN]*matrix[j + 1][COLUMN];
					DPResult[currentI][currentJ] = matrix[currentI][ROW] * matrix[currentI][COLUMN] * matrix[currentI + 1][COLUMN];
				}
				else {
					int tmpResult = Integer.MAX_VALUE;
					
					for(int k = currentI ; k < currentJ ; k++){
						int tmp;
						//System.out.println("I "+currentI+" J"+currentJ+" k"+k);
						tmp = DPResult[currentI][k] + DPResult[k+1][currentJ] 
								+ matrix[currentI][ROW]*matrix[k][COLUMN]*matrix[currentJ][COLUMN];
						if(tmp < tmpResult){
							tmpResult = tmp;
						}
						
						DPResult[j][j+i] = tmpResult;
					}
					
				}
			}
			
		}
		
		//TEST PRINT
		/*
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ;j++){
				System.out.print(DPResult[i][j] + " ");
			}
			System.out.println();
		}*/
		System.out.println(DPResult[1][n]);
	}

}