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
		int[][] mat = new int[n][m];
		int[] vct = new int[m]; 
		int[] ans = new int[n];
		for(int i = 0; i < n ; i++){
			String[] line = br.readLine().split(" ");
			for(int j = 0; j < m ; j++){
				mat[i][j] = Integer.parseInt(line[j]);
			}
		}
		for(int i = 0; i < m ; i++){
			vct[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < m ; j++){
				ans[i] += mat[i][j] * vct[j];
			}
		System.out.println(ans[i]);
		}
	}
}