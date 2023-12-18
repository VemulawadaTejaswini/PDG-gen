import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[][][] oh = new int [4][3][10];
		for(int i = 0; i < n; i++){
			String[] line =  br.readLine().split(" ");
			int b = Integer.parseInt(line[0]);
			int f = Integer.parseInt(line[1]);
			int r = Integer.parseInt(line[2]);
			int v = Integer.parseInt(line[3]);
			b--;
			f--;
			r--;
			if( v < 0) v = 0;
			if( v > 9) v = 9;
			oh[b][f][r] = v;
		}
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					sb.append(oh[i][j][k]).append(" ");
				}
				sb.append("\n");
			}
			if(i < 3)sb.append("####################").append("\n");
		}
		System.out.print(sb);
	}
}