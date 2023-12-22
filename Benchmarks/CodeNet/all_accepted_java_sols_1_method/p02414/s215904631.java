import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = buf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int l = Integer.parseInt(str[2]);
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];

		for(int i=0; i<n; i++){
			str = buf.readLine().split(" ");
			for(int j=0; j<m; j++){
				A[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int i=0; i<m; i++){
			str = buf.readLine().split(" ");
			for(int j=0; j<l; j++){
				B[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				for(int k=0; k<m; k++)
					C[i][j] += A[i][k]*B[k][j];
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<l; j++){
				System.out.print(C[i][j]);
				if(j!=(l-1))
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}