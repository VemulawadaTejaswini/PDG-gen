import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] sarray = line.split(" ", -1);
		int n = Integer.parseInt(sarray[0]);//?????°
		int m = Integer.parseInt(sarray[1]);//?????°
		int matrix[][] = new int[n + 1][m + 1];
		for(int i = 0; i < n; i++){//?????????????????????
			String str = reader.readLine();
			String[] mat = str.split(" ", -1);
			for(int j = 0; j < m; j++){
				matrix[i][j] = Integer.parseInt(mat[j]);
				while(i == 0){
					matrix[n][j] = 0;
					break;
				}
			}
			matrix[i][m] = 0;
		}
		matrix[n][m] = 0;
		for(int k = 0; k < n; k++){
			for(int l = 0; l < m; l++){
				matrix[k][m] += matrix[k][l];//??????????¨?
			}
		}
		for(int p = 0; p < m; p++){
			for(int q = 0; q < n; q++){
				matrix[n][p] += matrix[q][p];//??????????¨?
				while(p == 0){
					matrix[n][m] += matrix[q][m];
					break;
				}
			}
		}
		for(int r = 0; r < n + 1; r++){
			for(int s = 0; s < m; s++){
				System.out.print(matrix[r][s] + " ");
			}
			System.out.println(matrix[r][m]);
		}
	}
}