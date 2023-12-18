import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int ary[];
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		
		int n = Integer.valueOf(reader.readLine());
		
		int mat[][] = new int[n][n];
		int sum[][] = new int[n + 1][n + 1];
		
		app.input(reader.readLine());
		mat[0][0] = sum[1][1] = ary[0];
		for(int i = 1; i < n; i++){
			mat[0][i] = ary[i];
			sum[1][i + 1] = mat[0][i] + sum[1][i];
		}
		for(int i = 1; i < n; i++){
			app.input(reader.readLine());
			for(int j = 0; j < n; j++){
				mat[i][j] = ary[j] + mat[i - 1][j];
				
				if(j > 0){
					sum[i + 1][j + 1] = mat[i][j] + sum[i + 1][j];
				}else{
					sum[i + 1][1] = mat[i][j];
				}
			}
		}
		
		int S, max = -99999;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				for(int w = 1; w <= i; w++){
					for(int h = 1; h <= j; h++){
						S = sum[i][j] - sum[i - w][j] - sum[i][j - h] + sum[i - w][j - h];
						max = Math.max(max, S);
					}
				}
			}
		}
		System.out.println(max);
		
		reader.close();
	}
	
	public void input(String source){
		String str[] = source.split(" ");
		ary = new int[str.length];
		for(int i = 0; i < str.length; i++){
			ary[i] = Integer.valueOf(str[i]);
		}
	}
}