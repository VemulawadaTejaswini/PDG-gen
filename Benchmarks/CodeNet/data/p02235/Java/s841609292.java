import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			// data set i
			char[] a = br.readLine().toCharArray();
			char[] b = br.readLine().toCharArray();

			System.out.println(commonSub(a, b));
		}

	}
	public static int commonSub(char[] a, char[] b){
		int n = a.length;
		int m = b.length;
		int[][] len = new int[n+1][m+1];
		for(int i = 1; i <= n; ++i){
			for(int j = 1; j <= m; ++j) {
				if(a[i-1] == b[j-1]){
					len[i][j] = len[i-1][j-1] + 1;
				}else if(len[i-1][j] > len[i][j-1]){
					len[i][j] = len[i-1][j];
				}else{
					len[i][j] = len[i][j-1];
				}
			}
		}
		return len[n][m];
	}
}