import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = buf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int[][] A = new int[n][m];
		int[] B = new int[m];
		int[] C = new int[n];

		for(int i=0; i<n; i++){
			str = buf.readLine().split(" ");
			for(int j=0; j<m; j++){
				A[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int i=0; i<m; i++){
			B[i] = Integer.parseInt(buf.readLine());
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