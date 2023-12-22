import java.io.*;
import java.io.IOException;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int  n
			,m;
		
		String[] input = new String[100];
		
		try{
			//n,mの入力
			input = br.readLine().split("[\\s]+");
			n = Integer.parseInt(input[0]);
			m = Integer.parseInt(input[1]);
			
			int[][] A = new int[n][m]; 
			int[] b = new int[m];
			
			//Aの入力
			for(int i=0;i<n;i++){
				input = br.readLine().split("[\\s]+");
				for(int j=0;j<m;j++){
					A[i][j] = Integer.parseInt(input[j]);
				}
			}
			
			//bの入力
			for(int j=0;j<m;j++){
				b[j] = Integer.parseInt(br.readLine());
			}
			//計算・出力
			int c = 0;
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					c += A[i][j] * b[j];
				}
				System.out.println(c);
				c = 0;
			}
		}catch(IOException e){
			System.out.println(e);
			return;
		}
		
	}
}

