import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		int n, b,f,r,v;
		String[] list;
		int[][][] building;
		StringBuilder builder = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		building = new int[4][3][10];
		for(int i=0; i<n; i++){
			list = br.readLine().split(" ");
			b = Integer.parseInt(list[0]);
			f = Integer.parseInt(list[1]);
			r = Integer.parseInt(list[2]);
			v = Integer.parseInt(list[3]);
			building[b - 1][f - 1][r - 1] += v;
		}
		for(int i = 0; i < 4; i++){
			if(i != 0)builder.append("####################\n");
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					builder.append(" " + building[i][j][k]);
				}
				builder.append("\n");
			}
		}
		builder.delete(builder.length() -1 , builder.length());
		System.out.println(builder);
		br.close();
	}
}