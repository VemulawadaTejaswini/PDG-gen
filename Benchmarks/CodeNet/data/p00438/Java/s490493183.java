import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int h, w, n, c, v;
		
		while(!(string = reader.readLine()).equals("0 0")){
			h = Integer.parseInt(string.split(" ")[0]);
			w = Integer.parseInt(string.split(" ")[1]);
			
			int[][] array = new int[h + 1][w + 1];
			boolean[][] imp = new boolean[h + 1][w + 1];
			
			n = Integer.parseInt(reader.readLine());
			for(int i = 0; i < n; i++){
				string = reader.readLine();
				c = Integer.parseInt(string.split(" ")[0]);
				v = Integer.parseInt(string.split(" ")[1]);
				imp[c][v] = true;
			}
			
			array[1][1] = 1;
			for(int i = 1; i <= h; i++){
				for(int j = 1; j <= w; j++){
					if(!imp[i][j]){
						array[i][j] = i == 1 && j == 1 ? 1 : array[i][j - 1] + array[i - 1][j];
					}else{
						array[i][j] = 0;
					}
				}
			}
			System.out.println(array[h][w]);
		}
		reader.close();
	}
}