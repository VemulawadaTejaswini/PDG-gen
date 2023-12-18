
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int[][] A = new int[n][m];
		int[] B = new int[m];
		int[] C = new int[n];

		for(int i=0; i<n; i++){
			str = br.readLine().split(" ");
			for(int j=0; j<m; j++){
				A[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int i=0; i<m; i++){
			B[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				C[i] += A[i][j]*B[j];
				//System.out.print(A[i][j]);
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(C[i]);
		}
	}
}