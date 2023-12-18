import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] token = br.readLine().split(" ");
		int n = Integer.parseInt(token[0]);
		int m = Integer.parseInt(token[1]);
		int l = Integer.parseInt(token[2]);
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];

		for(int i = 0; i < n; i++){

			token = br.readLine().split(" ");

			for(int j = 0; j < m; j++){
				a[i][j] = Integer.parseInt(token[j]);
			}

		}

		for(int i = 0; i < m; i++){

			token = br.readLine().split(" ");

			for(int j = 0; j < l; j++){
				b[i][j] = Integer.parseInt(token[j]);
			}

		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){

				long ans = 0;

				for(int k = 0; k < m; k++){
					ans += a[i][k] * b[k][j];
				}

				System.out.print(ans);

				if(j != l - 1){
					System.out.print(" ");
				}else{
					System.out.print("\n");
				}

			}
		}

	}
}