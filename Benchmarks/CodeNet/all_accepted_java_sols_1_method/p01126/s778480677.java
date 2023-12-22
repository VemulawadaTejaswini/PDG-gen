import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		String str[];
		int n, m, a, x, y, z;
		while(true){
			str = reader.readLine().split(" ");
			n = Integer.valueOf(str[0]);
			m = Integer.valueOf(str[1]);
			a = Integer.valueOf(str[2]);
			if((n|m|a) == 0) break;
			
			int node[][] = new int[n+1][1001];
			for(int i = 0; i < m; i++){
				str = reader.readLine().split(" ");
				x = Integer.valueOf(str[0]);
				y = Integer.valueOf(str[1]);
				z = Integer.valueOf(str[2]);
				
				node[y][x] = z;
				node[z][x] = y;
			}
			for(int h = 1000; h >= 0; h--){
				if(node[a][h] != 0) a = node[a][h];
			}
			System.out.println(a);
		}
		reader.close();
	}
}