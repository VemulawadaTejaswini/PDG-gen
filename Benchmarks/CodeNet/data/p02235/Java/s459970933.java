import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	
	final static int INF = 1001;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[INF];
		char[] x = new char[INF];
		char[] y = new char[INF];
		
		for(int i = 0; i < n; i++){
			String str = br.readLine();
			String str2 = br.readLine();
			x = str.toCharArray();
			y = str2.toCharArray();
			A[i] = LCS(x, y);
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(A[i]);
		}
	}
	
	public static int LCS(char[] x, char[] y){
		int[][] a = new int[INF][INF];
		int m = x.length;
		int n = y.length;
		
		for(int i = 1; i <= m; i++){
			for(int j = 1; j <= n; j++){
				if(x[i - 1] == y[j - 1]){
					a[i][j] = a[i - 1][j - 1] + 1;
				}else if(a[i - 1][j] >= a[i][j - 1]){
					a[i][j] = a[i - 1][j];
				}else{
					a[i][j] = a[i][j - 1];
				}
			}
		}
		
		return a[m][n];
	}
}