import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, a, b, max;
		
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.valueOf(string);
			max = 0;
			int Caliburne[] = new int[]{0, 1 << 29};
			int cost[][] = new int[10][10];
			for(int i = 0; i < 10; i++){ Arrays.fill(cost[i], 1 << 29); }
			for(int i = 0; i < n; i++){
				String str[] = reader.readLine().split(" ");
				a = Integer.valueOf(str[0]);
				b = Integer.valueOf(str[1]);
				max = Math.max(max, Math.max(a, b));
				cost[a][b] = cost[b][a] = Integer.valueOf(str[2]);
			}
			for(int k = 0; k < 10; k++){
				for(int i = 0; i < 10; i++){
					for(int j = 0; j < 10; j++){
						cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
					}
				}
			}
			for(int i = 0; i <= max; i++){ cost[i][i] = 0; }
			int res[] = new int[max + 1];
			for(int i = 0; i <= max; i++){
				for(int j = 0; j <= max; j++){
					res[i] += cost[i][j];
				}
				if(res[i] < Caliburne[1]){
					Caliburne[1] = res[i];
					Caliburne[0] = i;
				}
			}
			System.out.println(Caliburne[0] + " " + Caliburne[1]);
		}
		reader.close();
	}
}