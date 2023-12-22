import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] sarray = line.split(" ", -1);
		int n = Integer.parseInt(sarray[0]);
		int m = Integer.parseInt(sarray[1]);
		int matrix[][] = new int[n][m];
		for(int i = 0; i < n; i++){
			String str = reader.readLine();
			String[] mat = str.split(" ", -1);
			for(int j = 0; j < m; j++){
				matrix[i][j] = Integer.parseInt(mat[j]);
			}
		}
		int vector[] = new int[m];
		for(int k = 0; k < m; k++){
			String vec = reader.readLine();
			vector[k] = Integer.parseInt(vec); //j<m k<m
		}
		int result[] = new int[n];
		for(int p = 0; p < n; p++){
			for(int q = 0; q < m; q++){
				result[p] += matrix[p][q]*vector[q];
			}
			System.out.println(result[p]);
		}
	}
}