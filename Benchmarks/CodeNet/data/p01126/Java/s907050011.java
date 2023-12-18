import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		String str[];
		int n, m, a, x, y, z, h;
		while(true){
			str = reader.readLine().split(" ");
			n = Integer.valueOf(str[0]);
			m = Integer.valueOf(str[1]);
			a = Integer.valueOf(str[2]) - 1;
			if((n|m|a) == 0) break;
			
			h = 0;
			int node[][] = new int[n][1000];
			for(int i = 0; i < m; i++){
				str = reader.readLine().split(" ");
				x = Integer.valueOf(str[0]) - 1;
				y = Integer.valueOf(str[1]) - 1;
				z = Integer.valueOf(str[2]) - 1;
				
				node[x][z] = y;
				node[y][z] = x;
				h = Math.max(h, z);
			}
			for(; h >= 0; h--){
				if(node[a][h] != 0) a = node[a][h];
			}
			System.out.println(a + 2);
		}
		reader.close();
	}
}