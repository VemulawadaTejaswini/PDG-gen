import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		int l = Integer.parseInt(tmpArray[2]);
		
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		int[][] c = new int[n][l];
		
		for(int i = 0; i < n; i ++){
			tmpArray = br.readLine().split(" ");
			for(int j = 0; j < m; j++){
				a[i][j] = Integer.parseInt(tmpArray[j]);
			}
		}

		for(int i = 0; i < m; i ++){
			tmpArray = br.readLine().split(" ");
			for(int j = 0; j < l; j++){
				b[i][j] = Integer.parseInt(tmpArray[j]);
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				for(int k = 0; k < m; k++){
					c[i][j] += a[i][k]*b[k][j];
				}
				
				if(j != 0 ){
					System.out.print(" ");
				}
				System.out.print(c[i][j]);
			}
			System.out.println();
		}


	}

}