import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[n+1][n+1];
		
		for(int i = 0; i <= n; i++){
			Arrays.fill(matrix[i], 0);
		}
		for(int i = 1 ; i <= n; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			for(int j = 2 ; j < tmpArray.length ; j++){
				int tmp = Integer.parseInt(tmpArray[j]);
				matrix[i][tmp] = 1;
			}
		}
		
		for(int i = 1; i <= n; i++){
			for(int j = 1 ; j <= n ; j++){
				if(j == 1){
					System.out.print(matrix[i][j]);
				}
				else {
					System.out.print(" "+matrix[i][j]);
				}
			}
			System.out.println();
		}
	}

}