import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] line = br.readLine().split(" ");
		int r = Integer.parseInt(line[0]);
		int c = Integer.parseInt(line[1]);
		int[][] rc = new int[r+1][c+1];
		for(int i = 0; i < r; i++){
			String[] str =br.readLine().split(" ");
			for(int j = 0; j < c; j++){
				rc[i][j] = Integer.parseInt(str[j]);
				rc[i][c] +=  Integer.parseInt(str[j]);
			}
		}
		for(int i = 0; i < c+1; i++){
			for(int j = 0; j < r; j++){
				rc[r][i] += rc[j][i];
			}
		}
		for(int i = 0; i < r+1; i++){
			for(int j = 0; j < c+1; j++){
				//System.out.print(rc[i][j]+" ");
				sb.append(rc[i][j]);
        if(j != c) sb.append(" ");
			}
			//System.out.println();
			sb.append("\n");
		}
		System.out.print(sb);
		
	}
}