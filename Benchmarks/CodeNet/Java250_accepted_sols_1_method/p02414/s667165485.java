import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] sarray = line.split(" ", -1);
		int n = Integer.parseInt(sarray[0]);
		int m = Integer.parseInt(sarray[1]);
		int l = Integer.parseInt(sarray[2]);
		int matrixA[][] = new int[n][m];
		int matrixB[][] = new int[m][l];
		long matrixC[][] = new long[n][l];
		for(int i = 0; i < n; i++){//??????A???????????????
			String str = reader.readLine();
			String[] mat = str.split(" ", -1);
			for(int j = 0; j < m; j++){
				matrixA[i][j] = Integer.parseInt(mat[j]);
			}
		}
		for(int i = 0; i < m; i++){//??????B???????????????
			String str = reader.readLine();
			String[] mat = str.split(" ", -1);
			for(int j = 0; j < l; j++){
				matrixB[i][j] = Integer.parseInt(mat[j]);
			}
		}
		for(int i = 0; i < n; i++){//??????C????????????
			for(int j = 0; j < l; j++){
				matrixC[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++){//??????A,??????B??????
			for(int j = 0; j < l; j++){
				for(int k = 0; k < m; k++){
					matrixC[i][j] += matrixA[i][k]*matrixB[k][j];
				}
				System.out.print(matrixC[i][j]);
				if(j != l - 1){
					System.out.print(" ");
				}else{
					System.out.println();
				}
			}
		}
	}
}