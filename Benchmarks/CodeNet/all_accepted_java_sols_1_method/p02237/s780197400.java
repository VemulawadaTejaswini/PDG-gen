import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int N = 100;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] M = new int[N][N];
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				M[i][j] = 0;
		
		for(int i=0;i<n;i++){
			String[] next = br.readLine().split(" ");
			for(int j=0;j<Integer.parseInt(next[1]);j++){
				M[i][Integer.parseInt(next[j+2])-1] = 1;
			}
		}
		for(int i=0;i<n;i++){
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<n;j++){
				if(M[i][j]==0)
					sb.append("0 ");
				else
					sb.append("1 ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}