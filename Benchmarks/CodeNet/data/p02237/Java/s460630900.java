import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] a = new int[n+1][n+1];
		for(int i = 0; i < n; i++) {
			
			String[] str = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			for(int j = 2; j < str.length; j++){
				a[u][Integer.parseInt(str[j])] = 1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(j > 1){
					sb.append(" ");
				}
				sb.append(a[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}