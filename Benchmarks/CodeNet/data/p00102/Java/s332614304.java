import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while(!(str=br.readLine()).equals("0")){
			int n=Integer.parseInt(str);
			int mat[][] = new int[n+1][n+1];


			for(int i=0; i<n; i++){
				str = br.readLine();
				String strArray[] = str.split(" ");

				for(int j=0; j<n; j++){
					int f = Integer.parseInt(strArray[j]);
					mat[i][j] = f;
					mat[n][j] += f;
					mat[i][n] += f;
					mat[n][n] += f;
				}

			}
			for(int i=0; i<=n; i++){
				for(int j=0; j<=n; j++){
					System.out.printf("%5d",mat[i][j]);
				}
				System.out.println();
			}
		}
	}
}