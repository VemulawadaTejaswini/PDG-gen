import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] elm = br.readLine().split(" ");
		int n = Integer.parseInt(elm[0]);
		int m = Integer.parseInt(elm[1]);
		int l = Integer.parseInt(elm[2]);
		int[][] mata = new int[n][m];
		int[][] matb = new int[m][l];
		long[][] ans = new long[n][l];
		for(int i = 0; i < n ; i++){
			String[] line = br.readLine().split(" ");
			for(int j = 0; j < m ; j++){
				mata[i][j] = Integer.parseInt(line[j]);
			}
		}
		for(int i = 0; i < m ; i++){
			String[] line = br.readLine().split(" ");
			for(int j = 0; j < l ; j++){
				matb[i][j] = Integer.parseInt(line[j]);
			}
		}
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < l ; j++){
				for(int k = 0; k < m; k++){
					ans[i][j] += mata[i][k] * matb[k][j];
				}
				sb.append(ans[i][j]);
				if( j != l-1) sb.append(" ");
				//System.out.print(ans[i][j]+" ");
			}
			sb.append("\n");
			//System.out.println();
		}
		System.out.print(sb);
	}
}